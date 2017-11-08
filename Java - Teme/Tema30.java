/*
in aplicatie intra o lista de fisiere sub forma unui string. Trebuie recunoscute doar fisierele de tip jpg, png sau gif
prin utilizarea  extensiilor acestora, si afisat un mesaj despre tipul lor la iesire:

Fisierul: picture1.jpg este de tip jpg
Fisierul: picture2.png este de tip png
Fisierul: picture3.gif este de tip gif

Parametrul de intrare: String [] files = { "picture.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif"};
 */

public class Tema30 {
    public static void main(String[]args){

        String [] files = { "picture.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif"};
        for (int i = 0;i<files.length; i++){
            if(files[i].endsWith(".jpg"))
                System.out.println("Fisierul: "+ files[i]+"este de tip jpg");
            if(files[i].endsWith(".png"))
                System.out.println("Fisierul: "+ files[i]+"este de tip png");
            if(files[i].endsWith(".gif"))
                System.out.println("Fisierul: "+ files[i]+"este de tip gif");
        }
    }
}
