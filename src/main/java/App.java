import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Book book = new Book("x", "y", 25.4);
        Book book1 = new Book("a", "b", 20.1);
        Book book2 = new Book("z", "t", 21.9);
        Book book3 = new Book("k", "l", 23.5);
        Book book4 = new Book("z", "t", 28.9);
        Book book5 = new Book("x", "y", 29.0);
        Book book6 = new Book("x", "y", 29.0);

        Book book_2 = new Book("x2", "y2", 25.4);
        Book book2_1 = new Book("a2", "b2", 20.1);
        Book book2_2 = new Book("z2", "t2", 21.9);
        Book book2_3 = new Book("k2", "l2", 23.5);
        Book book2_4 = new Book("z2", "t2", 28.9);
        Book book2_5 = new Book("x", "y", 29.0);
        Book book2_6 = new Book("x", "y", 29.9);

        List<Book> bookList = new ArrayList();
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        List<Book> bookList2 = new ArrayList();
        bookList2.add(book_2);
        bookList2.add(book2_1);
        bookList2.add(book2_2);
        bookList2.add(book2_3);
        bookList2.add(book2_4);
        bookList2.add(book2_5);
        bookList2.add(book2_6);

        //concat
        List<Book> concat = Stream.concat(bookList.stream(), bookList2.stream()).collect(Collectors.toList());

        //difference
        List<Book> difference = bookList.stream()
                .filter(x -> ! bookList2.contains(x))
                .collect(Collectors.toList());
        //distinct
        List<Book> distinct = bookList.stream()
                .distinct()
                .collect(Collectors.toList());
        //filter
        List<Book> filter = bookList.stream()
                .filter(x -> x.getPrice() > 25)
                .collect(Collectors.toList());
        //slice
        List<Book> slice = bookList.stream().limit(2).collect(Collectors.toList());

        //sort
        List<Book> sort = bookList.stream().sorted(Comparator.comparingDouble(Book::getPrice)).collect(Collectors.toList());

        //union
        List<Book> union = Stream.concat(bookList.stream(),bookList2.stream())
                .map(x -> x.getName())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(sort.toString());
    }


}
