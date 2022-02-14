/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        
        var ahead :ListNode?= head
        var behind:ListNode? = null
        
        if ( head == null || head?.next == null ){
            return null
        }
        
        for ( i in 0 until (n-1))
            ahead = ahead!!.next             
        
        
        while (ahead?.next != null){
            ahead = ahead!!.next 
            if (behind == null)
                behind = head
            else
                behind  = behind!!.next 
        }

        if (behind == null)
            return head.next
        else
            behind!!.next = behind.next!!.next
        
        return head
    }
}