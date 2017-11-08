/*
Datele intra in aplicatie prin intermediul urmatorului string:
String users = "firstName: Vladimir | lastName: Vladimirovic| firstName: Jovan | lastName: Jovanovici | firstName: Petar | lastName: Petrovic";
Formatati datele astfel incat sa obtineti urmatoarea iesire: user first name is : VLadimir, user last name is : Vladimirovic
 */
public class Tema31 {
    public static void main (String[] args){

        String users = "firstName:Vladimir|lastName:Vladimirovic|firstName:Jovan|lastName:Jovanovici |firstName:Petar|lastName:Petrovic";

    String [] usersArray = users.split("\\|");
    for (int i = 0; i<usersArray.length; i+=2){
        String firstName = usersArray[i].split("")[1];
        String lastName = usersArray[i+1].split("")[1];
    System.out.println("user first name is: "+firstName+",user last name is: "+lastName);
}
}
}