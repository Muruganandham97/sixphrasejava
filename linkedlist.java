06-05-2025
   
DATA STRUCTURE 

LINKED LIST

1. TO PRINT AND COUNT IN DATA STRUCTURE


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SLL{
   Node head;
   void insert(int data){
      Node newnode = new Node(data);
      newnode.next = head;
      head = newnode;
   }
   void display(){
     Node temp = head;
     while(temp != null){
        System.out.println(temp.data + " ");
        temp = temp.next;
     }
   }
   void count(){
     Node temp = head;
     int count = 0;
     while(temp !=null){
        count++;
        temp = temp.next;
     }
     System.out.println(count);
   }
}

public class linkedlist {
    public static void main(String[] args) {
        SLL list = new SLL();
      list.insert(10);
     list.insert(20);
      list.insert(30);
      list.display();
      list.count();
    }}



2.TO SUM THE LIST

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SLL{
   Node head;
   void insert(int data){
      Node newnode = new Node(data);
      newnode.next = head;
      head = newnode;
   }
   void display(){
     Node temp = head;
     while(temp != null){
        System.out.println(temp.data + " ");
        temp = temp.next;
     }
   }
   void count(){
     Node temp = head;
     int count = 0;
     while(temp !=null){
        count++;
        temp = temp.next;
     }
     System.out.println(count);
   }
   void sum(){
     Node temp = head;
     int sum = 0;
     while(temp!=null){
        sum += temp.data;
        temp = temp.next;

     }
     System.out.println(sum);
     
   }
}

public class linkedlist {
    public static void main(String[] args) {
        SLL list = new SLL();
      list.insert(10);
     list.insert(20);
      list.insert(30);
      list.display();
      list.count();
      list.sum();
    }}


3.TO FIND THE COUNT GREATER THAN 10

void lesser(){
     Node temp = head;
     int countless = 0;
     while(temp!= null){
        if(temp.data > 10){
           countless++;
        }
        temp = temp.next;
     }
     System.out.println(countless);

   }

4.TO FIND THE SUM OF EVEN NUMBER

void lesser(){
     Node temp = head;
     int sumeven = 0;
     while(temp!= null){
        if(temp.data % 2==0){
           sumeven += temp.data ;
        }
        temp = temp.next;
     }
     System.out.println(sumeven);

   }

5.TO FIND THE MAXIMUM OF NUMBER

void max(){
     Node temp = head;
     int maximum = temp.data;
     while(temp!= null){
        if(maximum < temp.data){
           maximum = temp.data;
        }
        temp = temp.next;
     }
     System.out.println(maximum);

   }
6.TO FIND THE MINIMUM OF NUMBER


void min(){
     Node temp = head;
     int minimum = temp.data;
     while(temp!= null){
        if(minimum > temp.data){
           minimum = temp.data;
        }
        temp = temp.next;
     }
     System.out.println(minimum);

   }

7.
