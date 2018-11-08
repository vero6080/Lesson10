package Searching;

public class State implements Comparable <State>{
    private String name;
    
    public State(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(State otherState) {
        return name.compareTo(otherState.getName());
    }
}
