// Java Programarea orientata pe obiecte > Clase abstracte si interfete

//continuare tema 25 si tema 26
public class Tema27 implements Tema26, Tema25 {
    public double a;
    public double b;

    public double add() {
        return a + b;
    }

    public double sub() {
        return a - b;
    }

    public void setTema25(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args){
        Tema27 c = new Tema27();
        c.setTema25(2,3);
        System.out.println(c.add());
        System.out.println(c.sub());
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