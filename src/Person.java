import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private double height;
    private String gender;
    private String hairColor;
    private String emailAddress;

    public Person(){
        System.out.println("Enter name: ");
        Scanner reader=new Scanner(System.in);
        this.name=reader.nextLine();
        System.out.println("Enter age: ");
        this.age= reader.nextInt();
        System.out.println("Enter height: ");
        this.height=reader.nextDouble();
        System.out.println("Enter gender: ");
        this.gender=reader.nextLine();
        System.out.println("Enter hair color: ");
        this.hairColor=reader.nextLine();
        System.out.println("Enter email address: ");
        this.emailAddress=reader.nextLine();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void display(){

            System.out.println("Age is "+getAge());



    }
}
