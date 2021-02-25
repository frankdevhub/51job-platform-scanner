# !/usr/bin/env python
# encoding: utf-8
# @author: frankdevhub
# @contact: frankdevhub@gmail.com
# @blog: http://blog.frankdevhub.site
# @file: test_character.py
# @time: 2021/2/16 12:03
import inspect
import logging as log
import unittest

from frankdevhub_51job_api.tools.character import CharacterHelper

log.basicConfig(level=log.DEBUG)


class TestCharacterHelper(unittest.TestCase):
    CHARACTER_EXAMPLE = ('1', '各', '时', '個', '詢', 's', '1', '-')

    @staticmethod
    def test_is_simple_chinese_character():
        """测试是否是简体中文字符"""
        for x in TestCharacterHelper.CHARACTER_EXAMPLE:
            log.debug(type(x))
            bool_res = CharacterHelper.is_simple_chinese_character(x)
            assert isinstance(bool_res, bool)
            log.debug(f'test rest: {bool_res}')
        return True

    @staticmethod
    def test_get_instance_methods():
        """测试获取类的函数成员变量"""
        '''
        eg:
         (<function CharacterHelper.character_pattern_match at 0x000001A5D009F3A0>, "<class 'function'>")
         (<function CharacterHelper.is_english_capital_character at 0x0000027B80CBF790>, "<class 'function'>")
        '''
        instance_members = [(obj, type(obj)) for (type_name, obj) in inspect.getmembers(CharacterHelper) if
                            inspect.isfunction(obj)]
        # print(instance_members)
        # log.debug(instance_members)
        test_example = "個"  # 测试使用字符
        for inst in instance_members:
            func = inst[0]
            print(f'function_name: {func.__name__} ,arg_count: {func.__code__.co_argcount}')
            fun_name = func.__name__
            if fun_name.lstrip().startswith('is_'):
                bool_res = func(test_example)
                assert isinstance(bool_res, bool)
                print(bool_res)

        return True


if __name__ == '__main__':
    test_suite = unittest.TestSuite()
    test_suite.addTest(TestCharacterHelper('test_is_simple_chinese_character'))  # test_is_simple_chinese_character
    test_suite.addTest(TestCharacterHelper('test_get_instance_methods'))  # test_get_instance_methods
    runners = unittest.TextTestRunner()
    runners.run(test_suite)
