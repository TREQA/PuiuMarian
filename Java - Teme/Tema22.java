// Java Programarea orientata pe obiecte > Mostenirea si polimorfismul

/*
Trebuie creata o clasa Shape care va contine unele datea referitoare la forma geometrica, precum: pozitia (x,y), culoarea si denumirea.
Trebuie create trei clase care vor mosteni clasa Shape. O clasa trebuie creata pentru cerc, una pentru patrat si una pentru dreptunghi.
Fiecare trebuie sa contina o metoda pentru calcularea ariei, precum si propriile atribute necesare pentru aceasta calculare
(laturile pentru dreptunghi si patrat si raza pentru cerc). De asemenea, cercul trebuie sa posede si constanta PI.
Toate valorile vor fi intregi(dar nu si PI).
 */

public class Tema22 {

    public static void main(String[]args){
        Circle c = new Circle();
        c.r = 12;
        c.color = "crvena";
        c.x=100;
        c.y=200;
        System.out.println(c.area());
    }

        public String color;
        public int x;
        public int y;

    public static class Rectangle extends Tema22{
        public double a;
        public double b;
        public double area(){
            return a*b;
        }
    }
    public static class Square extends Tema22{
        public double a;
        public double area() {
            return a*a;
        }
    }
    public static class Circle extends Tema22{
        public final double PI = 3.14;
        public double r;
        public double area(){
            return r*r*PI;
        }
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