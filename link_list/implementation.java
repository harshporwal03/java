public class implementation 
{
  public static class Node 
  {
    int data;
    Node next;
    Node (int data) 
    {
      this.data=data;
    }
  } 
  public static class linkedlist 
  {
    Node head=null;
    Node tail=null;
    int size=0;

    void insertAtEnd(int val)
    {
      Node temp = new Node(val);
      if (head==null)
      {
        head=temp;
      }
      else
      {
        tail.next=temp;
      }
      tail=temp;
      size++;
    }


    void insertAtBeginning(int val)
    {
      Node temp = new Node(val);
      if(head==null)
      {
        head=tail=temp;
      }
      else{
        temp.next=head;
        head=temp;
      }
      size++;
    }


    void insertAt(int indx, int val)
    {
      Node t = new Node(val);
      Node temp = head;
      if(indx==size)
      {
        insertAtEnd(val);
        return;
      }
      else if(indx==0)
      {
        insertAtBeginning(val);
        return;
      }
      else if(indx<0 || indx>size)
      {
        System.out.println("Invalid index");
        return;
      }
      for (int i=0; i<indx-1;i++)
      {
        temp=temp.next;
      }
      t.next = temp.next;
      temp.next = t;
      size++;
    }


    int getAt(int indx)
    {
      if(indx<0 || indx>size)
      {
        System.out.println("Invalid index");
        return -1;
      }
      Node temp=head;
      for(int i=0;i<indx;i++)
      {
        temp=temp.next;
      }
      return temp.data;
    }


    void deleteAt(int indx)
    {
      Node temp=head;
      if(indx==0)
      {
        head=head.next;
        size--;
        return;
      }
      for(int i=0;i<indx-1;i++)
      {
        temp=temp.next;
      }
      temp.next = temp.next.next;
      if(indx==size-1)
      {
        tail=temp;
      }
      size--;
    }

    void display()
    {
      Node temp=head;
      while(temp!=null)
      {
        System.out.print(temp.data + " ");
        temp=temp.next;
      }
      System.out.println();
    }


    // int size()
    // {
    //   Node temp=head;
    //   int c=0;
    //   while(temp!=null)
    //   {
    //     c++;
    //     temp=temp.next;
    //   }
    //   return c;
    // }
  }
  public static void main(String[] args) 
  {
    linkedlist ll = new linkedlist();
    ll.insertAtEnd(5);
    ll.insertAtEnd(6);
    ll.insertAtBeginning(55);
    //ll.display();
    //System.out.println(ll.size());
    ll.insertAtBeginning(2);
    //ll.display();
    //System.out.println(ll.size());
    ll.insertAt(1,45);
    //ll.display();
    ll.insertAt(2,95);
    ll.display();
    ll.deleteAt(4);
    ll.display();
    // System.out.println(ll.getAt(6));
    //System.out.println(ll.size);

  }
}
