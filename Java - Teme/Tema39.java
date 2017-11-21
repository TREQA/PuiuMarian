//Java > Gestionarea si generarea exceptiilor > Gestionarea si generarea exceptiilor in Java
//Continuare tema38




public class Tema39 {

     public static void main(String[]args){
            try{
                Tema38 u = new Tema38(10, "Petar", "Petrovic", "petrov@mail.mm");

            }catch (InvalidIdException ex){
                System.out.println("Id incorect");
            }catch(InvalidFirstNameException ex){
                System.out.println("Nume incorect");
            }catch (InvalidLastNameException ex){
                System.out.println("prenume incorect");
            }catch (InvalidEmailException ex){
                System.out.println("Email incorect");
            }
        }
}





/*
Rezultate exercitii:
1.a
2.a
3.a
4.a
5.a
6.a
7.a
 */