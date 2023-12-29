package TreesJava;

import TreesJava.BinaryTree;

    public class Main {
        public static void main(String[] args) {
            BinaryTree.Binarytree tree = new BinaryTree.Binarytree();
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree.Node rootNode =  tree.buildTree(nodes);
            //System.out.println(rootNode.data);
            BinaryTree.Preorder(rootNode);
            System.out.println();
            BinaryTree.Inorder(rootNode);
            System.out.println();
            BinaryTree.Postorder(rootNode);
            System.out.println();
            BinaryTree.Levelorder(rootNode);
        }
    }