class Solution11 {
    fun isPrm(s2: String, u: MutableMap<Char, Int>): Boolean {
        val map_uniques = u.toMutableMap()
        for (ch in s2) 
            map_uniques[ch] =- 1
        
        if (map_uniques.maxByOrNull { it.value }!!.component2() == 0) 
            return true
        return false
    }
/*
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) {
            return false
        }
        val map_uniques = mutableMapOf<Char, Int>()
        for (ch in s1) map_uniques[ch] = if (map_uniques[ch] != null) map_uniques[ch]!! + 1 else 1
        for (i in 0..s2.length - s1.length) {
            if (isPrm(s2.substring(i, i + s1.length), map_uniques)) return true
        }
        return false
    }

 */
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s2.length < s1.length) return false
        val arr1 = IntArray(26)
        s1.toCharArray().forEach { arr1[it - 'a']++ }
        val arr2 = IntArray(26)
        for (i in s2.indices) {
            arr2[s2[i] -'a'] ++
            if(i - s1.length >= 0){
                for (i in 0 until arr1.size) 
                    print(arr1[i].toString() + " ")
                print("\n")
                for (i in 0 until arr2.size) 
                    print(arr2[i].toString() + " ")
                print("\n")
                
                arr2[s2[i-s1.length] - 'a']--
            
            }
            if (arr1 contentEquals arr2) {
                for (i in 0 until arr1.size) 
                    print(arr1[i].toString() + " ")
                print("\n")
                for (i in 0 until arr2.size) 
                    print(arr2[i].toString() + " ")
                print("\n")
                return true
            }
        }
        return false
    }
    

    
}

fun main(args: Array<String>) {
    val sol = Solution11()
    println("T")
    println(sol.checkInclusion(s1 = "ab", s2 = "eidbaooo"))
    println("F")
    println(sol.checkInclusion(s1 = "ab", s2 = "eidboaoo"))
    println("T")
    println(sol.checkInclusion(s1 = "ab", s2 = "ba"))
    println("T")
    println(sol.checkInclusion(s1 = "aa", s2 = "aa"))
    println("T")
    println(sol.checkInclusion(s1 = "a", s2 = "a"))
    println("T")
    println(sol.checkInclusion(s1 = "qweqwe", s2 = "asdqwqwqwqwewqqweasd"))
    println("F")
    println(sol.checkInclusion(s1 = "qweqwe", s2 = "asdqwqwqwqwqasde"))
}
