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