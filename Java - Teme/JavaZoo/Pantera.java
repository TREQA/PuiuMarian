package JavaZoo;

public class Pantera extends Animal {
         int umor;
         Jucarie jucariePantera;

        public Pantera(Jucarie j) {
            this.jucariePantera = j;
            this.umor = 10;
            super.mancare_necesara = 10;
            super.nume_animal = "pantera roz";
            super.dmg = 1;
        }

        public void hraneste(int mancare) {
            this.umor += 2;
            super.mancare_primita += mancare;
            super.verifica_satul();
            System.out.println("Nivel umor: "+ umor);
        }
    }


