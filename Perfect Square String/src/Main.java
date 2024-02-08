public class Main {
    static int isSquare(String S) {
        int sum=0;
        for (char ch:S.toCharArray()){
            int ascii=(int)ch;
            sum+=ascii;
        }
        int sq=(int)Math.sqrt(sum);
        if (sq*sq==sum) return 1;
        return 0;
    }
    public static void main(String[] args) {
        String s="d";
        System.out.println(isSquare(s));
    }
}