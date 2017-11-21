//Java > Gestionarea sistemului de fisiere > Fluxuri de date
/*
Avem fisierul users.txt cu urmatorul cotninut:
id:01|firstName:Petar|lastName:Petrovic|jmbg:1234567890123
id:02|firstName:Jovan|lastName:Jovanovic|jmbg:1234567890124
id:03|firstName:Nikola|lastName:Nikolic|jmbg:!234567890125

Creati o aplicatie care va citi fisierul si va afisa continutul in urmatorul format:
UserId: 01
First name: Petar
Last name: Petrovic
Jmbg: 1234567890123
....
 */




import java.io.*;

public class Tema40 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\JavaFlux\\users.txt"));
        String line;
        while((line=br.readLine())!=null){
            String[] user = line.split("\\|");
            System.out.println("User Id: "+ user[0].split("\\:")[1]);
            System.out.println("First name: "+user[1].split("\\:")[1]);
            System.out.println("Last name: "+user[2].split("\\:")[1]);
            System.out.println("Jmbg: "+user[3].split("\\:")[1]);
            System.out.println("----------------------------------------------------");
        }
        br.close();
    }
}


