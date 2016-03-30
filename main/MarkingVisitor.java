package main;

import tovisit.Book;
import tovisit.CD;
import tovisit.DVD;

import java.time.LocalDate;
import java.time.Month;

public class MarkingVisitor implements Visitor {

    private LocalDate dateBorder = LocalDate.of(2000, Month.NOVEMBER, 1);

    @Override
    public void visit(Book book) {

        if (book.getDateOfEdition().isBefore(dateBorder)) {
            book.setRestoration(true);
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getDateOfEdition().isBefore(dateBorder)) {
            cd.setRestoration(true);
        }

    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getDateOfEdition().isBefore(dateBorder)) {
            dvd.setRestoration(true);
        }

    }

}
