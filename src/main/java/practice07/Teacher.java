package practice07;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name,int age){
        super(name,age);
        this.klass=null;
    }

    public Teacher(String name,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }

    public String introduce(){
        if(this.getKlass()==null){
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach No Class.";
        }else{
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach "+this.getKlass().getDisplayName()+".";
        }
    }

    public String introduceWith(Student student){
        Klass studentClass=student.getKlass();
        if(studentClass==this.getKlass()){
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
        }else {
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }

    public Klass getKlass() {
        return this.klass;
    }
}
