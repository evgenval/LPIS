package visitor.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArray implements Iterable<MyString> {
    private final List<MyString> stringArray = new ArrayList<>();

    public StringArray() {
    }

    public boolean add(MyString myString) {
        return stringArray.add(myString);
    }

    public boolean remove(MyString myString) {
       return stringArray.remove(myString);
    }

    public int size() {
        return stringArray.size();
    }

    public void clear() {
        stringArray.clear();
    }

    @Override
    public Iterator<MyString> iterator() {
       return stringArray.iterator();
    }
}
