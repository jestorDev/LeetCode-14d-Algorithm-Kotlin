class Solution6 {


    fun moveZeroes(nums: IntArray): Unit {
        
        var zero_i = 0
        var no_z_i = 0
        

        while (no_z_i < nums.size &&  zero_i < nums.size ){

            while ( zero_i < nums.size && nums[zero_i]!=0)
                zero_i ++
    
            no_z_i=zero_i
            while ( no_z_i < nums.size && nums[no_z_i]==0 )
                no_z_i ++
            
            if (no_z_i < nums.size &&  zero_i < nums.size ){
                nums[zero_i] = nums[no_z_i]
                nums[no_z_i] = 0 

            }

        }

        for (num in nums)
            print ( "${num} ")
        print("\n")
    }
}



fun main(args: Array<String>) {
    val sol = Solution6()
    sol.moveZeroes( intArrayOf(0,1,0,3,12))
    sol.moveZeroes( intArrayOf(0,0,0,0,0))
    sol.moveZeroes( intArrayOf(0,0,0,0,1))
    sol.moveZeroes( intArrayOf(0,0,0,1,1))
    sol.moveZeroes( intArrayOf(1))
    sol.moveZeroes( intArrayOf(1,1))
    sol.moveZeroes( intArrayOf(1,1 , 0,0,0,0))

}