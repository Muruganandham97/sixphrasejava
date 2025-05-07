// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc .nextInt();
//         int[] arr = new int[size];
//         int caba = sc.nextInt();
//         int cabb = sc.nextInt();
//         int l = 0;
//         int r = arr.length-1;
//         int a = caba;
//         int b = cabb;
//         int count = 0;
//         for(int i = 0;i<=size;i++){
//             arr[size] = sc .nextInt();
//         }
//         for(int i = 0;i<=size;i++){
//             System.out.println(arr[i]);
//         }
//         while(i<j){
//             if(caba>=arr[l]){
//                 caba = a-arr[l];
//                 l++;
//             }
//             else{
//                 caba = a-arr[l];
//                 count++;
//             }
//         }if(cabb>=arr[r]){
//             cabb = b-arr[r];
//             r--;
//         }
//         else{
//             cabb=b-arr[r];
//             count++;
//         }
//         if(l==r){
//             math.max(caba,cabb)>arr[r];
//             count++;
//         } 
//         return count;
              
//     }
//     }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();            // size of the array
//         int[] arr = new int[size];
//         int a = sc.nextInt();               // initial capacity for left
//         int b = sc.nextInt();               // initial capacity for right

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();          // read array elements
//         }

//         int caba = a;
//         int cabb = b;
//         int l = 0;
//         int r = size - 1;
//         int count = 0;

//         while (l < r) {
//             if (caba >= arr[l]) {
//                 caba -= arr[l];
//                 l++;
//             } else {
//                 caba = a - arr[l];
//                 l++;
//                 count++;
//             }

//             if (cabb >= arr[r]) {
//                 cabb -= arr[r];
//                 r--;
//             } else {
//                 cabb = b - arr[r];
//                 r--;
//                 count++;
//             }
//         }

//         // Handle the middle item if l == r
//         if (l == r) {
//             if (Math.max(caba, cabb) < arr[l]) {
//                 count++;
//             }
//         }

//         System.out.println("Refill count: " + count);
//     }
// }
// import java.util.*;

// import javax.sound.sampled.SourceDataLine;
// public class Main {
//     public static void main(String[] args){
//         int[] arr ={1 2 3 4 5};
//         int ws = 0;
//         int k = 2;
//         int c = 0;
//         for(int i =0;i<=k;i++){
//             ws = ws + arr[i];
//             c++;
//         }
//         for(int i = k;i<=5;i++){
//             ws = ws+arr[i]+arr[i-k];

//         }
//         System.out.println(c);
//     } 
// // }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
        
//         int[] arr = {10,20,30,40,50};

//         int ws = 0; 
//         int k = 2;  
//         int c = 0;  
//         double avg = 1;
        
       
//         for (int i = 0; i < k; i++) {
//             ws = ws + arr[i];
//         }
//         c++; 

        
//         for (int i = k; i < arr.length; i++) {
            
//             ws = ws - arr[i - k] + arr[i];
//             c++;
//         }if(c!=0){
//              avg = ws/5;
//         }

//         System.out.println( c);
//         System.out.print(avg);
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {10,20,30,40,50};
//         int max = arr[0];
//         int k = 2;
        
//         for (int i = 0; i < k; i++) {
//             if(max>arr[i])
//              max =  arr[i];
             
//                     }
//                     for (int i = k; i < 5; i++) {
//                         if(max>arr[i])
//                          max =  arr[i];
//                          }
//                          System.out.println(max);
                    

        
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int[][] arr = new int[a][b];
//         int sumrow = 0;
//         int sumcol = 0;
       
//         for(int i =0;i<a;i++)
//         {
//             for(int j =0;j<b;j++)
//             {
//             arr[i][j] = sc.nextInt();
//              }
//         }
//         for(int i =0;i<a;i++)
//         { 
//            for(int j =0;j<b;j++)
//            {
//              System.out.print(arr[i][j]+" ");    
//            }
//            System.out.println();
//     } 
//     for(int i =0;i<a;i++)
//         { 
//            if(i%2==0){
//             for(int j = 0;j<arr.length;j++){
//                 System.out.print(arr[i][j]+ " ");
//             }
//            }else{
            
//             for(int j = arr.length;j>0;j--){
//                 System.out.print(arr[i][j]+" ");
//             }}
//            }
          
//     } 
//        }
// data structure

// class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     class SLL{
//        Node head;
//        void insert(int data){
//           Node newnode = new Node(data);
//           newnode.next = head;
//           head = newnode;
//        }
//        void display(){
//          Node temp = head;
//          while(temp != null){
//             System.out.println(temp.data + " ");
//             temp = temp.next;
//          }
//        }
//        void count(){
//          Node temp = head;
//          int count = 0;
//          while(temp !=null){
//             count++;
//             temp = temp.next;
//          }
//          System.out.println(count);
//        }
//        void sum(){
//          Node temp = head;
//          int sum = 0;
//          while(temp!=null){
//             sum += temp.data;
//             temp = temp.next;

//          }
//          System.out.println(sum);
         
//        }
//        void min(){
//          Node temp = head;
//          int minimum = temp.data;
//          while(temp!= null){
//             if(minimum > temp.data){
//                minimum = temp.data;
//             }
//             temp = temp.next;
//          }
//          System.out.println(minimum);

//        }
//     }
    
//     public class linkedlist {
//         public static void main(String[] args) {
//             SLL list = new SLL();
//           list.insert(10);
//          list.insert(25);
//           list.insert(30);
//           list.insert(50);
//           list.insert(60);
//           list.display();
//           list.count();
//           list.sum();
//           list.min();
//         }}

import java.util.*;
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
                  }}
void insert(int data,int position){
   if(position==1)
   {
     Node newNode = head;
      head = newNode; 
      newNode.next = head;
   }
   Node temp = head;
   int count = 1;
   for(int i = 1;i<=position;i++){
      count++;
      if(temp!=null&&count<position)
      {
         temp = temp.next;
      }
   }
   if(temp == null)
   {
      System.out.println("Position out of bounds");
   }
}}
public class linkedlist {
           public static void main(String[] args) {
               SLL list = new SLL();
               Scanner sc = new Scanner(System.in);
               list.insert(10);
               list.insert(30);
               list.insert(40);
               list.insert(50);
               int position = sc.nextInt();
               int data = sc.nextInt();
               list.insert(data, position);
               list.display();
            }
         }
