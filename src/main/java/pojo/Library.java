package pojo;

public class Library {
    public static void main(String[] args) {
        Book programingBook = new Book("Java 9.0 to 17.0", 618);
        Book javaEducation = new Book("Mastering Java", 657);
        Book javaClean = new Book("Clean code", 327);
        Book environment = new Book("Beginning Intellij IDEA", 283);
        Book webDevWithJava = new Book("Java for Web Development", 2353);
        Book softTest = new Book("Effective Software Testing", 329);
        Book[] books = {programingBook, javaEducation, javaClean, environment, webDevWithJava, softTest};
        for (int index = 0; index < books.length; index++) {
            System.out.printf("name: %-27s pages: %-10s %n", books[index].getName(), books[index].getPages());
        }
        System.out.println();
        Book pr;
        pr = books[0];
        books[0] = books[3];
        books[3] = pr;
        for (int index = 0; index < books.length; index++) {
            System.out.printf("name: %-27s pages: %-10s %n", books[index].getName(), books[index].getPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            if ("Clean code".equals(books[index].getName())) {
                System.out.printf("name: %-27s pages: %-10s %n", books[index].getName(), books[index].getPages());
            }
        }
    }
}
