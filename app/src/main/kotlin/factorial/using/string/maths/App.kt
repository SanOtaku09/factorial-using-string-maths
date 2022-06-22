package factorial.using.string.maths

import string.maths.Multiply.multiply
import string.maths.Subtract.subtract

tailrec fun factorial( num : Any , product : Any = 1 ) : Any = if ( num.toString() == "1" ) product else factorial( num subtract 1 , num multiply product )

fun main() {
    print( ":- " )
    val num : String = readln()
    val start : Long = System.currentTimeMillis()
    val factorial : Any = factorial( num )
    println( "Time Taken : ${ System.currentTimeMillis() - start } milliseconds" )
    println( "factorial of $num is\n: $factorial" )
}
