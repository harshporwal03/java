public class doublyLL {
  public static class Node 
  {
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
      this.data = data;
    }
  }


  public static void display(Node head)
    {
      Node temp=head;
      while(temp!=null)
      {
        System.out.print(temp.data + " ");
        temp=temp.next;
      }
      System.out.println();
    }

    public static void displayrev(Node tail)
    {
      Node temp=tail;
      while(temp!=null)
      {
        System.out.print(temp.data + " ");
        temp=temp.prev;
      }
      System.out.println();
    }


    public static void display2(Node random)  //you will be given random Node
    {
      Node temp=random;
      //Move this temp backwards to the head
      while(temp.prev!=null)
      {
        temp=temp.prev;
      }
      //now temp is at head
      //print the list
      while(temp!=null)
      {
        System.out.print(temp.data + " ");
        temp=temp.next;
      }
      System.out.println();
    }

    public static Node insertAtHead(Node head ,int val)
    {
      Node t = new Node(val);
      t.next = head;
      head.prev = t;
      head=t;
      return head;
    }

    public static void insertAtEnd(Node head ,int val)
    {
      Node temp = head;
      //take temp to the tail
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      Node t = new Node(val);
      temp.next=t;
      t.prev=temp;
    }

    public static void insertAtIdx(Node head ,int idx ,int val)
    {
      Node t = new Node(val);
      Node s = head;
      for(int i=0;i<idx-1;i++)
      {
        s=s.next;
      }
      Node r = s.next;
      s.next=t;
      t.prev=s;
      t.next=r;
      r.prev=t;
    }

  public static void main(String[] args) 
  {
    Node a = new Node(4);
    Node b = new Node(10);
    Node c = new Node(2);
    Node d = new Node(99);
    Node e = new Node(13);
    a.prev = null;
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = null;

    display(a);
    // displayrev(e);
    // display2(c);
    // Node newHead = insertAtNode(a, 25);
    // display(newHead);
    // insertAtEnd(a, 36);
    // display(a);
    insertAtIdx(a, 3, 55);
    display(a);

  }
}
