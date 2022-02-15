class Solution10 {
    fun lengthOfLongestSubstring(s: String): Int {
        val previous = mutableMapOf<Char,Int>()

        var actual_l = 0
        var max_l = 0
        var last_seen : Int ? = 0
        var max2 : Int = 0
        
        for (i in 0 until s.length) {
            last_seen =  previous[s[i]]
            
            if ( last_seen != null) {
                if ( last_seen >  max2 )
                    max2 = last_seen
                actual_l = i - max2
            }
            else 
                actual_l++
            
            previous[s[i]] = i
            
            if (actual_l > max_l) max_l = actual_l
        }
        return max_l
    }
}

fun main(args: Array<String>) {
    val sol = Solution10()
    print(sol.lengthOfLongestSubstring("dvdf"))

    print(sol.lengthOfLongestSubstring("aaaxdraaa"))
    print(sol.lengthOfLongestSubstring(" "))
    print(sol.lengthOfLongestSubstring("abcabcbb"))



}


/*


Line 16: Char 41: error: unresolved reference: maxByOrNull
                actual_l = i -previous2.maxByOrNull { it.value }!!.component2()
                                        ^
Line 16: Char 55: error: unresolved reference: it
                actual_l = i -previous2.maxByOrNull { it.value }!!.component2()
                                                      ^
*/