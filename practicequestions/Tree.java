/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

/**
 *
 * @author meloj
 */
public class Tree {
    
    private TreeNode root;
    
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }
    
    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }
    
    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }
    
    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
    }
    
    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        
        return null;
    }
    
    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }
    
    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    //Deleting a Node
    public void delete(int value) {
        root = delete(root, value);
    }
    
    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return subTreeRoot;
        }
        
        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            //Cases 1 and 2 :
            //Case 1 : Delete a Leaf Node
            //Case 2 : Delete one child
            
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }

            //Case 3 : Delete two or more children
            subTreeRoot.setData(subTreeRoot.getRightChild().min());            
            
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }
        
        return subTreeRoot;
    }
}

class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        
        System.out.println(intTree.get(29));
        System.out.println(intTree.get(58));
        
        System.out.println(intTree.min());
        System.out.println(intTree.max());
        
        intTree.delete(15);
        intTree.delete(27);
        intTree.traverseInOrder();
        
    }
}
