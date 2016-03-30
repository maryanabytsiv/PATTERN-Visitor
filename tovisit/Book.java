package tovisit;

import main.Visitable;
import main.Visitor;

import java.time.LocalDate;

public class Book implements Visitable {

    private LocalDate dateOfEdition;
    private boolean needRestoration;

    public LocalDate getDateOfEdition() {
        return dateOfEdition;
    }

    public void setDateOfEdition(LocalDate dateOfEdition) {
        this.dateOfEdition = dateOfEdition;
    }

    public Book(LocalDate dateOfEdition) {
        this.dateOfEdition = dateOfEdition;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setRestoration(boolean needRestoration) {
        this.needRestoration = needRestoration;
    }

    public boolean getRestoration() {
        return needRestoration;
    }

    @Override
    public String toString() {
        return "Book [dateOfEdition=" + dateOfEdition + ", needRestoration=" + needRestoration + "]";
    }

}
