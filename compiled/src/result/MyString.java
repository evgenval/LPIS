package result;

import java.util.Objects;

public class MyString {

    private String data ;

    public MyString(String data) {
        this.data = data;
    }

    public MyString(MyString myStr) {
        this.data = myStr.data;
    }
    public MyString() {

    }


    @Override
    public String toString() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MyString) {
            return ((MyString) obj).data.equals(data);
        }
        return false;
    }

    public static MyString conv(String data) {
        MyString out = new MyString();
        out.data = data;
        return out;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
    //+
    public static MyString concatStr(MyString s1, MyString s2) {
        MyString out = new MyString();
        out.data = s1.data.concat(s2.data);
        return out;
    }
    //-
    public static MyString subStr(MyString s1, MyString s2) {

        MyString out = new MyString();
        out.data.replaceAll(s2.data, "");
        return out;
    }
    // /
    public static MyString divStr(MyString s1, MyString s2) {
        MyString out = new MyString();

        out.data = s1.data.replaceAll("[^"+s2.data+"]","");

        return out;
    }
    // *
    public static MyString mulStr(MyString s1, MyString s2) {

        MyString out = new MyString();

        MyString s3 = new MyString();

        s3.data = s1.data.concat(s2.data);

        out.data = s3.data.toUpperCase();

        return out;
    }
//string
//+

    public static MyString concatStr(String s1, String s2) {
    MyString out = new MyString();
    MyString myS1 = new MyString(s1);
    MyString myS2 = new MyString(s2);
    out.data = myS1.data.concat(myS2.data);
    return out;
}
    //-
    public static MyString subStr(String s1, String s2) {

        MyString out = new MyString(s1);
        MyString myS2 = new MyString(s2);
        out.data.replaceAll(myS2.data, "");
        return out;
    }
    // /
    public static MyString divStr(String s1, String s2) {
        MyString out = new MyString();
        MyString myS1 = new MyString(s1);
        MyString myS2 = new MyString(s2);
        out.data = myS1.data.replaceAll("[^"+myS2.data+"]","");

        return out;
    }
    // *
    public static MyString mulStr(String s1, String s2) {
        MyString myS1 = new MyString(s1);
        MyString myS2 = new MyString(s2);
        MyString out = new MyString();

        MyString s3 = new MyString();

        s3.data = myS1.data.concat(myS2.data);

        out.data = s3.data.toUpperCase();

        return out;
    }
}
