class Solutio3 {

    fun printMap(mp : MutableMap <Int,Int>){
        println("------------------")
        for ((key, value) in mp) {
            println("$key = $value")
        }   
        println("------------------")

    
    }
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val needed= mutableMapOf<Int,Int>()
        var actual_needed:Int = 0
        for (i in 0 until nums.size){
            //printMap(needed)
            actual_needed = target - nums[i]
            if (needed.containsKey(actual_needed))
                return (intArrayOf( needed.getValue(actual_needed), i ))
            else
                needed.put(nums[i], i)
        }
        return (intArrayOf( -1, -1 ))
    }
}

fun main(args: Array<String>) {
    var  sol = Solutio3()
    
    print (sol.twoSum(intArrayOf(3,2,4), 5)[0])
    print(" ")
    print (sol.twoSum(intArrayOf(3,2,4), 5)[1])

    print(" ")
    print(" ")
    print (sol.twoSum(intArrayOf(3,2,4), 6)[0])
    print(" ")
    print (sol.twoSum(intArrayOf(3,2,4), 6)[1])


}