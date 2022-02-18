class Solutio11 {
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

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var row = -1
        for (i in  0 .. matrix.size-1 ){
            if (matrix[i][matrix[0].size-1] >= target){
                row  = i
                break
            }
        }
        //print(row)
        if (row == -1)
            return false
        val col = search(matrix[row], target)
        if (col == -1)
            return false

        //println ( "r " + row.toString() + " c " + col.toString() )



        return true
    }
}

fun main(args: Array<String>) {
    val sol = Solutio11()

    println( sol.searchMatrix(
        arrayOf(intArrayOf(1,3,5,7),
        intArrayOf(10,11,16,20),
        intArrayOf(23,30,34,60),
        )
    ,  target = 3))


    println( sol.searchMatrix(
        arrayOf(
            
            
            
        intArrayOf(1,3,5,7),
        intArrayOf(10,11,16,20),
        intArrayOf(23,30,34,60),
        )
    ,  target = 61))

    println( sol.searchMatrix(
        arrayOf(intArrayOf(1,3,5,7),
        )
    ,  target = 3))




}