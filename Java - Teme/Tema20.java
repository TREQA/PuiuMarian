// trebuie creata clasa Calculator ( de buzunar ) care are trei proprietati:
// operand1, operand2 si operator. Clasa poseda medota calculate() care, pe baza operatorului,
// executa operatia de calcul adecvata asupra operanzilor si returneaza un rezultat.
// Sunt suficiente cele 4 operatii de baza (+, -, *, /)

public class Tema20 {
    public double operand1;
    public double operand2;
    public char operator;
}



public double calculate(){
    double result;
    switch(this.operator){
        case '+':
            result = this.operand1+this.operand2;
            break;
        case '-':
            result = this.operand1-this.operand2;
            break;
        case '*':
            result = this.operand1*this.operand2;
            break;
        case '/':
            if(this.operand2==0){
                System.out.println("Impartirea nu este posibila!");
                result = 0;}
            else
            result = this.operand1/this.operand2;
            break;
        default:
            result = 0;
            break;
    }{
        return result;
    }
}
}

// gestionarea clasei

class Calculator {
    public void main(String[] args) {
        Tema20 c = new Tema20();
        c.operand1 = 2;
        c.operand2 = 5;
        c.operator = '+';
        System.out.println(c.calculate());
    }
}

