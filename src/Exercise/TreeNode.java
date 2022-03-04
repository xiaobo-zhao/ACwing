package Exercise;

public class TreeNode {
    public int value;
    public TreeNode leftNode;
    public TreeNode rightNode;
    public TreeNode(int x){
        value=x;
        leftNode=null;
        rightNode=null;
    }
    public void preTraverseTree(TreeNode root){
            if (root==null){
                return;
            }
        System.out.println(root.value);
            preTraverseTree(leftNode);
            preTraverseTree(rightNode);

    }
}
