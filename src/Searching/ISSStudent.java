package Searching;

public class ISSStudent implements Comparable <ISSStudent>{
    private String name, address;
    private int id;
    
    ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    @Override
    public String toString(){
        return "Name:\t" + name + "\nAddress:\t" + address + 
                "\nID:\t" + id;
    }
    
    public int getID(){
        return id;
    }
    
    @Override
    public int compareTo(ISSStudent stud){
        if (this.id > stud.getID())
            return 1;
        else if (this.id < stud.getID())
            return -1;
        else
            return 0;
    }
}
