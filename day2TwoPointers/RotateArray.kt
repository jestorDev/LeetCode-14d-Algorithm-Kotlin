class Solution5 {
    fun rotate(nums: IntArray, k: Int): IntArray {

        val ks = k%nums.size

        val ans =IntArray( nums.size)
        
        for (idx in ks .. nums.size-1)
            ans[idx]=nums[idx - ks]
        
        for (idx in 0 .. ks-1)
            ans[idx]=nums[nums.size - (ks- idx)]
        
        for (idx in 0 .. nums.size-1)
            nums[idx] = ans[idx] 
        
        return nums
    }
}

fun main(args: Array<String>) {
    val sol= Solution5()


    for (num in sol.rotate(intArrayOf(1,2,3,4,5,6,7), 3)) {
        print(num.toString() + " ")        
    }
    print("\n")

    for (num in sol.rotate(intArrayOf(1), 3)) {
        print(num.toString() + " ")        
    }
    print("\n")

    for (num in sol.rotate(intArrayOf(1,2,3), 3)) {
        print(num.toString() + " ")        
    }
    print("\n")
    for (num in sol.rotate(intArrayOf(1,2,3,4), 3)) {
        print(num.toString() + " ")        
    }

    print("\n")
    
}