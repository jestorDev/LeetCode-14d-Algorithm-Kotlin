class Solution7 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var idx_a = 0
        var idx_b = numbers.size -1

        while (idx_a < idx_b){
            if (numbers[idx_a] + numbers[idx_b] == target)
                return intArrayOf(idx_a +1 ,  idx_b +1)

            if (numbers[idx_a] + numbers[idx_b] < target)
                idx_b --
            else
                idx_a ++
        }
        return intArrayOf(idx_a +1 ,  idx_b +1)
    }
}

fun printarr(arr:IntArray){
    print(arr[0])
    print(" ")
    print(arr[1])
    print("\n")
    
}

fun main(args: Array<String>) {
    val sol = Solution7()

    printarr(sol.twoSum(intArrayOf(12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997),542))

    




}