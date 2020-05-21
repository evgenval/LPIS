package result;


public class Char {

    private final char data;

    public Char(char data) {
        this.data = data;
    }
    public Char(Char ch) {
        this.data = ch.data;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

    public boolean equals(Char obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Char) {
            return this.data == obj.data;
        }
        return false;
    }
}
