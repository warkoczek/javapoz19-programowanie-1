package pl.sdacademy.javapoz19programowanie1.books;

import pl.sdacademy.javapoz19programowanie1.Nation;

import java.util.List;

public interface AuthorsRepository {
    List<Author> findAll();

    List<Author> findByNation(Nation nation);
}
