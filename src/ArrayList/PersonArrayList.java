package ArrayList;

import java.util.ArrayList;

public class PersonArrayList {

    public static void main(String[] args) {
        ArrayList <Person> people = new ArrayList();
        people.add(new Person("Burns, Monty",92));
        people.add(new Person("Prince, Martin",56));
        people.add(new Person("Simpson, Bart",12));
        people.add(new Person("Van Houten, Millhouse",13));
        
        for (Person x : people) {
            System.out.println(x.getName() + "\t" + x.getAge());
        }
        System.out.println("=============================");
        
        
        Person a, b;
        a = new Person("Simpson, Maggie", 1);
        b = new Person("Whiggum, Clancey", 44);
        System.out.println("Inserting Maggie and Clancey");
        int loc = findInsertPoint(people, a);
        people.add(loc, a);
        loc = findInsertPoint(people, b);
        people.add(loc, b);
        for (Person x: people){
            System.out.println(x.getName() + "\t" + x.getAge());
        }
        System.out.println("=============================");
        
        System.out.println("Removing Millhouse");
        Person temp = new Person("Van Houten, Millhouse", 0);
        loc = search(people, temp);
        people.remove(loc);
        System.out.println("=============================");
        
        
        System.out.println("Final List");
        for (Person x : people) {
            System.out.println(x.getName() + "\t" + x.getAge());
        }
    }

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable)a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable)a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable)a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }

}
