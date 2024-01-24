import java.util.Arrays;
import java.util.Scanner;

public class Discus_Throw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCases = sc.nextInt();
        int [] array = new int[3];
        while(testCases-->0) {
            for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();
            Arrays.sort(array);
            System.out.println(array[array.length - 1]);
        }
    }
}
