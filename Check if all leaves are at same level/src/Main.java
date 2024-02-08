import java.util.HashSet;
public class Main {
    public static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static void ans(Node root,HashSet<Integer> hs,int level){
        if (root==null) return;
        ans(root.left, hs, level+1);
        if (root.left==null && root.right==null) hs.add(level);
        ans(root.right, hs, level+1);
    }
    public static boolean check(Node root){
        HashSet<Integer> hs=new HashSet<>();
        ans(root,hs,0);
        return hs.size()==1;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(20);
        Node b=new Node(30);
        root.left=a;
        root.right=b;
        Node c=new Node(10);
        Node d=new Node(15);
        a.left=c;
        a.right=d;
        System.out.println(check(root));
    }
}