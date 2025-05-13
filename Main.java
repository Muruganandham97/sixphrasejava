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
// 2. Stack basic program in array
import java.util.*;
public class Main{
    public static void main(String[] args){
        Stack st = new Stack(3);
        st.push(10);
         st.push(20);
          st.push(30);
         
          System.out.println(st.peek());
           System.out.println(st.pop());
         System.out.println(st.isEmpty());
    }
}
class Stack{
    int size;
    int[] arr;
    int top;
    Stack(int size){
        this.size = size;
         this.arr = new int[size]; 
        top = -1;
    }

void push(int data){
    if(top==arr.length-1){
        System.out.println("Stack full");
    }
    else{
        arr[++top]=data;
    }
}

int peek() {
    if(top==-1){
        System.out.println("Stack full");
         return -1; 
    }else{
        return arr[top];
    }
}
int pop(){
    if(top==-1){
        System.out.println("Stack full");
        return -1;
    }
    else{
        return arr[top--];
    }
}
  boolean isEmpty() {
    return top == -1;
}
}