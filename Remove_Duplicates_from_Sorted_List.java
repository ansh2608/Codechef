public class Remove_Duplicates_from_Sorted_List {
    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }
    static Node removeDuplicates(Node head) {
        Node temp=head;
        while (temp!=null && temp.next!=null){
            if (temp.data == temp.next.data) temp.next=temp.next.next;
            else temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node temp=removeDuplicates(a);
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
