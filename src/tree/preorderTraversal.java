package com.method.tree;


import com.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
//逆向扁平化
//二叉树前序遍历
public class preorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preorder(root, result);
        return result;
    }
    public void preorder(TreeNode root,List<Integer> ans) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return;
        else{
            preorder(root.getLeft(),list);
            preorder(root.getRight(),list);
        }
    }

}

