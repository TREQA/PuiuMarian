// Java Programarea orientata pe obiecte > Clase abstracte si interfete

/*
trebuie creata o clasa abstracta Quad care va contine 3 campuri (x, y si a) si o metoda abstracta (Setxya)
trebuie creata interfata IGeom care va contine semnaturile metodelor pentru calcularea ariei si perimetrului
trebuie creata clasa Square care mosteneste clasa Quad si implementeaza interfata IGeom
trebuie creata o isntanta a clasei Square in programul principal
 */
interface Tema23 {
    int area();
    int perimetru();
}
abstract class Quad{
    public int x;
    public int y;
    public int a;
    public abstract void setxya(int x, int y, int a);
}
class Square extends Quad implements Tema23{
    @Override
    public int area(){
        return a*a;
    }
    @Override
    public int perimetru(){
        return 4*this.a;
    }
    @Override
    public void setxya(int x, int y, int a){
        this.x=x;
        this.y=y;
        this.a=a;
    }
}
