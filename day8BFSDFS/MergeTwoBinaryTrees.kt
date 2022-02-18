/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    
    
    fun new_node (n1: TreeNode?, n2: TreeNode?): TreeNode?{
        if (n1 == null  && n2 == null)   return null
        if (n1 == null )   return TreeNode(n2!!.`val`)
        if (n2 == null)   return TreeNode(n1!!.`val`)
        return TreeNode(n1!!.`val`+ n2!!.`val`)    
    }
    
    
    fun traverse(n1: TreeNode?, n2: TreeNode? ,parent: TreeNode? , isLeft:Boolean = true){
        
        if (n1 == null && n2 == null)   return 
        
        val  actual_n =  new_node (n1, n2)
        if (isLeft)
            parent!!.left  = actual_n
        else    
            parent!!.right  =actual_n
        
        traverse( n1?.left  , n2?.left, actual_n , isLeft = true)
        traverse(n1?.right, n2?.right, actual_n , isLeft = false)
    }
    
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        
        val new_root = new_node (root1,root2)
        traverse( root1?.left  , root2?.left,new_root , isLeft = true)
        traverse(root1?.right, root2?.right, new_root , isLeft = false)
        return new_root
    }
}