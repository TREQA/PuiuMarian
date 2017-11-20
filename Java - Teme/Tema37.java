//Java > Gestionarea si generarea exceptiilor > Gestionarea si generarea exceptiilor in Java
//Continuare Tema36

public class Tema37 {

    static int calculate(int a, int b, String op)
    {
        if(op.equals("+"))
            return a+b;
        if(op.equals("-"))
            return a-b;
        if(op.equals("/"))
        return a/b;
        if(op.equals("*"))
            return a*b;

        return 0;
    }
}