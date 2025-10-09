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

function invertTree(root: TreeNode | null): TreeNode | null {
    // 递归终止条件：如果节点为空，直接返回null
    if (root === null) {
        return null;
    }
    
    // 递归翻转左子树
    const left = invertTree(root.left);
    // 递归翻转右子树
    const right = invertTree(root.right);
    
    // 交换当前节点的左右子树
    root.left = right;
    root.right = left;
    
    // 返回翻转后的当前节点
    return root;
}
