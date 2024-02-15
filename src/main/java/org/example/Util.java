package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<String> readFile(String name) {
        List<String> parameters = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(name))) {
            String line = bf.readLine();
            while (line != null) {
                parameters.add(line);
                line = bf.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return parameters;
    }

    public static Field makeNewField(List<String> parameters) {
        if (!parameters.isEmpty()) {
            int length = Integer.parseInt(parameters.get(0));
            int height = Integer.parseInt(parameters.get(1));
            int startLength = Integer.parseInt(parameters.get(2));
            int startHeight = Integer.parseInt(parameters.get(3));
            return new Field(length, height, startLength, startHeight, parameters.subList(4, parameters.size()));
        } else {
            throw new RuntimeException("Параметры в файле не найдены");
        }
    }
}
