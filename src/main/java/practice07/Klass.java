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
        return displayName;
    }

    public Klass getKlass(){
        return this;
    }
}
