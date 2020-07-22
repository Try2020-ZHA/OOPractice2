package practice01;

public class Person {
    private int age;
    private String name;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void introduce(){
        System.out.println( "My name is "+this.name+". I am "+this.age+" years old.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
