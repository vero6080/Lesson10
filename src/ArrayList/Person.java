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
    
    public void setAge(int a){
        age = a;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Person t) {
        return name.compareTo(t.getName());
    }
}
