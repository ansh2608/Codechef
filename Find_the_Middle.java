public class Find_the_Middle {
    static class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }
    static int getMiddleElement(Node head){
        Node slow=head,fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(getMiddleElement(a));
    }
}
