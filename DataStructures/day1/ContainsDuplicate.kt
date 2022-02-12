class Solutio {
    fun containsDuplicate(nums: IntArray): Boolean {
    val uniques = mutableSetOf<Int>()
    
    for (i in 0 .. nums.size -1){
        
        if (uniques.contains( nums[i]))
            return true
        uniques.add( nums[i])
    }
    return false
    
    }
}

