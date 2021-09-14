package chapter_threee.P41_4;

public class PersonFactory {
    //静态工厂方法
    public static Nvwa getNvwa(String type) {
        Nvwa nvwa = null;
        if (type.equalsIgnoreCase("M")) {
            nvwa = new Man();
            System.out.println("造男人的泥巴揉好了！");
        } else if (type.equalsIgnoreCase("W")) {
            nvwa = new Woman();
            System.out.println("造女人的泥巴揉好了！");
        }
        return nvwa;
    }

}
