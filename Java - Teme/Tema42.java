// Java > Gestionarea sistemului de fisiere > Serializare
/*
Este data clasa User:

public class User{
private int id;
private String email;
private String passwword;

public void setId(int id){this.id=id;};
public int getId(){return this.id;}
public void setEmail(String email){this.email = email;};
public String getEmail(){return this.email;};
public void setPassword(String password){this.password = password;};
public String getPassword(){return this.password;};

@Override
public String toString(){
return this.id+""+this.email+""+this.password};
}
}
Trebuie sa cream metode aditionale in aceasta clasa: o metoda pentru serializarea XML a obiectului si a doua metoda,
care este statica, pentru crearea obiectului din documentul XML.

Testati serializarea si deserializarea in metoda Main.

 */

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Tema42 {

    private int id;
    private String email;
    private String password;

    public void setId(int id){this.id=id;};
    public int getId(){return this.id;}
    public void setEmail(String email){this.email = email;};
    public String getEmail(){return this.email;};
    public void setPassword(String password){this.password = password;};
    public String getPassword(){return this.password;};

    @Override
    public String toString(){
        return this.id+""+this.email+""+this.password;};

    public void serializeXml(String xmlFile) throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream(xmlFile);
        XMLEncoder s = new XMLEncoder(fos);
        s.writeObject(this);
        s.close();
    }

    public static Tema42 deserializeXml(String file) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(file);
        XMLDecoder objln = new XMLDecoder(fis);
        Tema42 t = (Tema42)objln.readObject();
        return t;
    }
}

