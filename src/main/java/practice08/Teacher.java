package practice08;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int age,String name,int id){
        super(age,name,id);
        this.klass=null;
    }

    public Teacher(int age,String name,int id,Klass klass){
        super(age,name,id);
        this.klass=klass;
    }

    public String introduce(){
        if(this.getKlass()==null){
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach No Class.";
        }else{
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach Class "+this.getKlass().getNumber()+".";
        }
    }

    public String introduceWith(Student student){
        Klass studentClass=student.getKlass();
        if(studentClass==getKlass()){
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
        }else {
            return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
        }
    }

    public Klass getKlass() {
        return klass;
    }
}
