// Java > Tipurile de date obiectuale > Enumerarile

/*
In cadrul aplicatie noastre web am obtinut urmatorul string care transmite parametri in urmatorul format:
serverId=25&serverName=my name&serverStatus=Running
Creati o clasa Server cu urmatoarele campuri: Id, Name and Status.
Creati o enumerare cu statusurile serverului(Stopped, Running, Unknown) si o metoda care izoleaza parametrii(din probleme)
si creeaza o instanta a clasei Server pe baza lor.
Trebuie suprascrisa metoda cu toStringg a clasei sever si afisat ID-ul, numele si statusul serverului in ea.
Realizati solutii de test prin intermediul metodei Main a clasei Main.
 */
public class Tema33 {
    public enum ServerStatus{
        Stopped, Running, Unknown
    }
    public int id;
    public String name;
    public ServerStatus status;
    public Tema33(){}
    public Tema33(String pars){
        String []parsArray = pars.split("&");
        this.id=Integer.parseInt(parsArray[0].split("=")[1]);
        this.name = parsArray[1].split("=")[1].toString();
        this.status = getStatus(parsArray[2].split("=")[1].toString());
    }

    public ServerStatus getStatus(String status){
        ServerStatus res = ServerStatus.Unknown;
        try{res = ServerStatus.valueOf(status);} catch (Exception e){}
            return res;
    }

    @Override

    public String toString(){
    return "Server id:"+ this.id+"\nServer name: "+this.name+"\nServer status: "+this.status+"\n";
}
}
