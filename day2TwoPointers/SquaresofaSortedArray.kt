class Solution4 {
    fun sortedSquares(nums: IntArray): IntArray {
        
        val ans = IntArray(nums.size)
        var left = 0
        var rgth = nums.size -1
        var ans_idx = nums.size -1

        while (ans_idx >= 0){
            val sqr =  nums[rgth]*nums[rgth]
            val sql =  nums[left]*nums[left] 
            if(sqr < sql ){
                ans[ans_idx]=sql
                left++
            }
            else{
                ans[ans_idx]=sqr
                rgth--
            }
            ans_idx--
        }


        return ans
    }
}


fun main(args: Array<String>) {
    val sol= Solution4()


    for (num in sol.sortedSquares(intArrayOf(-4,-1,0,3,10))) {
        print(num.toString() + " ")        
    }
    print("\n")
    for (num in sol.sortedSquares(intArrayOf(-4))) {
        print(num.toString() + " ")        
    }

    print("\n")

    for (num in sol.sortedSquares(intArrayOf(-4,-1,3,10))) {
        print(num.toString() + " ")        
    }
    print("\n")


}