package practice07;

public class Klass {
    private int number;
    private String displayName;

    public Klass(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+this.number;
    }

    public Klass getKlass(){
        return this;
    }
}
