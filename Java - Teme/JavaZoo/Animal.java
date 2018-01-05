package JavaZoo;

public abstract class Animal {
    int mancare_primita = 0;
    int mancare_necesara;
    String nume_animal = "";
    int dmg = 0;

    public int getDmg() {

        return this.dmg;
    }

    public abstract void hraneste(int mancare);

    public void verifica_satul() {
        if (mancare_necesara > mancare_primita) {
            System.out.println("Salut. Eu sunt " + this.nume_animal + " si inca mi-e foame");
        } else if (mancare_necesara < mancare_primita) {
            System.out.println("Salut. Eu sunt " + this.nume_animal + " si am mancat prea mult");
        } else {
            System.out.println("Salut. Eu sunt " + this.nume_animal + " si sunt satul");
        }

    }
}
