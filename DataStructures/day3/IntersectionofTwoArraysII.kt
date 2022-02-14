

class Solutio5 {
    fun uniques(nums: IntArray): MutableMap<Int , Int>{
        val map_uniques = mutableMapOf<Int , Int>()

        for (num in nums)
            map_uniques[num] = if (map_uniques[num] != null) map_uniques[num]!!+1 else 1
        
        return map_uniques

    }

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        
    val ans = arrayListOf<Int>()
    val map1 = uniques(nums1)
    for (num in nums2){
        if(map1[num]!= null &&  map1[num]!! > 0){
            ans.add(num)
            map1[num] = map1[num]!! -1
        }
    
    }
    return ans.toIntArray()
    }
    
}

fun main(args: Array<String>) {
    var sol = Solutio5()
    var  a = sol.intersect(intArrayOf(1,2,2,1) , intArrayOf(2,2))
    for (x in a){ 
        print(x)
        print(" ")}
    print("\n")

}