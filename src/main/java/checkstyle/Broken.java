package checkstyle;

public class Broken {

    public static final String NEW_VALUE = "";

    private static final int SIZE_OF_EMPTY = 10;

    private String name;

    private String surname;

    public Broken() { }

    public void echo() { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) { }
}
