class Solutio6 {
    fun maxProfit(prices: IntArray): Int {
    if (prices.size==1)
        return 0
    
    val diff = IntArray(prices.size-1)
    
    for (i in 0 until prices.size-1)
        diff[i]= prices[i+1] - prices[i]   
    
    var now_sum = diff[0]
    var max_sum = 0
    
    for (i in 1 until diff.size){
        if (now_sum + diff[i] >=  diff[i])
            now_sum +=  diff[i]
        else
            now_sum =  diff[i]

        if (now_sum > max_sum) 
            max_sum = now_sum
    }
    return max_sum
        
    }
}


fun main(args: Array<String>) {
    var sol = Solutio6()
    println(sol.maxProfit(intArrayOf(7,6,4,3,1)))

    println(sol.maxProfit(intArrayOf(7,1,5,3,6,4)))
    println(sol.maxProfit(intArrayOf(7)))

}
