# Компилятор языка описывающего работу со строками

Вариант свойств языка 28

# Установка
  - Скачайте данный репозиторий
  - Откройте проект в IDE c установленным Antlr4 плагином

# Грамматика
 - Была реализована грамматика языка, описывающего работу со строками
 - Встроенные типы MyString, StringArray и Char
 - Файл граматики хранится по пути: (project_directory)/scr/stringGrammar.g4

# Тестирование

## stringTest.str: 
```
   fun string testString (string t) {
     string a = "asd"
     return a
 }

fun char testChar (char s) {
    char a = 's'
    return a
}

fun stringArray testArray (string ii) {
    stringArray a = [ii]
    return a
}

main {
    string a = "abc"
    string b = "abc"
    string tests = ""
    string c = [a+b]
    string d = ["as"+"bc"]
    string cc = testString(a)
    char s = 'c'
    char sd = s
    char dss = 's'
    char k = testChar(s)
    tests = (string) s
    print "--------"
    print tests
    print "--------"
    stringArray as = [a, b]
    stringArray asd = ["sad", "lel"]
    stringArray test = testArray(b)
    print "sdf"
    print b
    print a
    if (s == sd)
    {
     print "Chars equals!"
    }
    if (a == b)
    {
     print "Strings equals!"
    }
    if (s == s)
    {
      print "Arrays equals!"
     }
    if (a != b) {
        print "a!=b"
    }else {
        print "LALA"
    }
    while (b != a) {
        print b
        b = a
    }
    forEach (string se in as) {
        print se
    }
    a = b + c + c
    print a
}

fun testVoid (string a) {
    print a
}

```
## Сгенерированный Main.java: 
```java
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


```
