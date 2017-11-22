// Java > Gestionarea sistemului de fisiere > Serializare

//Continuare Tema42

import java.io.FileNotFoundException;

public class Tema44 {
    public Tema44() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Tema42 t = Tema42.deserializeXml("myproject.xml");
        System.out.print(t);
    }

}

/*
Raspunsuri exercitii:
1.a
2.a
3.a
4.a
5.a
6.a
7.a
 */