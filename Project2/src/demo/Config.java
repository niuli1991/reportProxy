package demo;

import java.util.ResourceBundle;

public class Config {
    public static String getProperties(String keys)
    {
        String result = null;
       try {
           ResourceBundle rb = ResourceBundle.getBundle("demo.config");
           if (rb != null) {
               result = rb.getString(keys);
           } else {
               result = "";
           }
       } catch (Exception e) {
           if (result == null) {
               result = "";
           }
       }
       return result;
    }
    public Config() {
        super();
    }

    public static void main(String[] args) {
        Config config = new Config();
    }
}
