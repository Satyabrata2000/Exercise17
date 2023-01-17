package Exercise17;

public class Example2 {

    private int regno;
    private String name;

    //Constructor of this class
    public Example2(int regno, String name){
        this.name = name;
        this.regno = regno;
    }

    public int getRegno(){
        return regno;
    }

    public void setRegno(int Regno){
        this.regno = regno;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
