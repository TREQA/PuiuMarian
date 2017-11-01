// trebuie sa verificam restul impartirii dintre x si y.
// //Daca nu exista rest, trebuie sa se afiseze mesajul ca restul nu exista,
// in caz contrar, trebuie sa se verifice daca restul este mai mare sau mai mic decat o mie si sa se afiseze un mesaj corespunzator
public class Tema13 {
    public static void main(String[] args){

        int x  = 523134;
        int y = 325423;
        int rest = x%y;
        switch (rest){
            case 0:
                System.out.println("nu are rest");
                break;
            default:
         if(rest>1000)
             System.out.println("rest mai mare decat 1000");
         else
             System.out.println("rest mai mic decat 1000");
         break;
        }
    }
}
