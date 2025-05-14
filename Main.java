//1. Stack basic program
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Stack st = new Stack(3);
//         st.push(10);
//          st.push(20);
          
//           System.out.println(st.pop());
//           System.out.println(st.peek());
//          System.out.println(st.isEmpty());
//     }
// }
// 2. Stack basic program in array  to push , empty , pop 
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Stack st = new Stack(3);
//         st.push(10);
//          st.push(20);
//           st.push(30);
         
//           System.out.println(st.peek());
//            System.out.println(st.pop());
//          System.out.println(st.isEmpty());
//     }
// }
// class Stack{
//     int size;
//     int[] arr;
//     int top;
//     Stack(int size){
//         this.size = size;
//          this.arr = new int[size]; 
//         top = -1;
//     }

// void push(int data){
//     if(top==arr.length-1){
//         System.out.println("Stack full");
//     }
//     else{
//         arr[++top]=data;
//     }
// }

// int peek() {
//     if(top==-1){
//         System.out.println("Stack full");
//          return -1; 
//     }else{
//         return arr[top];
//     }
// }
// int pop(){
//     if(top==-1){
//         System.out.println("Stack full");
//         return -1;
//     }
//     else{
//         return arr[top--];
//     }
// }
//   boolean isEmpty() {
//     return top == -1;
// }
// }
//3.stack using Queue
class MyQueue {
    int size;
    int[] arr;
    int f;
    int r;

    MyQueue(int size) {
        this.size = size;
        arr = new int[size];
        f = -1;
        r = -1;
    }
    int dequeue() {
        if (f == -1 || f > r) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int val = arr[f];
            f++;
            return val;
        }
    }

    void enqueue(int d) {
        if (r == size - 1) {
            System.out.println("Queue is full");
        } else if (f == -1 && r == -1) {
            f = 0;
            r = 0;
            arr[r] = d;
        } else {
            r++;
            arr[r] = d;
        }
    }

    int peek() {
        if (f == -1 || f > r) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(30);
        q.enqueue(20);
        System.out.println(q.peek()); 
        System.out.println(q.dequeue());
    }
}
