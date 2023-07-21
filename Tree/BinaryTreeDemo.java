package binarytree;

public class BinaryTreeDemo {

	public static boolean areMirrorTrees(Node a_root, Node b_root) {
	   if(a_root == null && b_root == null) {
	    return true;
	   }
           if(a_root == null || b_root == null) {
            return false;
           }
         
           return a_root.data == b_root.data &&
                areMirrorTrees(a_root.left, b_root.right) &&
                areMirrorTrees(a_root.right, b_root.left);
        }
     
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.print();
		System.out.println(bt.height());
	}
}
