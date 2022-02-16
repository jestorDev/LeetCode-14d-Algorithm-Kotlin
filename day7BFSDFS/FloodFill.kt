

import kotlin.intArrayOf//42m55s52

class Solution12 {

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

    fun isInside(h :Int, w :Int, x:Int,y:Int) : Boolean{
        return ( x >= 0 && y >= 0  && h > x && w > y  )
    }

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        printM(image)


        if (image[sr][sc] == newColor) return image

        val queue = arrayListOf(intArrayOf(sr, sc))
        val dirs  = arrayOf(intArrayOf(0,1)  ,intArrayOf(1,0) ,intArrayOf(-1,0) ,intArrayOf(0,-1))
    
        var actual : IntArray
        var next : IntArray
        var idx =0 
        val oldColor = image[sr][sc]
        
        image[sr][sc] = newColor
        
        while (idx  <  queue.size){
            
            actual= queue[idx++]

            for (dir in dirs ){
                next = intArrayOf(actual[0] + dir[0]  , actual[1]+ dir[1])
                if ( isInside( image.size ,image[0].size , next[0], next[1]) 
                && image[next[0]][next[1]] == oldColor){
                    image[next[0]][next[1]] = newColor
                    queue.add(next.copyOf())
                }
            }
        }

        //printM(image )

        return image


    }
}

fun main() {
    val sol = Solution12()
    sol.floodFill( arrayOf(intArrayOf(0,0,0),intArrayOf(0,0,0)) , sr = 0, sc = 0, newColor = 2)
    sol.floodFill( arrayOf(intArrayOf(0,0,0),intArrayOf(0,1,1)) , sr = 1, sc = 1, newColor = 1)

    sol.floodFill( arrayOf(intArrayOf(0),intArrayOf(0)) , sr = 0, sc = 0, newColor = 2)
    sol.floodFill( arrayOf(intArrayOf(0)) , sr = 0, sc = 0, newColor = 2)
    sol.floodFill(arrayOf( intArrayOf(1,1,1) , intArrayOf(1,1,0) , intArrayOf(1,0,1) ), sr = 1, sc = 1, newColor = 2)

}