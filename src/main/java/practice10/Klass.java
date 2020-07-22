package practice10;

public class Klass {
    private int number;
    private Student leader;
    private String displayName;

    public String getDisplayName() {
        return "Class "+number;
    }

    public Klass(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student){
        this.leader=student;
    }

    public Student getLeader(){
        return leader;
    }

    public Klass getKlass(){
        return this;
    }

    public String appendMember(Student student){
        if(student.getKlass()==getKlass()){
            return null;
        }
        return "It is not one of us.";
    }
}
