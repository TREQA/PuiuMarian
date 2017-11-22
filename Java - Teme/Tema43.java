// Java > Gestionarea sistemului de fisiere > Serializare

//Continuare Tema42

import java.io.FileNotFoundException;

public class Tema43 {
    public Tema43() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {

        Tema42 t = new Tema42();
        t.setId(3);
        t.setEmail("email@test.ro");
        t.setPassword("password");
        t.serializeXml("myproject.xml");
    }

    public void deserializare() throws FileNotFoundException {
        Tema42 t = Tema42.deserializeXml("myproject.xml");
        System.out.print(t);
    }
}
