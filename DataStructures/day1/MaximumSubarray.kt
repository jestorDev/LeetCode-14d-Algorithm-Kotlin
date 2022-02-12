class Solutio2 {
    fun maxSubArray(nums: IntArray): Int {

        var actual_sum = nums[0]
        var max_sum = nums[0]

        for (actual in 1..nums.size - 1) {

            if (actual_sum + nums[actual] > nums[actual])
                actual_sum = actual_sum + nums[actual]
            else
                actual_sum = nums[actual]

            if (actual_sum > max_sum) max_sum = actual_sum
        }

        return max_sum
    }
}

fun main(args: Array<String>) {
    var sol = Solutio2()
    println(sol.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(sol.maxSubArray(intArrayOf(-2, 2, 5, -11, 6)))
    println(sol.maxSubArray(intArrayOf(-2)))
}
