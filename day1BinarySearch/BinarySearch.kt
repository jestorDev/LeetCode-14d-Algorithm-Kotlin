class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var hi = nums.size - 1 
        var lo = 0
        var med = (hi + lo)/2
        
        while (lo < hi){
            if (nums[med] == target)
                return med
            if (nums[med] < target)
                lo = med+1
            if (nums[med] > target)
                hi = med-1
            med  = (hi + lo)/2
        }
        if (nums[med] == target)
            return med
        else 
            return -1
    }
}



fun main(args: Array<String>) {
    
    val sol = Solution()
    val idx1 =  sol.search( intArrayOf(10, 20) , 10 )
    val idx2 =  sol.search( intArrayOf(10, 20) , 20 )
    val idx3 =  sol.search( intArrayOf(10, 20) , 30 )
    val idx4 =  sol.search( intArrayOf(10, 20) , 40 )
    val idx5 =  sol.search( intArrayOf(10, 20) , 50 )
    val idx6 =  sol.search( intArrayOf(10, 20) , 60 )

    val idx11 =  sol.search( intArrayOf(10) , 10 )
    val idx12 =  sol.search( intArrayOf(10) , 20 )
    val idx13 =  sol.search( intArrayOf(10) , 30 )
    val idx14 =  sol.search( intArrayOf(10) , 40 )
    val idx15 =  sol.search( intArrayOf(10) , 50 )
    val idx16 =  sol.search( intArrayOf(10) , 70 )
    val idx17 =  sol.search( intArrayOf(10) , 0 )


    println(idx1)
    println(idx2)
    println(idx3)
    println(idx4)
    println(idx5)
    println(idx6)

    println("------------------------")
    println(idx11)
    println(idx12)
    println(idx13)
    println(idx14)
    println(idx15)
    println(idx16)
    println(idx17)
    

}