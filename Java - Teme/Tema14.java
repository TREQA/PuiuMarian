// avem urmatoarele date de intrare pentru un automobil: String carMake = "Ford"; int doors = 4;
// Trebuie sa se faca o structura conditionala care va verifica daca producatorul automobilului este Ford si, daca este
// in functie de numarul de usi, sa se afiseze mesajul adecvat

public class Tema14 {
    public static void main(String[]args){
        String carMake = "Ford";
        int doors = 4;

        switch (carMake){
            case "Ford":
                switch(doors){
                    case 2:
                        System.out.println("Ford cu 2 usi");
                        break;
                    case 4:
                        System.out.println("Ford cu 4 usi");
                        break;
                    default:
                        System.out.println("Masina nu e ford");break;
                }
        }
    }
}

/*
Raspunsuri intrebari:
1.a
2.a
3.a
4.c
5.a
6.c
7.a
 */
