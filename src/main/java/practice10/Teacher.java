package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klass=new LinkedList<Klass>();
    public Teacher(int age,String name,int id){
        super(age,name,id);
    }

    public Teacher(int age,String name,int id,LinkedList<Klass> klass){
        super(age,name,id);
        this.klass=klass;
    }

    public String introduce(){
        int numOfClasses=this.getClasses().size();
        if(numOfClasses==0){
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach No Class.";
        }else{
            LinkedList<Klass> allClasses=this.getClasses();
            String classes="";
            for(int i=0;i<numOfClasses;i++){
                classes+=allClasses.get(i).getNumber();
                if(i<numOfClasses-1){
                    classes+=", ";
                }
            }
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach Class "+classes+".";
        }
    }

    public boolean isTeaching(Student student){
        for(int i=0;i<getClasses().size();i++){
            if(student.getKlass()==getClasses().get(i))
                return true;
        }
        return false;
    }

    public String introduceWith(Student student){
        Klass studentClass=student.getKlass();
        int numOfClass=getClasses().size();
        for(int i=0;i<getClasses().size();i++){
            if(studentClass==getClasses().get(i)){
                return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
            }
        }
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
    }

    public LinkedList<Klass> getClasses() {
        return klass;
    }
}
