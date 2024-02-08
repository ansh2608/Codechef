public class Main {
    static int numOfPerfectSquares(int a, int b) {
        int x=(int)Math.ceil(Math.sqrt(a));
        int y=(int)Math.floor(Math.sqrt(b));
        return (y-x+1);
    }
    public static void main(String[] args) {
        int a = 8145, b = 23097;
        System.out.println(numOfPerfectSquares(a,b));
    }
}