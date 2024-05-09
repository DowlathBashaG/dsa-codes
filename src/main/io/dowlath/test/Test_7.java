package src.main.io.dowlath.test;

// Output : x ...: 5 y....: 10
public class Test_7 {
    public static void main(String[] args) {
        int x = 5,y =10;
        swap(x,y);
        System.out.println("x ...: "+ x +" y....: "+y);
    }
    static  void swap(int x, int y){
        int tmp = x;
         x = y;
         y = tmp;
    }
}
