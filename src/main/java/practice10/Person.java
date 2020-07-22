package practice10;

public class Person {
    private String name;
    private int age;
    private int id;
    public Person(int id,String name,int age){
        this.age=age;
        this.name=name;
        this.id=id;
    }

    public boolean equals(Person obj) {
        return (this.getId() == obj.getId());
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
