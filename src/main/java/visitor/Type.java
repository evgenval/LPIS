package visitor;


public enum Type {
    STRING("MyString"),
    CHAR("Char"),
    STRING_ARRAY("StringArray"),
    VOID("void");

    private String type;

    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    static Type getTypeByString(String type){
        switch (type){
            case "string":
                return STRING;
            case "char":
                return CHAR;
            case "stringArray":
                return STRING_ARRAY;
            default:
                return VOID;
        }
    }
}