package io.dowlath.dsa.leetcode.array;

public class MostFrequencyWord {
    public static void main(String[] args) {
        String a[] = {"one", "fish", "two", "fish", "red", "fish", "blue", "fish"};
        int n = a.length;
        mostFrequency(a,n);
    }

    private static void mostFrequency(String[] a, int n) {
        int freq = 0;
        String result = "";
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j= i+1; j<n;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count >= freq){
                result = a[i];
                freq = count;
            }
        }
        System.out.println("The word occurs most ... : "+ result);
        System.out.println("No of time... : "+freq);
    }


}
