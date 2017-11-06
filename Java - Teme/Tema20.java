// trebuie creata clasa Calculator ( de buzunar ) care are trei proprietati:
// operand1, operand2 si operator. Clasa poseda medota calculate() care, pe baza operatorului,
// executa operatia de calcul adecvata asupra operanzilor si returneaza un rezultat.
// Sunt suficiente cele 4 operatii de baza (+, -, *, /)


public class Tema20 {

    public static void main(String []args){

        Tema20 t = new Tema20();
        t.operand1 = 2;
        t.operand2 = 5;
        t.operator = '+';
        System.out.println(t.calculate());
    }

    double operand1;
    double operand2;
    char operator;

    public double calculate() {

        double result = 0;

        switch (this.operator) {
            case '+':
                result = this.operand1 + this.operand2;
                break;
            case '-':
                result = this.operand1 - this.operand2;
                break;
            case '*':
                result = this.operand1 * this.operand2;
                break;
            case '/':
                if (this.operand2 == 0) {
                    System.out.println("Impartirea nu este posibila!");
                } else
                    result = this.operand1 / this.operand2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}