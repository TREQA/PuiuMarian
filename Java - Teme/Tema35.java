//Java > Tipurile de date obiectuale > Gestionarea datei si a timpului

/*
Creati un program care va afisa la iesire toate lunile anului curent si durata lor
 */

package test;
import java.time.LocalDate;
import java.time.Month;

public class Tema35 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        for(Month month : Month.values()){
            System.out.println(month+" "+month.length(now.isLeapYear()));
        }
    }
}

