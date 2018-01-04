package JavaZoo;

public class Ingrijitor {
    String nume;
    double salariu;
    int nr_rani = 0;

    public Ingrijitor(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
        this.nr_rani = 0;
    }

    public void hranesteAnimal(Animal a, int mancare) {
        a.hraneste(mancare);
        this.nr_rani += a.getDmg();
        System.out.println("Numarul total de rani: " + this.nr_rani);
    }
}

