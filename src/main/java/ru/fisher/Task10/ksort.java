package ru.fisher.Task10;


public class ksort {

    public String[] items;

    public ksort() {
        // Размер массива исходя из входных данных, строка вида AMN
        // A - это символ из диапазона [abcdefgh], а MN - две цифры [0-9]
        // 8 букв * 10 цифр * 10 цифр
        this.items = new String[800];
    }

    public int index(String s) {
        if (s == null || s.length() != 3) {
            return -1;
        }

        char firstChar = s.charAt(0);
        char secondInd = s.charAt(1);
        char thirdInd = s.charAt(2);

        // Проверяем что 1-й символ это буква из диапазона [abcdefgh]
        if (firstChar < 'a' || firstChar > 'h') {
            return -1;
        }

        // Проверяем что 2-й и 3-й символ это цифра
        if (!Character.isDigit(secondInd) || !Character.isDigit(thirdInd)) {
            return -1;
        }

        int firstDigit = Character.getNumericValue(secondInd);
        int secondDigit = Character.getNumericValue(thirdInd);

        return (firstChar - 'a') * 100 + (firstDigit * 10) + secondDigit;
    }

    public boolean add(String s) {
        int i = index(s);
        if (i == -1) {
            return false;
        }
        items[i] = s;
        return true;
    }

}


