public class Crits_in_a_LL {
     static class Node{
         int val;
         Node next;
         Node(int x){
            val = x;
            next = null;
         }
    }
    static int solve(Node root){
         Node prev=root, curr=root.next, Next=root.next.next;
         int count=0;
         while (curr.next!=null){
             if ((prev.val<curr.val && curr.val>Next.val) || (prev.val>curr.val && curr.val<Next.val)) count++;
             prev=prev.next;
             curr=curr.next;
             Next=Next.next;
         }
         return count;
    }
    public static void main(String[] args) {
         Node a=new Node(1);
         Node b=new Node(2);
         Node c=new Node(3);
         Node d=new Node(2);
         Node e=new Node(1);
         Node f=new Node(3);
         Node g=new Node(2);
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         f.next=g;
        System.out.println(solve(a));
    }
}
