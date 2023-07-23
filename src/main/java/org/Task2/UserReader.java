package org.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserReader {
    public static List<User> readUsersFromFile(String filename) {
        List<User> userList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String header = br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                if (values.length == 2) {
                    String name = values[0];
                    int age = Integer.parseInt(values[1]);
                    userList.add(new User(name, age));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userList;
    }
}