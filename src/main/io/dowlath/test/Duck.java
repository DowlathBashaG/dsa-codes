package src.main.io.dowlath.test;

public class Duck {
    private String name;
    Duck(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        System.out.println(new Duck("Dowlath"));
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}
