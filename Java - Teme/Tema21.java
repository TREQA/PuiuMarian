/*
Trebuie create 3 clase. Prima este clasa Circle si ea contine proprietatea r(raza).
A doua clasa este Rectangle si contine proprietatile a si b.
A treia clasa se numeste Calc si contine metoda statica area care, ca parametru, accepta o instanta a clasei
(Circle sau Rectangle), iar ca rezultat prezinta aria formei introduse. In functie daca in metoda a intrat instanta clasei Circle sau Rectangle,
va fi exeutata formula de calculare a ariei pentru Circle sau Rectangle.
 */

public class Tema21 {
    public static void main(String[] args) {

        Circle k = new Circle(4);
        System.out.println(Calculare.area(k));
        Rectangle r = new Rectangle(2, 3);
        System.out.println(Calculare.area(r));
    }

    public static class Circle {
        public double r;

        public Circle(double r) {
            this.r = r;
        }
    }

    public static class Rectangle {
        public double a;
        public double b;

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class Calculare {
        public static double area(Object shape) {
            if (shape.getClass() == Circle.class) {
                return Math.pow(((Circle) shape).r, 2) * Math.PI;
            }
            if (shape.getClass() == Rectangle.class) {
                return ((Rectangle) shape).a * ((Rectangle) shape).b;
            }
            return 0;
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