// 24m06s21
class Sol {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        
        var idx = 0
        var r_idx = 0
        var c_idx = 0 
        var m =mat.size -1 
        var n = mat[0].size-1
        val  arr_sol :Array<IntArray>  = Array(r , { IntArray(c)})

        if ((n +1) *(m+1) == r*c ){
            for (row in  0 ..    m){
                for (col in 0 .. n ){
    
                    r_idx =  idx / c 
                    c_idx =  idx % c
                    arr_sol[r_idx][c_idx] = mat[row][col]
    
                    idx ++
                }
            }
            return arr_sol
        }
        else
        return mat
    }
}


fun a (mat: Array<IntArray>){
    print(" +++++++++++++++++++ \n")

    for (a in mat){
        for (x in a){
            print(x.toString() + " ")
        }
        print(" \n")
    }
    print(" +++++++++++++++++++ ")

}

fun main(args: Array<String>) {
    var sol = Sol()

    a(sol.matrixReshape(arrayOf( intArrayOf(1)),r = 1, c = 1))
    a(sol.matrixReshape(arrayOf( intArrayOf(1,2) , intArrayOf(3,4)),r = 1, c = 4))
    a(sol.matrixReshape(arrayOf( intArrayOf(1,2) , intArrayOf(3,4)),r = 2, c = 2))
    a(sol.matrixReshape(arrayOf(
         intArrayOf(1,2) , 
         intArrayOf(3,4) , 
         intArrayOf(5,6)
         ),r = 2, c = 3)
    )


    a(sol.matrixReshape(arrayOf(
         intArrayOf(1,2) , 
         intArrayOf(3,4) , 
         intArrayOf(5,6)
         ),r = 3, c = 3)
    )


}