package day18;

public class Node {

    private int value;
    private Node left;
    private Node right;

    public void add(int value, Node node){

        if (this.value == 0){
            this.value = value;
        }
        else if(value < this.value){

            if (left == null) {
                left = new Node();
                left.add(value,left);
            }else{
                left.add(value,left);
            }
        }else if(value > this.value){

            if(right == null){
                right = new Node();
                right.add(value,right);
            }else {
                right.add(value,right);
            }
        }
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void dfs(Node node){

        if (node == null)
            return;

        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }
}
