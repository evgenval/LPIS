package result;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArray implements Iterable<MyString> {
    private final List<MyString> stringArray = new ArrayList<>();

    public StringArray() {
    }
//Mystring
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
//string
    public boolean add(String myString) {
        MyString myStr = new MyString(myString);
        return stringArray.add(myStr);
    }

    public boolean remove(String myString) {
        MyString myStr = new MyString(myString);
        return stringArray.remove(myStr);
    }

    public boolean equals(StringArray obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StringArray) {
            return this.stringArray.equals(obj.stringArray);
        }
        return false;
    }

    @Override
    public Iterator<MyString> iterator() {
       return stringArray.iterator();
    }

}
