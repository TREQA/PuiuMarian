// Java > Tipurile de date obiectuale > Stringurile

/*
datele intra in aplicatie prin intermediul urmatoarelor doua stringuri:
String [] forbiddenChars = {"<", ">", "'"};
String input = "<div>my'div'tag</div>";

trebuie sa curatati stringul astfel incat la iesire sa nu apara caracterele: divmy div tag/div
 */

public class Tema32 {
    public static void main(String[] args) {
        String[] forbiddenChars = {"<", ">", "'"};
        String input = "<div>my'div'tag</div>";
        String output = input;
        for (int i = 0; i < forbiddenChars.length; i++) {
            output = output.replace(forbiddenChars[i],"");

        }
        System.out.println(output);
    }
}

/*
Raspunsuri intrebari:
1.a
2.a
3.a
4.a
5.a
6.a
7.a
 */