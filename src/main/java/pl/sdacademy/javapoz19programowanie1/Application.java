package pl.sdacademy.javapoz19programowanie1;

import pl.sdacademy.javapoz19programowanie1.books.Author;
import pl.sdacademy.javapoz19programowanie1.books.Nation;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        //2 obiekty Author , jeden kon z param, drugi bez par z seterem
        Author author1 = new Author("Henryk", "Sienkiewicz", 1846, Nation.PL);
        Author author2 = new Author("Adam", "Mickiewicz", 1798, Nation.PL);

        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("King");
        author.setBirthYear(1947);

        author.setNation(Nation.USA);

        List<Author> authors = Arrays.asList(author, author1, author2,
                new Author("Juliusz", "Słowacki", 1849, Nation.PL),
                new Author("Joanne Murray", "Rowling", 1965, Nation.ENG),
                new Author("William", "Shakespeare", 1564, Nation.ENG));

        /* List<Author> authors = Arrays.asList(author, author1, author2);*/
        System.out.println("Show by Nation: ");
        showByNation(authors, Nation.PL);
        System.out.println(("Show Modern Authors"));
        showModernAuthors(authors);
        System.out.println("Show by Nation Birth Year");
        showByNationBirthYear(authors, Nation.PL, 1800);
        System.out.println("Group by Nation");
        System.out.println(groupByNation(authors));
        //showByNation(authors, Nation.PL)
        //showModernAuthors(authors)
        //showByNationBirthYear(authors, Nation.PL, 1800)
    }
        public static void showByNation(List<Author> authors, Nation nation){

            for (Author author : authors){
                if(author.getNation().equals(nation)){
                    System.out.println(author);
                }

            }
        }

        public static void showModernAuthors(List<Author> authors){

            for (Author author : authors){
                if(author.getBirthYear() > 1899){
                    System.out.println(author);
                }
            }
        }

        public static void showByNationBirthYear(List<Author> authors, Nation nation, int birthYear){
                for (Author author : authors){
                    if (author.getNation().equals(nation) && author.getBirthYear()> birthYear)
                    System.out.println(author);
                }
        }



        private static Map<Nation, List<Author>> groupByNation(List<Author> authors){
            Map<Nation, List<Author>> map = new HashMap<>();
            for ( Author author : authors){
                map.putIfAbsent(author.getNation(), new ArrayList<>());
                map.get(author.getNation()).add(author);
            }
            return map;
        }



}
