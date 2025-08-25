/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxDepth = function(root) {
    if(!root) return;
    const left = maxDepth(root.left);
    const right = maxDepth(root.right);

    return Math.max(left,right)+1;
    
};

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxDepth = function(root) {
    let ans = 0;
    const dfs = (temp,root)=>{
        if(!root) return;
        temp++;
        if(temp > ans) ans = temp;
        dfs(temp,root.left);
        dfs(temp,root.right);


    }
    dfs(0,root);
    return ans;
};