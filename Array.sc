import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.{readLine,readInt}
import scala.math._
import java.io.PrintWriter
import scala.io.Source

object Arrayss{
    def main(args: Array[String])=
    {
        val a = new Array[Int](10)
        a(1)=10
        a.foreach(println)
        var b=(1,2,3,6,"po")
        println(b(4))

        var buff=ArrayBuffer[String]()
        buff.insert(0,"ko")
        buff.append("po")
        buff.append("p")
        buff.append("o")
        buff.insert(1,"io")

        println(buff)

        buff+="hello"
        buff++=Array("hi","konichiwa","ohaiyo","caio")
        println(buff)
        // buff.insert(1,"io","def","hi","konichiwa","ohaiyo","caio")
        buff.remove(1,3)

        println(buff)

        var f =for(i<- buff )yield i+"jiji"
        println(f)
        f.foreach(println)

        // Multidimensional array

        var mul1=Array.ofDim[Int](5,5)
        for (i <-0 to 4;j <- 0 to 4)
        {
            printf("%d : %d = %d\n",i,j,mul1(i)(j))
        }

        val d=Array(1,45,4545,23,22,34,4)
        var sor=d.sortWith(_>_)
        sor.foreach(println)

        println(sor.mkString("%"))
    }
}   