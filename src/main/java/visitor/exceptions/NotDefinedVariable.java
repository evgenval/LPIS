package visitor.exceptions;

public class NotDefinedVariable extends Exception {

    public NotDefinedVariable() {
    }

    public NotDefinedVariable(String messages) {
        super(messages);
    }

}
