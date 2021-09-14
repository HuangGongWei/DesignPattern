package chapter_threee.P30;

public class dog {
    private String name;

    public dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double path(){
        return Math.PI*Math.pow(1.0,2.0);
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
