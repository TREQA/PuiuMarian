//Java > Tipurile de date obiectuale > Colectiile

/*
Avem o clasa User:
public class User{
public int Id;
public String name;
public User(int id, String name){
this.Id = id;
this.ime = name;
}
}
De asemenea, in metoda main a aplicatiei, avem urmatorul cod:
ArrayList usersToAdd=new ArrayList();
usersToAdd.add(new User(4, "Goran",));
userToAdd.add(new User(2, "Ilijira"));
userToAdd.add(new User(6, "Nikola"));

ArrayList users = new ArrayList();
users.add(new User(1, "Petar"));
users.add(new User(2, "Jovan"));
users.add(new User(3, "Zoran"));

Adaugati toti utilizatorii din lista usersToAdd in listas Users. Daca exista deja un utilizator cu acelasi id,
inlocuiti vechiul utilizator cu cel nou. Afisati lista Users.

 */

// Solutia 1
/*Solutia subintelege trecerea printr-un sir de elemente care sunt adaugate si, in cadrul fiecarei treceri, se trece pritr-un sir de elemente
care exista deja . Daca in sirul cu elelemente existente se afla un element ce are ID_ul elementului curent care este adaugat
respectivul utilizator este inlocuit cu cel nou:
*/

/*
public class Tema34 {

for(
    int i = 0;i<usersToAdd.size();i++)

    {
    boolean userExists = false;
    for (int u = 0;u<users.size();u++){
        if(((Users)users.get(u).Id==((User)usersToAdd.get(i)).Id){
            users.set(u, (User)usersToAdd.get(i));
            userExists = true;
        }
    }
    if(!userExists){
        users.add(usersToAdd.get(i));
        else userExists=false;
    }
    for (Object u : users)
        System.out.println(((User)u).Id+":"+((User)u).name);

}
}

 */

/*Solutia 2
In aceasta solutie, trecent prin lista de utilizatori existent, deterninam daca exista un id care se potriveste cu lista de utilizatori care se adauga.
Daca exista, acest utilizator este sters din lista de utilizatori eistenti. In cele din urma, cand toti utilizatorii sunt stersi, vom utiliza
metoda addAll pentru a adauga lista completa de utilizatori noi in lista cu utilizatori existenti.
 */

/*
for(int i = 0;i<users.size();i++){
    for(int u = 0;0<usersToAdd.size();u++)
    {
    if(((Users)users.get(i)).Id==((User)usersToAdd.get(u)).Id)
    users.remove(u);
    }
}
users.addAll(userToAdd);
for(User u: users)
System.out.println(u.Id+":"+u.name);
 */

// Pe baza clasei User existente ( din excercitiul anterior), am creat urmatoarea lista:
/*
ArrayList users = new ArrayList();
usersToAdd.add(new User(4, "Goran",));
userToAdd.add(new User(2, "Ilijira"));
userToAdd.add(new User(6, "Nikola"));
users.add(new User(1, "Petar"));
users.add(new User(2, "Jovan"));
users.add(new User(3, "Zoran"));

Sortati utilizatorii in functie de ID si afisati lista la iesire
 */

/*
//Solutia:
int min;
User tmp;
for(int i =0;i<users.size();i++)
{
    min = i;
    for(int u = i;u<users.size()u++)
{
if(((User)users.get(u)).Id<((User)users.get(min)).Id)
{
    min = u;
}
}
    tmp = (User)users.get(min);
    users.set(min, (User)users.get(i));
    users.set(i,tmp);
}
    for(User u: users)
    System.out.println(u.Id+"":"+u.name);

}

 */

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