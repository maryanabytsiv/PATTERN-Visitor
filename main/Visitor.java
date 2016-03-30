package main;

import tovisit.Book;
import tovisit.CD;
import tovisit.DVD;

public interface Visitor {

    public void visit(Book book);

    public void visit(CD cd);

    public void visit(DVD dvd);

}
