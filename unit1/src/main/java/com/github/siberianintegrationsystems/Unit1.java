package com.github.siberianintegrationsystems;

public class Unit1 {

    private static final String INPUT_STRING = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
        + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";


    public static void main(String[] args) {
        String result = revertString();
        checkResult(result);
    }

    /**
     * При реализации метода нельзя использовать метод reverse() из класса StringBuilder
     */
    private static String revertString() {
        int length = INPUT_STRING.length();
        int i;
        StringBuilder temp = new StringBuilder();
        for (i = length -1; i >= 0; i--) {
            temp.append(INPUT_STRING.charAt(i));
        }
        return temp.toString();
    }

    private static void checkResult(String result) {
        System.out.println(result);
        if (INPUT_STRING.equals(new StringBuilder(result).reverse().toString())) {
            System.out.println("Строка изменена корректно");
        } else {
            throw new RuntimeException("Ошибка, строка изменена неверно");
        }
    }
}
