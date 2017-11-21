//Java > Gestionarea sistemului de fisiere > Fluxuri de date

/*
Creati o aplicatie care concateneaza fisierele (pune doua fisiere intr-unul singur). Denumirile acestor fisiere sunt:
firstFile.txt, secondFile.txt, thirdFile.txt. Uniti continuturile acestor doua fisiere si puneti-le in fisierul denumit thirdFile.txt

*/

import java.io.*;
public class Tema41 {

        public static void main(String[] args) throws IOException {
            String tmpLine;
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JavaFlux\\thirdFile.txt"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\JavaFlux\\firstFile.txt"));
            while ((tmpLine = br.readLine()) != null)
                bw.write(tmpLine + "\n");
            br.close();
            br = new BufferedReader(new FileReader("C:\\JavaFlux\\secondFile.txt"));
            while ((tmpLine = br.readLine()) != null)
                bw.write(tmpLine);
            br.close();
            bw.close();
        }
    }

/*
Raspunsuri exercitii:
1.a
2.a
3.a
4.a
5.a
6.a
7.a
 */