class Solution8 {
    
    
    
    fun reverseString(s: CharArray): Unit {
        
        var tmp :Char
        if (s.size <= 1 )
            return 
        for (i in 0 .. (s.size/2)-1 ){
            tmp = s[(s.size-1) - i]
            s[(s.size-1) - i] = s[i]
            s[i] = tmp
        }
         
    }
}