package ArrayList;

public class Person implements Comparable <Person>{
    private String name;
    private int age;
    
    public Person(String nm, int ag){
        name = nm;
        age = ag;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Person t) {
        return name.compareTo(t.getName());
    }
}
