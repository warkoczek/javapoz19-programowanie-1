package pl.sdacademy.javapoz19programowanie1.books;

import java.util.List;
import java.util.Scanner;

public class BooksViews {

    private Scanner scanner;

    public BooksViews(Scanner scanner){
        this.scanner=scanner;
    }
    public int startMenu(){
        System.out.println("1. Authors");
        System.out.println("2. Books");
        System.out.println("3. Koniec");

        return getDecisionAfterEnter();
    }
    public int getDecision(){
        return scanner.nextInt();
    }

    public int getReleaseYear(){
        return readIntAndClearLine();
    }

    public Nation getNation(){
        String nationAsString = scanner.nextLine().trim();
        return Nation.valueOf(nationAsString);
    }

    public int getDecisionAfterEnter() {
        return readIntAndClearLine();
    }

    public int getBirthYear(){
        return readIntAndClearLine();
    }

    public int authorsMenu(List<Author> authors){
        authors
                .forEach(author -> System.out.println(author));
        System.out.println("1. Find by nation (PL, ENG, USA)");//TODO zrobic dynamicznie
        System.out.println("2. Find by after birthYear");
        System.out.println("O. Wroc");

        return getDecision();
    }

    public int booksMenu(List<Book> books){
        books.forEach(book -> System.out.println(book));
        System.out.println();
        System.out.println("1. Find by after releaseYear");
        System.out.println("2. Search by Title");
        System.out.println("3. Search by Author");
        System.out.println("4. Search by pages");
        System.out.println("0. Back");
        return getDecision();
    }

    private int readIntAndClearLine(){
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public String getPhrase() {
        return scanner.nextLine().trim();

    }

    public int getPagesNum(){
        return readIntAndClearLine();
    }
}
