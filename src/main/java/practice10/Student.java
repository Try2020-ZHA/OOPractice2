package practice10;

public class Student extends Person{
    private Klass klass;
    public Student(int age,String name,int id,Klass klass){
        super(age,name,id);
        this.klass=klass;
    }

    public Klass getKlass(){
        return klass;
    }

    public String introduce(){
        if(this==this.getKlass().getLeader()){
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am Leader of "+getKlass().getDisplayName()+".";
        }else{
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am at "+getKlass().getDisplayName()+".";
        }

    }
}
