package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String s : value) {
            if (s.equals(key)) {
                rsl = 1;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Key not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"pass"}, "password");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
