package com.polopoly.ps.log.config;

public class ConfigException extends Exception {

    public ConfigException(String message) {
        super(message);
    }

    public ConfigException(String message, Exception e) {
       super(message,e);
    }
}
