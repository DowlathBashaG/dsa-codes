package src.main.io.dowlath.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// Output :  [0, 10, 2, abc]
public class Test_6 {
    public static void main(String[] args) {
        String[] a = {"abc","2","10","0"};
        List<String> list = Arrays.asList(a);
        Collections.sort(list);
        System.out.println(Arrays.toString(a));
    }

}
