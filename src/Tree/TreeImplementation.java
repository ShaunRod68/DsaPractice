package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeImplementation {
    //subtree child trees child nodes which have a child
    //Degree: Number of direct childs
    //Leaf nodes; No child
    //Ancestors
    //Decendents
    //Level of tree starts from 0 only applies to trees
    //Height - maximum dept
    //Weight - weigth


    //Binary Tree
    //Every node Either has 1,2 or 0 child nodes
    //Complete binary- All leaf nodes must be same level
    //Strict Binary tree- Every node has either 2 or 0 child
    //Full Binary tree-
    //Extended Binary Tree- Extend a node to have a Strict binary tree

    //Ways to traverse a tree
    //1. Level order traversing(BFS)(Queue)
    //2. Depth First Search
        //Inorder
        //Preorder
        //Postorder

    //In Binary Tree Data is Added Sequentially
    public static void main(String[] args) {
        //Manual
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        TreeImplementation ti = new TreeImplementation();
        ti.LOT(root);

    }
    void postOrderR(Node root){
        if (root!=null){
            postOrderR(root.left);
            postOrderR(root.right);
            System.out.println(root.data+" ");
        }
    }
    public void LOT(Node root){
        Queue<Node> q = new LinkedList<>();
        if (root==null){
            System.out.println("no data");
            return;
        }
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.println(curr.data+" ");
            if (curr.left!=null){
                q.add(curr.left);
            }
            if (curr.right!=null){
                q.add(curr.right);
            }
        }
    }
}
class TreeHelper{

}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
