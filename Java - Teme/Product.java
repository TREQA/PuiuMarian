// Java Programarea orientata pe obiecte > Clase abstracte si interfete

public abstract class Product {
    public int type;
    public String name;
    public double price;
    public String[] additions;

    public abstract double countPrice();

    @Override
    public String toString(){
        return "Produs: "+this.name+","+"pret: "+countPrice()+","+"adaosuri: "+allAdditions();
    }
    public String allAdditions(){
        String output = "";
        for(int i = 0;i<this.additions.length;i++){
            if(this.additions[i]!=null){
                output+=this.additions[i]+",";
            }
        }
        if (output.equals("")){
            output+=("fara adaosuri");
        }
        return output;
    }
    public void addition(String addition){
        for(int i = 0;i<this.additions.length;i++){
            if(this.additions[i]==null){
                this.additions[i]=addition;
                break;
            }
        }
    }
}
