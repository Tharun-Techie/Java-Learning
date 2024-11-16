package Basic_Concepts;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        
        // Load properties from a file
        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}