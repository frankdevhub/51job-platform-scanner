#!/usr/bin/env python
# -*- coding: UTF-8 -*-
"""
@File ：test_parser.py
@Author ：frankdevhub@gmail.com
@Blog : http://blog.frankdevhub.site
@Date ：2021/2/26 1:17
"""

import unittest
import logging as log

log.basicConfig(level=log.DEBUG)


class TestParser(unittest.TestCase):
    """
    2-3万/月, 测试整数
    2——7万/年, 多个破折号作为间隔
    2——7万/年, 多个破折号作为间隔
    23.9-3万/月", 小数与整数
    12000-15000/月, 默认各位不显示单位的区间范围
    23.0-334.98, 默认没有任何单位显示的区间范围
    """
    range_texts = ['2-3万/月', '2——7万/年', '23.9-3万/月', '12000-15000/月', '23.0-334.98']

    def test_parse_salary_text(self):
        self.fail()

    def test_is_unit_by_thousand(self):
        self.fail()

    def test_is_unit_by_ten_thousand(self):
        self.fail()

    def test_is_unit_by_day(self):
        self.fail()

    def test_is_unit_by_month(self):
        self.fail()

    def test_is_unit_by_year(self):
        self.fail()


if __name__ == '__main__':
    test_suite = unittest.TestSuite()
    runner = unittest.TextTestRunner()
    runner.run(test_suite)
