class Solutio10 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {        
        var check =BooleanArray(9) {false} 
        for (r in 0..8  ){
            check =BooleanArray(9) {false} 
            for (c in 0..8 ){
                if ( board[r][c] != '.' ){
                    if ( check [board[r][c] - '1'])
                        return false
                    check [board[r][c] - '1'] = true
                }
            }
        }
        for (c in 0..8 ){
            check =BooleanArray(9) {false} 
            for (r in 0..8  ){
                if ( board[r][c] != '.' ){

                if (check [board[r][c] - '1'])
                    return false
                check [board[r][c] - '1'] = true
            }
        }
        }
        for (r in  0 .. 2 ){
            for (c in 0 .. 2 ){
                check =BooleanArray(9) {false} 
                for (ir in  0 .. 2 ){
                    for (ic in 0 .. 2 ){
                        val rii = r*3+ ir     
                        val cii = c*3+ ic     
                        if ( board[rii][cii] != '.' ){
                            if (check [board[rii][cii] - '1'])
                                return false
                            check [board[rii][cii] - '1'] = true
                    }
                }}}}
        return true
    }
}
fun main(args: Array<String>) {
    val sol = Solutio10()

    println (
        "True :" + 
    sol.isValidSudoku(
        arrayOf(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )).toString()

        )    

            println (
                "False :" + 
            sol.isValidSudoku(
                arrayOf(
                    charArrayOf('5','3','2','.','7','.','.','.','.'),
                    charArrayOf('6','.','1','1','9','5','.','.','.'),
                    charArrayOf('.','9','8','.','.','.','.','6','.'),
                    charArrayOf('8','.','.','.','6','.','.','.','3'),
                    charArrayOf('4','.','.','8','.','3','.','.','1'),
                    charArrayOf('7','.','.','.','2','.','.','.','6'),
                    charArrayOf('.','6','.','.','.','.','2','8','.'),
                    charArrayOf('.','.','.','4','1','9','.','.','5'),
                    charArrayOf('.','.','.','.','8','.','.','7','9')
                )).toString()
        
                )


            println (
                "False :" + 
            sol.isValidSudoku(
                arrayOf(
                    charArrayOf('5','3','.','.','7','.','.','.','.'),
                    charArrayOf('6','.','.','1','9','5','.','.','.'),
                    charArrayOf('.','9','8','.','.','.','.','6','.'),
                    charArrayOf('8','.','.','.','6','.','.','.','3'),
                    charArrayOf('4','.','.','8','.','3','.','.','1'),
                    charArrayOf('7','.','.','.','2','.','.','.','6'),
                    charArrayOf('.','6','.','.','.','.','2','8','.'),
                    charArrayOf('.','.','.','4','1','9','.','8','5'),
                    charArrayOf('.','.','.','.','8','.','.','7','9')
                )).toString()
        
                )    
        

                
                println (
                    "False :" + 
                sol.isValidSudoku(
                    arrayOf(
                        charArrayOf('5','3','.','.','7','.','.','.','.'),
                        charArrayOf('6','.','.','1','9','5','.','.','.'),
                        charArrayOf('.','9','8','.','.','.','.','6','.'),
                        charArrayOf('8','.','.','.','6','.','.','.','3'),
                        charArrayOf('4','.','.','8','.','3','.','.','1'),
                        charArrayOf('7','.','.','.','2','.','.','.','6'),
                        charArrayOf('.','6','.','.','.','.','2','.','.'),
                        charArrayOf('.','.','.','4','1','9','.','8','5'),
                        charArrayOf('.','.','.','.','8','.','5','7','9')
                    )).toString()
            
                    )    
    
            
    }
/*


[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
*/