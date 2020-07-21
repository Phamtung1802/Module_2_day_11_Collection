package demobst;

class TreeNode {
    protected Integer element;
    protected TreeNode left;
    protected TreeNode right;


    public TreeNode(Integer integer) {
        element = integer;
        this.left=null;
        this.right=null;
    }

    public boolean search(Integer element) {
        TreeNode current = this;
        while (current != null) {
            if (element < current.element) {
                current = current.left;
                System.out.println("left");
            } else if (element > current.element) {
                current = current.right;
                System.out.println("right");
            } else
                return true;
        }
        return false;
    }


    public String getSide(Integer value){
        if(this.search(value)==true){
            return "Found";
        }
        else return "Not Found";
    }
    public void display(TreeNode root){
        if(root!=null){
            display(root.left);
            System.out.print(" " + root.element);
            display(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(60);
        root.left = new TreeNode(55);
        root.right = new TreeNode(100);
        root.right.right=new TreeNode(120);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(45);
        System.out.println(root.getSide(45));
        root.display(root);
    }
}



