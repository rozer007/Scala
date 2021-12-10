import scala.math._
object more
{
    def main(args: Array[String])=
    {
        val logfunc=log10 _
        println(logfunc(10))

        Array(1.0,2.0,3.0,4.0).map(logfunc).foreach(print)
        println()
        Array(1.0,2.0,3.0,4.0).map((x:Double) => x*2).foreach(print)
        println()
        Array(1.0,2.0,3.0,4.0).filter((x:Double) => x%2==0).foreach(print)
        println()
        Array(1.0,2.0,3.0,4.0).filter(_%2==0).foreach(print)
        println()

        def mul2(n:Int)=n*2
        def mul3(n:Int)=n*3

        def high(fun:(Int)=>BigInt,n:Int)={
            fun(n)
        }

        println(high(mul3,7))

        // Closure

        val div=45
        val closure=(num:Int) => num/div

        println(closure(789))
    }
}