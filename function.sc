import scala.io.Source
import scala.io.StdIn._
import scala.math._
object function{
    def main(args: Array[String])={

        def sum(num1:Int,num2:Int=1)={  
            println(num1 + num2)
            num1+num2+112.00
        }
        def dif(num1:Int,num2:Int=1):Unit={ //procedure function//procedure function 
            println(num1 - num2)
        }

        sum(12,12)
        sum(12)
        sum(num2=12,num1=13)
        println(sum(1,2))

        def avar(args:Int*):Int={
            var sum = 0
            for(i <- args)
                sum += i
            sum
        }
        println(avar(1,2,3,4,6,7,8,9,10))

        // recursion
        def fact(num1:Int):BigInt={
            if(num1<=1)
            1
            else
            num1*fact(num1-1)
        }

        println(fact(5))
    }
}