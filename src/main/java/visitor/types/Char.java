package visitor.types;


public class Char {

    private final char data;

    public Char(char data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

}
