package pl.sdacademy.javapoz19programowanie1.books;

import java.util.List;
import java.util.Scanner;

public class BooksStart {

    private BooksViews views;
    private AuthorsRepository authorsRepository;
    private BooksService booksService;

    public BooksStart(){
        this.views = new BooksViews(new Scanner(System.in));
        this.authorsRepository = new InMemoryAuthorsRepository();
        this.booksService = new BooksService(new InMemoryBooksRepository(authorsRepository));
    }
    public void start(){
        boolean flag = true;
        do {
            int decision = views.startMenu();
            switch(decision){
                case 1:
                    authorsView();
                    break;
                case 2:
                    booksView();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }

    private void authorsView() {

        boolean flag = true;
        List<Author> authors = authorsRepository.findAll();
        do {
            int decision = views.authorsMenu(authors);
            switch(decision){
                case 1://findByNation
                    Nation nation = views.getNation();
                    authors = authorsRepository.findByNation(nation);
                    break;
                case 2://findByAfterBirthYear, nowa metoda w widoku getBirthYear
                    //1.getBirthYear z views
                    //2. Ser authors na nowa liste ktora trzeba zaimplementowac w repository authorsRepository.findByAfterBirthYear(birthYear)
                    int birthYear = views.getBirthYear();
                    authors = authorsRepository.findByAfterBirthYear(birthYear);
                    break;
                default:
                    flag = false;
            }
        }while(flag);
    }

    private void booksView() {
        boolean flag = true;
        List<Book> books = booksService.findAll();
        do {
            int decision = views.booksMenu(books);
            switch(decision){
                case 1:
                    int releaseYear = views.getReleaseYear();
                    books = booksService.findByAfterReleaseYear(releaseYear);
                    break;
                case 2:
                    String phrase = views.getPhrase();
                    books = booksService.searchByPhrase(phrase);
                    break;
                case 3:
                    String authorPhrase = views.getPhrase();
                    books = booksService.searchByAuthor(authorPhrase);
                    break;
                case 4:
                    int pages = views.getPagesNum();
                    books = booksService.searchByThickness(pages);
                    break;
                default:
                    flag = false;
            }


        }while (flag);

    }
}
