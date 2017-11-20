//Java > Gestionarea si generarea exceptiilor > Gestionarea si generarea exceptiilor in Java
/*
Securizati aplicatia existenta astfel incat sa nu raporteze o eroare

public class Main{
static int calculate(int a, int b, String op)
{
if(op.equals("+"))
return a+b;
if(op.equals("-"))
return a-b;
if(op.equals("/")))
return a/b;
if(op.equals("*"))
return a*b;

return 0;
}
public static void main(Stringp[args){
int x = calculate(5,0,"/");
System.out.println(x);
}
}
 */

public class Tema36 {
        public static void main(String[]args){
    int x = 0;
    try {
        x = Tema37.calculate(5, 0, "/");
        System.out.println(x);
    }catch (ArithmeticException ex){
        System.out.println("Rezultat nu poate fi calculat");
    }
}
}


