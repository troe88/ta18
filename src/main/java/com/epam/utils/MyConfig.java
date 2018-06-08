package com.epam.utils;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.Sources;

@Sources("classpath:my.properties")
public interface MyConfig extends Config {

    @Key("my.property")
    String myProperty();
}
