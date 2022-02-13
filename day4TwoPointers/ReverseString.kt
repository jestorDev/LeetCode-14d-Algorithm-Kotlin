class Solution8 {
    
    fun reverseString(s: CharArray): Unit {
        var str :String = "hola"

            
        var tmp :Char = str[0]
        print (tmp)
        if (s.size <= 1 )
            return 
        for (i in 0 .. (s.size/2)-1 ){
            tmp = s[(s.size-1) - i]
            s[(s.size-1) - i] = s[i]
            s[i] = tmp
        }
         
    }
}