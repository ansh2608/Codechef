public class LL_Cycle {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node detectCycle(Node head){
        if (head==null || head.next==null) return null;
        Node slow=head,fast=head;
        boolean isCycle=false;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast) {
                isCycle=true;
                break;
            }
        }
        if (!isCycle) return null;
        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(8);
        a.next=b;
        b.next=c;
        c.next=b;
        Node ans=detectCycle(a);
        System.out.println(ans.data);
    }
}
