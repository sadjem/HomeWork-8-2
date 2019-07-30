package HomeWork82;

//Объединить 2 бинарных дерева

public class Main {
    public static void main(String[] args) {
        Entry firstTree = new Entry(1);
        firstTree.left = new Entry(3);
        firstTree.right = new Entry(2);
        firstTree.left.left = new Entry(5);

        Entry secondTree = new Entry(2);
        secondTree.left = new Entry(1);
        secondTree.right   = new Entry(3);
        secondTree.left.right = new Entry(4);
        secondTree.right.right = new Entry(7);

        BTreePrinter.printNode(firstTree);

        BTreePrinter.printNode(secondTree);

        BTreePrinter.printNode(mergeTrees(firstTree,secondTree));


    }
    private  static  Entry mergeTrees (Entry t1, Entry t2){
        if (t1 == null){
            return t2;
        }
        if (t2 == null){
            return t1;
        }
        t1.value += t2.value;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
