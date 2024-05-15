package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Class Name
public class LoadProp {

    static FileInputStream input;
    static Properties prop;

    //Method For Get Property
    public String getProperty(String Key)  {

        prop = new Properties();

        try {
            input = new FileInputStream("src/test/java/Resources/testDataConfig.properties");
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(Key);
    }
}
