public class Main {
    static int checkPerfectSquare(int N){
        if (N%Math.sqrt(N)==0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(checkPerfectSquare(49));
    }
}