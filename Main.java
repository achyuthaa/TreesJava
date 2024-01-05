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
            System.out.println(BinaryTree.CountNodes(rootNode));
            System.out.println(BinaryTree.Sumnodes(rootNode));
            System.out.println(BinaryTree.Heightnodes(rootNode));
            System.out.println(BinaryTree.Diameternodes(rootNode));
            System.out.println(BinaryTree.Diameternodes(rootNode));
            int nodeu[] = {5,1,3,4,2,7};
            BinaryTree.Node root = null;
            for(int i =0;i<nodeu.length;i++) {
                root = BinaryTree.Binarytree.buildBST(root, nodeu[i]);
            }
            //System.out.println();
            BinaryTree.Inorder(root);
            BinaryTree.deleteBST(root,4);
            System.out.println();
            BinaryTree.Inorder(root);



        }
    }