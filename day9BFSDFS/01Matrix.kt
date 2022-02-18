
import java.util.Queue
import java.util.LinkedList

class Solution18 {
    val dirs = arrayOf(
        intArrayOf(+0,-1),
        intArrayOf(-1,+0),
        intArrayOf(+1,+0),
        intArrayOf(+0,+1),
        )

    fun isInBounds (mat: Array<IntArray> , i:Int,j:Int) : Boolean{
        return (i >= 0 && j >= 0 && i < mat.size && j < mat[0].size )
    }
    fun isNextTozero(mat: Array<IntArray> , i:Int,j:Int):Boolean{
        for ( dir in dirs){
            val a=  dir[0] + i 
            val b=  dir[1] + j 
            if (isInBounds(mat, a, b) && mat[a][b] == 0  )
                return true
        }
        return false
    }
    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        
        val queue: Queue<IntArray> = LinkedList<IntArray>()

        for (i in 0 .. mat.size - 1){
            for (j in 0 .. mat[0].size - 1){
                if (mat[i][j] == 0)
                    continue
                
                if(isNextTozero(mat, i, j)) 
                    queue.add(intArrayOf(i,j,1))
                else
                    mat[i][j] = -1
            }
        }

        while (!queue.isEmpty()){
            val actual = queue.poll()
            for (dir in dirs){
                val a=  dir[0] + actual[0] 
                val b=  dir[1] + actual[1] 
                if (isInBounds(mat, a, b)&& mat[a][b] == -1){
                    mat[a][b] = actual[2]+1
                    queue.add(intArrayOf(a,b, actual[2]+1 ))
                }
            }
        }


        return mat
        
    }



}


fun printM (image : Array<IntArray>){
    print(" +++++++++++++++++++ \n")

    for (a in image){
        for (x in a){
            print(x.toString() + " ")
        }
        print(" \n")
    }
    print(" +++++++++++++++++++ ")

}

fun main(args: Array<String>) {
    val sol = Solution18()

    printM(   
    sol.updateMatrix(
        arrayOf(
            intArrayOf( 0,0,0,0,0,0,0),
            intArrayOf( 0,1,1,1,1,1,0),
            intArrayOf( 0,1,1,1,1,1,0),
            intArrayOf( 0,1,1,1,1,1,0),
            intArrayOf( 0,1,1,1,1,1,0),
            intArrayOf( 0,1,1,1,1,1,0),
            intArrayOf( 0,0,0,0,0,0,0),
        )
    )
    )

    printM(   

    sol.updateMatrix(
        arrayOf(
            intArrayOf( 0,0,0,0,0,0),
            intArrayOf( 0,1,1,1,1,0),
            intArrayOf( 0,1,1,1,1,0),
            intArrayOf( 0,1,1,1,1,0),
            intArrayOf( 0,1,1,1,1,0),
            intArrayOf( 0,0,0,0,0,0),
        )
    )
    )


    printM(   
    sol.updateMatrix(
        arrayOf(
            intArrayOf( 1,1,0),
            intArrayOf( 1,1,1),
            intArrayOf( 0,0,1),
        )
    )
    )

    printM(   
    sol.updateMatrix(
        arrayOf(
            intArrayOf( 0,0,0),
            intArrayOf( 0,1,0),
            intArrayOf( 1,1,1),
        )
    )
    )

    printM(   
    sol.updateMatrix(
        arrayOf(
            intArrayOf(  1 ,1,1,0),
        )
    )
    )

    printM(   
    sol.updateMatrix(
        arrayOf(
            intArrayOf(0),
        )
    )
    )

}