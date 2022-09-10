import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> person=new ArrayList<Person>();
        person.add(new Person());
        person.add(new Person());
        person.add(new Person());

        for (Person p: person
            ) {
            p.display();
        }

    }
}
