package day18;

public class Task3 {
    public static void main(String[] args) {

        Node root = new Node();

        int[] array = {20,14,11,16,18,15,5,8,23,22,27,24,150};
        for (int x:array)
            root.add(x,root);

        root.dfs(root);
    }
}