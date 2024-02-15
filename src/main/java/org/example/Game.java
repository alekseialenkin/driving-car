package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private static int x = 0;
    private static int y = 0;
    private static int direction = 0;

    public static void move(Field field) {
        switch (direction) {
            case 0:
                if (y > 0) {
                    y--;
                }
                break;
            case 1:
                if (x < field.getLength() - 1) {
                    x++;
                }
                break;
            case 2:
                if (y < field.getHeight() - 1) {
                    y++;
                }
                break;
            case 3:
                if (x > 0) {
                    x--;
                }
                break;
        }
    }

    public static int[] makeTurn(Field field) {
        int[] result = new int[2];
        for (int i = 0; i < field.getCommands().size(); i++) {
            String command = field.getCommands().get(i);
            switch (command) {
                case "go" -> {
                    move(field);
                    direction = 0;
                }
                case "left" -> direction = (direction + 3) % 4;
                case "right" -> direction = (direction + 1) % 4;
                default -> System.out.println("Неизвестная команда");
            }
        }
        result[0] = x;
        result[1] = y;
        return result;
    }

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