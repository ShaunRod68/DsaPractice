package Tree;


public class BinarySearchTree {
    public static void main(String[] args) {
        BSTHelper bst = new BSTHelper();
        Node root = null;
        root = bst.insert(root,100);
        root = bst.insert(root,75);
        root = bst.insert(root,120);
        root = bst.insert(root,50);
        root = bst.insert(root,110);
        root = bst.insert(root,175);
        root = bst.insert(root,165);
        root = bst.insert(root,60);
        root = bst.insert(root,55);
        bst.display(root);
        //Binary Search Deletion
        //Case 1 Leaf Nodes can be deleted
        //Case 2 InOrder Predecessor largest left uses when 2 leaf nodes deleting nodes with 2 leaf nodes
        //Case 3 InOrder Successor smallest right uses whhen 2 leaf nodes
        System.out.println();
        bst.findElement(root,55);
        System.out.print("For Loop: ");
        for(int i = 1;i<=5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        // TODO: Print numbers 1 to 5 using while loop
        System.out.print("While Loop: ");
        int i = 1;
        while(i<=5){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        // TODO: Print numbers 1 to 5 using do-while loop
        System.out.print("Do-While Loop: ");
        int j = 1;
        do{
            System.out.print(j+" ");
            j++;
        }while(j<=5);
    }
}
class BSTHelper{

    Node delete(Node root,int key){
        if (root==null){
            return null;
        }
        if (key<root.data){
            root.left=delete(root,key);
        } else if (key>root.data) {
            root.right=delete(root,key);
        }else {
            if (root.left==null & root.right==null){
                return null;
            }else if (root.left == null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            Node min1 = inorderSuccessor(root.right);
            root.data=min1.data;
            root.right=delete(root.right,min1.data);
        }
        return null;
    }

    private Node inorderSuccessor(Node root) {
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    Node findElement(Node root,int target){
        if (root.left!=null && root.right!=null){
            findElement(root.left,target);
            if (root.left.data==target || root.right.data==target){
                System.out.println(root.data);
                return root;
            }
            findElement(root.right,target);
        }
        return null;
    }
    Node insert(Node root,int data){
        if (root==null){
            return new Node(data);
        }
        if (data<root.data){
            root.left = insert(root.left,data);
        }
        if (data>root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    void display(Node root){
        if (root!=null){
            display(root.left);
            System.out.print(root.data+",");
            display(root.right);
        }
    }
}

