package com.example.basicknowledge;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by WHZ on 2017/5/21.
 */

@Target(ElementType.TYPE) @Retention(RetentionPolicy.CLASS)
public @interface Factory {


    Class type();

    String id();
}
