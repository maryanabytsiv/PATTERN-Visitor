package main;

import tovisit.Book;
import tovisit.CD;
import tovisit.DVD;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        MarkingVisitor marker1 = new MarkingVisitor();

        Book book1 = new Book(LocalDate.of(1984, 10, 5));
        Book book2 = new Book(LocalDate.of(2000, 10, 5));

        CD cd1 = new CD(LocalDate.of(1943, 10, 5));
        CD cd2 = new CD(LocalDate.of(2015, 10, 5));

        DVD dvd1 = new DVD(LocalDate.of(2001, 10, 5));
        DVD dvd2 = new DVD(LocalDate.of(1990, 10, 5));

        Visitable items[] = new Visitable[] { book1, book2, cd1, cd2, dvd1, dvd2, };

        System.out.println("Items after 11/1/2000 will be marked for restoration\n");
        for (Visitable item : items) {
            System.out.println("before: " + item.toString());
            item.accept(marker1);
            System.out.println("after: " + item.toString() + "\n");
        }

    }

}
