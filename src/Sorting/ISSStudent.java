package Sorting;

import Searching.*;

public class ISSStudent implements Comparable <ISSStudent>{
    private String name, address;
    private int id;
    
    ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String getName(){
        return name;
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
        //this version uses name as the sorting and comparing field
        //vs. student id in the other version
        return name.compareTo(stud.name);
    }
}
