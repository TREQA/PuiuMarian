package JavaZoo;

public class ZooTest {

        public static void main(String[] args) {

            Jucarie j1 = new Jucarie(Culoare.ROZ);
            Pantera p1 = new Pantera(j1);
            Leu l1 = new Leu();
            Leu l2 = new Leu();
            Ingrijitor i = new Ingrijitor("Dorel", 2000.00);
            i.hranesteAnimal(p1, 12);
            i.hranesteAnimal(l1, 5);
            i.hranesteAnimal(l1, 30);
            i.hranesteAnimal(l2, 15);
        }
    }

