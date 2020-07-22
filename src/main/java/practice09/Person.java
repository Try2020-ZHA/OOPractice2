package practice09;

public class Person {
    private String name;
    private int age;
    private int id;
    public Person(int age,String name,int id){
        this.age=age;
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }
}
