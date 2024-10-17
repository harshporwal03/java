public class basic {
  public static class Node {
    int data; //value
    Node next; //address of next node
    Node (int data)
    {
      this.data = data;
    }
  }
public static void main(String[] args) {
  Node a = new Node(10); //head
  Node b = new Node(20);
  Node c = new Node(30);
  Node d = new Node(40);
  Node e = new Node(50);

  a.next = b;
  b.next = c;
  c.next = d;
  d.next = e;

  System.out.println("data of a : " + a.data);
  //or
  System.out.println("data of b : " + a.next.data);
  System.out.println("address of c : " + b.next);
  display(a);
  System.out.println();
  display_recursively(a);
  System.out.println();
  reverse(a);
  System.out.println();
  System.out.println("length : " + length(a));
  insertAtEnd(a,87);
  display(a);

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //DISPLAYING A LINK LIST

  // Node temp = a;
  // for(int i=1; i<=5 ; i++)
  // {
  //   System.out.print(+temp.data + " ");
  //   temp=temp.next;
  // }

 ///////////////////////////////////////////////////////////////////////

 // Node temp = a;
// while(temp!=null)
// {
//   System.out.print(+temp.data + " ");
//   temp=temp.next;
// }

  //////////////////////////////////////////////////////////////////////
}
public static void display(Node head)
{
  Node temp = head;
  while(temp!=null)
  {
    System.out.print(+temp.data + " ");
    temp=temp.next;
  }
}

public static void display_recursively(Node head)
{
   if(head==null) return;
   System.out.print(+head.data + " ");
   display_recursively(head.next);
}

public static void reverse(Node head)
{
   if(head==null) return;
   reverse(head.next);
   System.out.print(+head.data + " ");
}

public static int length(Node head)
{
  int c=0;
  Node temp = head;
  while(temp!=null)
  {
    c++;
    temp=temp.next;
  }
  return c;
}

public static void insertAtEnd(Node head, int val)
{
  Node temp = new Node(val);
  Node t=head;
  while(t.next != null)
  {
    t=t.next;
  }
  t.next=temp;
}
}
