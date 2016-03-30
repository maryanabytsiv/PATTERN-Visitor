package tovisit;

import main.Visitable;
import main.Visitor;

import java.time.LocalDate;

public class DVD implements Visitable {
    private LocalDate dateOfEdition;
    private boolean needRecover;

    public DVD(LocalDate dateOfEdition) {
        this.dateOfEdition = dateOfEdition;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setRestoration(boolean needRestoration) {
        this.needRecover = needRestoration;
    }

    public boolean getRestoration() {
        return needRecover;
    }

    public void setDateOfEdition(LocalDate dateOfEdition) {
        this.dateOfEdition = dateOfEdition;
    }

    public LocalDate getDateOfEdition() {
        return dateOfEdition;
    }

    @Override
    public String toString() {
        return "DVD [dateOfEdition=" + dateOfEdition + ", needRecover=" + needRecover + "]";
    }

}
