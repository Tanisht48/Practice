import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}
class LList{    //LList -> LinkedList
Node head;
Node tail;

    LList(Node h, Node t){
        head = h;
        tail = t;
    }
    LList(){

    }

    void addNode(Node node){
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
    void printLL(){
        Node tmp = head;
        while(tmp != null ){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}

public class LinkedListImplement {

    public static void main(String[] args) {
            //n = 5 -> 1 2 3 4 5
            Scanner scn = new Scanner(System.in);
            LList linkedList = new LList();

            int n = scn.nextInt();  //5

            while( n-- > 0){
                int val = scn.nextInt();
                Node newNode = new Node(val);
                linkedList.addNode(newNode);
            }

            linkedList.printLL();


        }
    }

