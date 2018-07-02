package structuralPattern.compositePattern;

/**
 * 组合模式（Composite）
   组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
   使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 */
public class TreeTest {

    TreeNode root = null;

    public TreeTest(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        TreeTest tree = new TreeTest("A");

        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
