// Java Controlul fluxului, buclele si ramificare > FOR

// trebuie sa separam numele utilizatorilor si sa le stocam intr-un sir separat. Acest sir trebuie emis la iesire.
public class Tema16 {
    public static void main(String[]args){
        String [][] users = {{"petar", "petrovic","1111"},
                {"jovan","jovanovic","2222"},
                {"zoran","ivanovic","3333"}
    };

        String [] nume = new String[users.length];
        for (int n = 0; n<users.length;n++)
            nume[n] = users[n][0];
        System.out.println(java.util.Arrays.toString(nume));

    }
}

/*
Raspunsuri intrebari:
1.a
2.a
3.a
4.a
5.a
6.a
7.a
 */
