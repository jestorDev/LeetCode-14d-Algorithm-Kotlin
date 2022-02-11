
class Solution2 (val real:Int) {


   fun isBadVersion(version:Int):Boolean{
      return (real <= version)
   
   }  

   fun firstBadVersion(n: Int) : Int {        
      
      var lo =0
      var hi =n
      if (isBadVersion(1))
         return 1

      while (hi - lo > 1){
         val med = lo + (hi-lo +1)/2
         if(isBadVersion(med))
            hi = med
         else
            lo = med
      }

      return hi
   }
}

fun main(args: Array<String>) {
   val sol1= Solution2(4)
   println(sol1.firstBadVersion(7))
   println(sol1.firstBadVersion(8))


   val sol2= Solution2(1)
   println(sol2.firstBadVersion(7))
   println(sol2.firstBadVersion(8))


   val sol4= Solution2(2)
   println(sol4.firstBadVersion(7))
   println(sol4.firstBadVersion(8))



   val sol3= Solution2(7)
   println(sol3.firstBadVersion(7))
   println(sol3.firstBadVersion(8))

   val sol5= Solution2(2147483647)
   println(sol5.firstBadVersion(2147483647))

}