package com.signalTelecom.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static{
        String path = "Configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path);//opening the file
            properties = new Properties();//initialize the properties file
            properties.load(file);//loading the file
            file.close();//closing the file
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
