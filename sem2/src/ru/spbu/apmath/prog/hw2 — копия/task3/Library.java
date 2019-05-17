package ru.spbu.apmath.prog.hw2.task3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String addres;
    List<Book> books = new ArrayList<>();

    public Library(String addres) {
        this.addres = addres;
    }

    // Возращает индекс списка книг по заданному названию
    private int bookIndex(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() == title) {
                return i;
            }
        }
        return -1;
    }

    private void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("Такая книга уже существует");
        } else {
            books.add(book);
            System.out.println("Книга добавлена");
        }
    }

    public static void printOpeningHours() {
        System.out.println("Все библиотеки работают с понедельника по субботу с 9 до 18");
    }

    private void printAddress() {
        System.out.println(this.addres);
    }

    private void borrowBook(String title) {
        int index = bookIndex(title);
        if (index == -1) {
            System.out.println("Такой книги нет в каталоге");
        } else if (books.get(index).isBorrowed()) {
            System.out.println("Книга уже взята");
        } else {
            System.out.println("Книга взята");
            books.get(index).borrowed();
        }
    }


    private void printAvailableBooks() {
        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).isBorrowed()) {
                System.out.println(books.get(i).getTitle());
            }
        }
    }

    private void returnBook(String title) {
        int index = bookIndex(title);
        if (index == -1) {
            System.out.println("Такой книги не существует");
        } else if (!books.get(index).isBorrowed()) {
            System.out.println("Книга уже на месте");
        } else {
            books.get(index).returned();
            System.out.println("Книга возращена");
        }
    }

    public static void main(String[] args) {
        // Создаем две библиотеки
        Library firstLibrary = new Library("Университетский пр., 120");
        Library secondLibrary = new Library("Московский пр., 86");


        // Добавляем четыре книги в первую библиотеку
        firstLibrary.addBook(new Book("Код да Винчи")); // При добавлении на экран должно выводиться сообщение об успешном добавлении соответствующей книги
        firstLibrary.addBook(new Book("50 оттенков серого"));
        firstLibrary.addBook(new Book("Учебник мемологии"));
        firstLibrary.addBook(new Book("Властелин Колец"));

        // Выводим на экран часы работы и адреса
        System.out.println("Часы работы библиотек:");
        printOpeningHours(); // Что-то типа "Все библиотеки работают с понедельника по субботу с 9 до 18", текст на ваше усмотрение
        System.out.println();


        System.out.println("Адреса библиотек:");
        firstLibrary.printAddress(); // Выводит адрес
        secondLibrary.printAddress();
        System.out.println();

        // Пытаемся взять Властелина Колец из обеих библиотек
        System.out.println("Берем лучшую книгу на земле:");
        firstLibrary.borrowBook("Властелин Колец");   // Должно пройти успешно, мы должны получить соответствующее сообщение об успех
        firstLibrary.borrowBook("Властелин Колец");   // Книга уже взята, об этом нам должны написать
        secondLibrary.borrowBook("Властелин Колец");  // Такой книги нет в каталоге, это тоже отдельное сообщение для нас
        System.out.println();

        // Выводим названия всех книг в обеих библиотеках
        System.out.println("Доступные книги в первой библиотеке:");
        firstLibrary.printAvailableBooks();  // Только список книг, которые можно взять
        System.out.println();
        System.out.println("Доступные книги во второй библиотеке:");
        secondLibrary.printAvailableBooks(); // Так как во вторую книг не добавляли, то тут надо написать что-то типа "В каталоге пусто"
        System.out.println();

        // Возвращаем Властелина Колец в первую библиотеку
        System.out.println("Прочитали Властелина Колец, возвращаем:");
        firstLibrary.returnBook("Властелин Колец"); // Сообщение об успешном возвращении
        System.out.println();

        // Снова выводим список доступных книг в первой библиотеке
        System.out.println("Доступные книги в первой библиотеке:");
        firstLibrary.printAvailableBooks();

    }
}