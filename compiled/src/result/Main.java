package result;
public class Main {
private static MyString testString(MyString t){
MyString a = new MyString("asd");
return a;
}
private static Char testChar(Char s){
Char a = new Char('s');
return a;
}
private static StringArray testArray(MyString ii){
StringArray a = new StringArray();
a.add(ii);

return a;
}
private static void testVoid(MyString a){
System.out.println(a);
}
public static void main(String[]args) throws Exception{
MyString a = new MyString("abc");
MyString b = new MyString("abc");
MyString tests = new MyString("");
MyString c = MyString.concatStr(a, b);
MyString d = MyString.concatStr("as", "bc");
MyString cc = testString(a);
Char s = new Char('c');
Char sd = new Char(s);
Char dss = new Char('s');
Char k = testChar(s);
tests = MyString.conv(s.toString());
System.out.println("--------");
System.out.println(tests);
System.out.println("--------");
StringArray as = new StringArray();
as.add(a);
as.add(b);

StringArray asd = new StringArray();
asd.add("sad");
asd.add("lel");

StringArray test = testArray(b);
System.out.println("sdf");
System.out.println(b);
System.out.println(a);
if (s.equals(sd)){
System.out.println("Chars equals!");
}
if (a.equals(b)){
System.out.println("Strings equals!");
}
if (s.equals(s)){
System.out.println("Arrays equals!");
}
if (!a.equals(b)){
System.out.println("a!=b");
}else{
System.out.println("LALA");
}
while (!b.equals(a)){
System.out.println(b);
b = new MyString(a);
}
for (MyString se : as){
System.out.println(se);
}
a =b.concatStr(b, c).concatStr(b.concatStr(b, c), c);
System.out.println(a);
}
}
