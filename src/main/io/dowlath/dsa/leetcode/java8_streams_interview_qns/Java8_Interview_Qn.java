package io.dowlath.dsa.leetcode.java8_streams_interview_qns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**

 * Using java stream:

 * Given a list of Book objects, where each Book has a title and a list of authors,
 * write a Java Stream query to find the distinct list of all authors of
 * books whose titles contain the word "Java." Additionally, the result should be sorted alphabetically.

 * [Author1, Author2, Author5, Author6]  <<< expected o/p

 */

        import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;


class Book {

    private String title;

    private List<String> authors;


    public Book(String title, List<String> authors) {

        this.title = title;

        this.authors = authors;

    }


    public String getTitle() {

        return title;

    }


    public List<String> getAuthors() {

        return authors;

    }

}
public class Java8_Interview_Qn {


    public static void main(String[] args) {

        List<Book> books = Arrays.asList(

                new Book("Java Programming", Arrays.asList("Author1", "Author2")),

                new Book("Python Development", Arrays.asList("Author3", "Author4")),

                new Book("Mastering Java", Arrays.asList("Author1", "Author5")),

                new Book("Advanced Java Topics", Arrays.asList("Author2", "Author6"))

        );


        List<String> result = findDistinctAuthorsWithJavaTitle(books);

        System.out.println(result);

    }

    private static List<String> findDistinctAuthorsWithJavaTitle(List<Book> books) {
        List<String> s = books.stream().filter(e -> e.getTitle().contains("Java")).
                flatMap( book -> book.getAuthors().stream()).distinct().collect(Collectors.toList());
       /* System.out.println(books);
        List<String> s = Arrays.asList("a", "b");*/
        return s;
    }

}
