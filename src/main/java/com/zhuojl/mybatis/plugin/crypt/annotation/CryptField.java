package com.zhuojl.mybatis.plugin.crypt.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.zhuojl.mybatis.plugin.crypt.executor.CryptType;

/**
 * 加解密注解
 *
 * @author junliang.zhuo
 * @date 2019-03-29 14:49
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
public @interface CryptField {

    CryptType value() default CryptType.NAME;

    boolean encrypt() default true;

    boolean decrypt() default true;
}

