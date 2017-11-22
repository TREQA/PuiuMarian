// JAVA > Gestionarea sistemului de fisiere  > Fisiere si foldere
/*
Creati un program ce va muta fisierul de pe o cale pe alta ( optiunea cut ).
 */


import java.io.*;

public class Tema45 {

    public static void main(String[]args){
        String path = "";
        String destination= "";

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter file path: ");
            path=bufferedReader.readLine();

            System.out.println("Enter destination folder: ");
            destination = bufferedReader.readLine();

        }catch (IOException e){
            System.out.println(e);
        }

        File afile = new File(path);
        File bfile = new File(destination + "\\" + afile.getName());

        try(FileInputStream inStream = new FileInputStream(afile);
            FileOutputStream outStream = new FileOutputStream(bfile);) {
            byte[] buffer = new byte[1024];

            int length;

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            System.out.println("File is moved successfuly!");
            inStream.close();
            outStream.close();
            afile.delete();

        }catch (IOException exc){
            System.out.println(exc);
        }

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