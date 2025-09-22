/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function maxDepth(root: TreeNode | null): number {
    let ans = 0;
    const search = (temp,root) => {
        if(!root) return;
        temp++;
        ans = Math.max(temp,ans);
        search(temp,root.left);
        search(temp,root.right);
        
    }

    search(0,root)
};