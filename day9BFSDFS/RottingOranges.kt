
import java.util.Queue
import java.util.LinkedList


class Solution19 {
    val dirs = arrayOf(
        intArrayOf(+0,-1),
        intArrayOf(-1,+0),
        intArrayOf(+1,+0),
        intArrayOf(+0,+1)
        )

    fun isInBounds (mat: Array<IntArray> , i:Int,j:Int) : Boolean{
        return (i >= 0 && j >= 0 && i < mat.size && j < mat[0].size )
    }

    fun orangesRotting(grid: Array<IntArray>): Int {
        val queue: Queue<IntArray> = LinkedList<IntArray>()

        for (i in 0 .. grid.size - 1){
            for (j in 0 .. grid[0].size - 1){

                if (grid[i][j] == 0){
                    grid[i][j] = -2
                    continue
                }
                
                if(grid[i][j] == 2) {
                    grid[i][j] = 0
                    queue.add(intArrayOf(i,j,0))
                }else
                    grid[i][j] = -1
            }
        }

        while (!queue.isEmpty()){
            val actual = queue.poll()
            for (dir in dirs){
                val a=  dir[0] + actual[0] 
                val b=  dir[1] + actual[1] 

                if (isInBounds(grid, a, b)&& grid[a][b] == -1){
                    grid[a][b] = actual[2]+1
                    queue.add(intArrayOf(a,b, actual[2]+1 ))
                }
            }
        }

        var maxd = 0 
        for (i in 0 .. grid.size - 1){
            for (j in 0 .. grid[0].size - 1){
            if (grid[i][j] == -1)        
                return -1
            if (grid[i][j] > maxd)        
                maxd=grid[i][j]
        
            }}
        return maxd
    }
}



fun printMa (image : Array<IntArray>){
    print(" +++++++++++++++++++ \n")

    for (a in image){
        for (x in a){
            print(x.toString() + " ")
        }
        print(" \n")
    }
    print(" +++++++++++++++++++ ")

}

fun main() {
    val sol = Solution19()

    print(
        sol.orangesRotting(
        arrayOf(
            intArrayOf(2,1,1),
            intArrayOf(1,1,0),
            intArrayOf(0,1,1),
        )
    ))
    println( "   aswssssssssssss")
    
    print(
    sol.orangesRotting(
        arrayOf(
            intArrayOf(2,1,1),
            intArrayOf(0,1,1),
            intArrayOf(1,0,1),
        )
    ))

    
    
    

    
}