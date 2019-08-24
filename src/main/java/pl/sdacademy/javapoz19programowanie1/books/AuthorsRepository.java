package pl.sdacademy.javapoz19programowanie1.books;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();

    List<Author> findByNation(Nation nation);

    List<Author> findByAfterBirthYear(int birthYear);
}
