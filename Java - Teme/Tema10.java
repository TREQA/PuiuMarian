//// Java Tipuri de date si operatori > > Siruri

// un program care va sorta sirul dat si la iesire va da sirul vechi si cel nou

import java.util.Arrays;

public class Tema10 {
    public static void main(String[] args){
        int[]array = {1,5,33,563,0,2,23,9,9,11,987,23,934,999,43};
        System.out.println("This is array:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("This is a sorted array:" +Arrays.toString(array));
    }
}

/*
Rezultate intrebari:
1.a
2.a
3.a
4.a
5.a
6.a
7.a
 */