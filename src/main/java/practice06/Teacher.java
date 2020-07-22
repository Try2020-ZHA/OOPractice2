package practice06;

public class Teacher extends Person{
    private int klass;
    public Teacher(String name,int age,int klass){
        super(name,age);
        this.klass=klass;
    }

    public String introduce(){
        return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach Class 2.";
    }

    public int getKlass() {
        return klass;
    }
}
