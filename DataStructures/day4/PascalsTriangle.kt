class sol2 {
    fun generate(numRows: Int): List<List<Int>> {

        print("a")
        print("a")
        print("a")
        print("a")
        print("a")


        if (numRows == 1)
            return listOf(mutableListOf(1))

        val ans = mutableListOf(listOf(1),listOf(1 ,1))
        var prev : List<Int>  

        for (i in  2 .. numRows-1){
            prev = ans[i-1]
            ans.add(List(i+1) { init -> if (init != 0 && init < i ) prev[init-1] +prev[init] else 1 })
        }
        
              

        print(" +++++++++++++++++++ \n")

        for (a in ans){
            for (x in a){
                print(x.toString() + " ")
            }
            print(" \n")
        }
        print(" +++++++++++++++++++ ")


        return ans
        }
}


fun main(args: Array<String>) {
    val sol= sol2()
    sol.generate(4)
    sol.generate(10)

}