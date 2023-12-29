package TreesJava;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node {
        public int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static class Binarytree {
            static int index = -1;
            public static Node buildTree(int nodes[]) {
                index++;
                if(nodes[index]==-1){
                    return null;
                }
                Node newNode = new Node(nodes[index]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }
        }
        public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        Preorder(root.left);
        Preorder(root.right);
        }
        public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
        }
        public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data);
        }
        public static int CountNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnodes = CountNodes(root.left);
        int rightnodes = CountNodes(root.right);
        return leftnodes+rightnodes+1;
        }

        public static int Sumnodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnodes = Sumnodes(root.left);
        int ridhtnodes = Sumnodes(root.right);

        return leftnodes+root.data+ridhtnodes;

        }

        public static int Heightnodes(Node root){
           if(root==null){
               return 0;
           }
           int leftheight = Heightnodes(root.left);
           int rightheight = Heightnodes(root.right);

           int height = Math.max(leftheight,rightheight)+1;
           return height;
        }

        public static int Diameternodes(Node root){
        if(root==null){
            return 0;
        }
        int diam1 = Diameternodes(root.left);
        int diam2 = Diameternodes(root.right);
        int height = Heightnodes(root.left)+Heightnodes(root.right) + 1;

        return Math.max(height,Math.max(diam1,diam2));
        }


        public static void Levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> Q = new LinkedList<>();
          Q.add(root);
          Q.add(null);
          while(!Q.isEmpty()){
              Node curr = Q.remove();
              if(curr == null){
                  System.out.println();
                  if(Q.isEmpty()) {
                      break;
                  }
                  else{
                      Q.add(null);
                  }
              }
              else{
                  System.out.print(curr.data);
                  if (curr.left !=null){
                      Q.add(curr.left);
                  }
                  if(curr.right != null){
                      Q.add(curr.right);
                  }
              }

          }
        }



    }
