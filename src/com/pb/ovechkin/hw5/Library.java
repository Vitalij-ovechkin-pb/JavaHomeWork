package com.pb.ovechkin.hw5;


public class Library {
    private static Book[] books = new Book[10];

    private static int indexBook = 0;

    private static Reader[] readers = new Reader[10];

    private static int indexReader = 0;

    public static void main(String[] args) {
        Book book1 = new Book("Приключения", "Иванов И. И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А. В.", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);

        Reader reader1 = new Reader("Петров В. В.", 1, "Информационных технологий", "30.07.1989", "0631234567");
        Reader reader2 = new Reader("Иванов И. И.", 2, "Экономический", "04.10.1984", "0501234567");
        Reader reader3 = new Reader("Сидоров С. С.", 3, "Механико-математический", "15.10.1993", "0671234567");


        addBook(book1); addBook(book2); addBook(book3);


        addReader(reader1); addReader(reader2); addReader(reader3);


        System.out.println("Все книги");
        printAllBooks();

        System.out.println("\nВсе читатели ");

        printAllReaders();

        System.out.println("\nВсе варианты метода takeBook");
        reader1.takeBook(3);
        reader2.takeBook(book1.getTitle(), book3.getTitle(), book2.getTitle());
        reader3.takeBook(book2, book1, book3);

        System.out.println("\nВсе варианты метода returnBook");
        reader2.returnBook(5);
        reader3.returnBook(book3.getTitle(), book2.getTitle(), book1.getTitle());
        reader1.returnBook(book1, book2, book3);
    }

    private static void addBook(Book book) {
        books[indexBook++] = book;
    }

    private static void addReader(Reader reader) {
        readers[indexReader++] = reader;
    }

    public static void printAllBooks() {
        System.out.println("Книги:");
        for (int i = 0; i < indexBook; i++) {
            System.out.println(" - " + books[i]);
        }
    }

    public static void printAllReaders() {
        System.out.println("Читатели:");
        for (int i = 0; i < indexReader; i++) {
            System.out.println(" - " + readers[i]);
        }
    }
}