package io.dowlath.dsa.leetcode.string;
/*
        O/P :  License Key ... : 5F3Z-2E9W
 */
public class License_Key_Formatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println("License Key ... : "+ licenseKeyFormatting(s,k));
    }

    private static String licenseKeyFormatting(String s,int k) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '-') continue;
            if(count == k) {
                output.append('-');
                count = 0;
            }
            output.append(s.charAt(i));
            count++;
        }
        return output.reverse().toString().toUpperCase();
    }

}
