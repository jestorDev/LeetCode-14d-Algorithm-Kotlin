

class Solution9 {
    fun reverseWords(s: String): String {
        var i_sta: Int = 0
        var i_end :Int = 0
        var spaces :Int = 0
        var ans =  StringBuilder()
        while (i_sta < s.length){
            
            while (i_end < s.length && s [i_end] != ' ')
                i_end ++
            
            if (i_sta < i_end )
                ans.append( s.substring(i_sta ,i_end).reversed())

            i_sta = i_end
            while (i_end < s.length &&  s [i_end  ] == ' ')
                i_end ++
            
            if (i_sta < i_end)
            ans.append( " ".repeat(i_end - i_sta ))
            i_sta = i_end
        }
        
        return ans.toString()
        
    }
}


fun main(args: Array<String>) {
    var sol = Solution9()
    print(sol.reverseWords("Hola a todos"))
}