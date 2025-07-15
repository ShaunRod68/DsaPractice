package LinkedList;

public class MergeTwo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6,8};
        int[] arr2 = {3,5,7,8};
        LinkeddList ll = new LinkeddList();
        Node firstLinkedList = ll.createLinkedList(arr1);
        ll.displayLinkedList(firstLinkedList);
        Node secondLinkedList = ll.createLinkedList(arr2);
        ll.displayLinkedList(secondLinkedList);
        Node mergedLinkedList = ll.mergeSortedLinkedList(firstLinkedList, secondLinkedList);
        ll.displayLinkedList(mergedLinkedList);
    }
}
class LinkeddList{
    public Node mergeSortedLinkedList(Node first,Node second){
        if(first==null && second==null){
            return null;
        }else if (first==null){
            return second;
        }else if (second==null){
            return first;
        }else {
            Node mainTemp = null;
            Node head = null;
            Node temp1 = first;
            Node temp2 = second;
            while (temp1!=null && temp2!=null){
                if(head==null){
                    if(first.data >= second.data){
                        head = second;
                        temp2 = temp2.next;
                    }else {
                        head = first;
                        temp1 = temp1.next;
                    }
                    mainTemp = head;
                }else {
                    if(temp1.data >= temp2.data){
                        mainTemp.next=temp2;
                        mainTemp = mainTemp.next;
                        temp2=temp2.next;
                    }else {
                        mainTemp.next = temp1;
                        mainTemp=mainTemp.next;
                        temp1 = temp1.next;
                    }
                }
            }
            if(temp1!=null){
                mainTemp.next=temp1;
            } else if (temp2!=null) {
                mainTemp.next=temp2;
            }
            return head;
        }
    }
    public Node createLinkedList(int[] arr){
        Node start = new Node(arr[0]);
        Node temp = start;
        for(int i = 1;i< arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return start;
    }
    public void displayLinkedList(Node start){
        Node temp = start;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
    }
}