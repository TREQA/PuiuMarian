//Java > Gestionarea si generarea exceptiilor > Gestionarea si generarea exceptiilor in Java
/*
Avem clasa user:
public class User{
public int id;
public String firstName;
public String lastName;
public String email;
public User(int id, String firstName, String lastName, String email){
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.email=email;
}
}

Creati o clasa de exceptii pentru Id, NUME, PRENUME SI EMAIL INCORECT.
Trebuie sa implementati un sistem de verificare in constructorul clasei User, astfel incat, daca idul este mai mare decat 100. sa fie afisat
mesajul InvalidIdException, iar daca sunt goale campurile firstName, lastName si Email sa fie afisate mesajele Invalid FN/LN/Email exception

Instantiati aceasta clasa pentru proiectul main.

 */

//InvalidEmailException extends Exception{}
//InvalidFirstNameException extends Exception{}
//InvalidLastNameException extends Exception{}
//InvalidIdException extends Exception{}


public class Tema38 {

    public int id;
    public String firstName;
    public String lastName;
    public String email;

    public Tema38(int id, String firstName, String lastName, String email)
        throws InvalidIdException, InvalidFirstNameException, InvalidLastNameException, InvalidEmailException {
        if (id>100)
            throw new InvalidIdException();
        else
            this.firstName=firstName;
        if(lastName.equals(""))
            throw new InvalidLastNameException();
        else
            this.lastName=lastName;
        if(email.equals(""))
            throw new InvalidEmailException();
        else
            this.email=email;
    }

    }


