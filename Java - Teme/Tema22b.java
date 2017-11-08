// Java Programarea orientata pe obiecte > Clase abstracte si interfete

// continuare produs

public class Tema22b {
    public static void main(String[] args){
        Pizza p = new Pizza("Cappriciosa", 25);
        Sandwitch s = new Sandwitch("Sendvis cu sunca",35);
        s.addition("castravete");
        s.addition("ceapa");
        s.addition("rosii");
        System.out.println(p);
        System.out.println(s);

    }
}