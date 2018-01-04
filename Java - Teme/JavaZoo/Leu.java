package JavaZoo;

public class Leu extends Animal {
    int somnolenta = 0;

    public Leu() {
        super.mancare_necesara = 15;
        super.nume_animal = "un leu";
        super.dmg = 1;
    }

    public void hraneste(int mancare) {
        this.somnolenta += 10;
        super.mancare_primita += mancare;
        this.verifica_satul();
        System.out.println("Nivel somnolenta: " + somnolenta);
    }
}
