package org.example;

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
}