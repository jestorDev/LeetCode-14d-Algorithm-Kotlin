/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */

class Solution {
    fun connect(root: Node?): Node? {
        
        val queue  =  arrayListOf<Pair<Node?,Int>>(Pair(null , 0)) 
        var idx :Int = 1
        var actual : Pair<Node?,Int> = Pair(null , 0)
        var prev : Pair<Node?,Int> = Pair(null , 0)
        queue.add(Pair(root , 1))
        
        while (idx < queue.size){
            prev = queue[idx-1]
            actual = queue[idx++]
            
            
            if (prev.first != null){                
            if (prev.second == actual.second)
                prev.first!!.next = actual.first                
            }

            if (actual.first != null ){
            queue.add(Pair(actual.first!!.left , actual.second+1))
            queue.add(Pair(actual.first!!.right , actual.second+1))
            }
            
        }        
        return root
        
        
    }
}