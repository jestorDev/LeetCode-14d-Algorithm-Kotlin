
//32m05s54
class Solution13 {
    
    fun islandSize(grid: Array<IntArray>, i: Int, j: Int): Int {

        if (i >= 0 && j >= 0 && grid.size > i && grid[0].size > j && grid[i][j] == 1) {
            grid[i][j] = 0
            return 1 +
                    islandSize(grid, i + 0, j + 1) +
                    islandSize(grid, i + 1, j + 0) +
                    islandSize(grid, i - 1, j + 0) +
                    islandSize(grid, i + 0, j - 1)
        }   
        return 0
    }

    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val w = grid[0].size
        val h = grid.size
        var isl_size: Int
        
        var ans  = 0
        for (i in 0 until h) {
            for (j in 0 until w) {
                val isize =islandSize(grid, i, j)
                if ( ans < isize )ans= isize
            }
        }
        //println("Ams :  "  +ans.toString() )
        return ans
    }
}

fun main(args: Array<String>) {
    val sol = Solution13()
    sol.maxAreaOfIsland(
            arrayOf(
                    intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0),
            )
    )

    sol.maxAreaOfIsland(
            arrayOf(
                    intArrayOf(0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0),
            )
    )


    sol.maxAreaOfIsland(
            arrayOf(
                    intArrayOf( 1 ),
            )
    )

    sol.maxAreaOfIsland(
            arrayOf(
                    intArrayOf( 0 ),
            )
    )


    sol.maxAreaOfIsland(
        arrayOf(
                intArrayOf(0, 0, 0, 0, 0, 0, 0),
        )
)



}
