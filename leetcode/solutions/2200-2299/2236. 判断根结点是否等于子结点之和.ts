
class TreeNode {
     val: number
     left: TreeNode | null
     right: TreeNode | null
     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
         this.val = (val===undefined ? 0 : val)
         this.left = (left===undefined ? null : left)
         this.right = (right===undefined ? null : right)
     }
}


function checkTree(root: TreeNode | null): boolean {
    if (!root) {
        return false
    }
    if (!root.left && !root.right) {
        return true
    }
    return root.val === (root.left?.val || 0) + (root.right?.val || 0)
}