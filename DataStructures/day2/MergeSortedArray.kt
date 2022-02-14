class Solutio4 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

    var i1 = m-1
    var i2 = n-1
    var i3 = m+n-1

    while (i3 >= 0){
        if (i2 < 0 || ( i1 >= 0 &&  nums1[i1] > nums2[i2] ))
            nums1[i3--] = nums1[i1--]
        else
            nums1[i3--] = nums2[i2--]
    }
        
    for (w in nums1){
        print(w.toString()+ " ")
    }
    print("\n")
    }
}


fun main(args: Array<String>) {
    val sol = Solutio4()

    sol.merge(intArrayOf(1,2,3,0,0,0), m = 3, intArrayOf(2,5,6), n = 3)
    sol.merge(intArrayOf(0), m = 0, intArrayOf(1), n = 1)
}