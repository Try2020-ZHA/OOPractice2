package practice06;

public class Teacher extends Person{
    private String klass;
    public Teacher(String name,int age,String klass){
        super(name,age);
        this.klass=klass;
    }

    public String introduce(){
//        System.out.println(super.introduce());
        if(this.getKlass()==null){
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach No Class.";
        }else{
            return "My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach Class "+this.getKlass()+".";
        }
    }

    public String getKlass() {
        return klass;
    }
//
//    public static void main(String[] args){
//        Teacher t=new Teacher("cxk",10,null);
//        System.out.println(t.introduce());
//    }
}
