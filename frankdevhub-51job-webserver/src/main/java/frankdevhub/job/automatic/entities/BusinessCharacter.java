package frankdevhub.job.automatic.entities;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * <p>Title:@ClassName BusinessCharacter.java</p>
 * <p>Copyright: Copyright (c) 2020</p>
 * <p>Company: www.frankdevhub.site</p>
 * <p>github: https://github.com/frankdevhub</p>
 *
 * @Author: frankdevhub@gmail.com
 * @CreateDate: 2020/1/28 23:49
 * @Version: 1.0
 */

@Slf4j
@SuppressWarnings("all")
public class BusinessCharacter {
    private Character value; // 字符名称
    private Boolean isCN_Character; // 是否是中文简体字符
    private Boolean isTW_Character; // 是否是台湾地区繁体字符
    private Boolean isEN_Character;  // 是否是英文字符
    private Boolean isENCapital; // 是否是英语字符
    private Boolean isNumericCharacter; // 是否是数值类计量字符
    private Boolean isSymbolCharacter; // 是否是象形字符
    private Map<String, Boolean> attributes; // 字符属性集合

    @Override
    public String toString() {

        return "BusinessCharacter{" +
                "value=" + value +  //字符
                ", isCN_Character=" + isCN_Character + // 是否是中文简体字福
                ", isTW_Character=" + isTW_Character + // 是否是台湾地区繁体字符
                ", isEN_Character=" + isEN_Character + // 是否是英文字符
                ", isENCapital=" + isENCapital +  // 是否是英语字符
                ", isNumericCharacter=" + isNumericCharacter + // 是否是数值类计量字符
                ", isSymbolCharacter=" + isSymbolCharacter + // 是否是象形字符
                ", attributes=" + attributes + // 字符属性集合
                '}';
    }

    /**
     * 获取字符属性
     *
     * @param attributes 字符属性
     * @throws InvocationTargetException,IllegalAccessException
     */
    public BusinessCharacter setAttributes(Map<String, Boolean> attributes) throws InvocationTargetException, IllegalAccessException {
        this.attributes = attributes;
        setAttributes();
        return this;
    }

    /**
     * 获取字符属性
     *
     * @throws InvocationTargetException,IllegalAccessException
     */
    private void setAttributes() throws InvocationTargetException, IllegalAccessException {
        log.info("BusinessCharacter::setAttributes");
        if (null != this.attributes) {
            Class<?> clazz = this.getClass(); //实体对象的类名
            Method[] methods = clazz.getDeclaredMethods(); //实体对象的方法集合
            for (Method m : methods) {
                m.setAccessible(true); //设置方法的可读性
                String name = m.getName(); //配置方法名
                Integer args = m.getParameterCount(); //配置函数参数的个数
                //过滤方法名,判断是否是配置字符属性的方法且含参数
                if (name.contains("Character".trim()) && args == 1) {
                    Boolean value = this.attributes.get(name);
                    log.info("method name: " + name + " value: " + value);
                    //如果没有获取该项配置,则反射调用此方法进行映射
                    if (null != value) {
                        m.invoke(this, value);
                    }
                }
            }
        }
    }

    public Character getValue() {
        return value;
    }

    public BusinessCharacter setValue(Character value) {
        this.value = value;
        return this;
    }

    public Boolean isSimpleChineseCharacter() {
        return isCN_Character;
    }

    public BusinessCharacter isSimpleChineseCharacter(Boolean isCN_Character) {
        this.isCN_Character = isCN_Character;
        return this;
    }

    public Boolean isTaiwaneseCharacter() {
        return isTW_Character;
    }

    public BusinessCharacter isTaiwaneseCharacter(Boolean isTW_Character) {
        this.isTW_Character = isTW_Character;
        return this;
    }

    public Boolean isEnglishCharacter() {
        return isEN_Character;
    }

    public BusinessCharacter isEnglishCharacter(Boolean isEN_Character) {
        this.isEN_Character = isEN_Character;
        return this;
    }

    public Boolean isENCapitalCharacter() {
        return isENCapital;
    }

    public BusinessCharacter isENCapitalCharacter(Boolean isENCapital) {
        this.isENCapital = isENCapital;
        return this;
    }

    public Boolean isNumericCharacter() {
        return isNumericCharacter;
    }

    public BusinessCharacter isNumericCharacter(Boolean isNumericCharacter) {
        this.isNumericCharacter = isNumericCharacter;
        return this;
    }

    public Boolean isSymbolCharacter() {
        return isSymbolCharacter;
    }

    public BusinessCharacter isSymbolCharacter(Boolean isSymbolCharacter) {
        this.isSymbolCharacter = isSymbolCharacter;
        return this;
    }
}
