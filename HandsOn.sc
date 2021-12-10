import scala.io.StdIn.{readLine,readInt}
import scala.collection.mutable.ArrayBuffer
object HandsOn
{
    def main(args: Array[String])=
    {
        subsequences()
    }

    def prime(x: Int)={
        var count=0
        for(i <- 1 until x+1)
        {
            if(x%i==0)
            count+=1
        }
        if(count==2)
        println("Prime number")
        else
        println("Not a Prime")
    }

    def primeeff(x: Int):Unit = {
        var div=2
        var flag=true
        while(div*div<=x)
        {
            if(x%div==0)
            {
                flag=false
                println("Not a Prime")
                return
            }
            div+=1
        }
        println("Prime number")
    }

    def barchart():Unit = {
        var num=readLine.toInt
        var arr=new Array[Int](num)

        for(i <- 0 until num)
        {
            arr(i) = readLine.toInt
        }
        var max = arr.max

        for(i <-0 until max){
            for(j <-arr)
            {
                if(j>=max-i)
                print("*\t")
                else
                print("\t")
            }
            println("")
        }
    }

    def spiralDisplay():Unit = {

        var n=readLine.toInt
        var m=readLine.toInt

        var matrix=Array.ofDim[Int](n,m)

        for(i <- 0 until n)
        {
            for(j <- 0 until m)
            {
                matrix(i)(j)=readLine.toInt
            }
        }

        var minc =0
        var minr =0
        var maxc =m-1
        var maxr =n-1

        var tno=n*m
        var count=0

        while(count<tno)
        {
            var left = minr
            while(count<tno&&left<=maxr)
            {
                println(matrix(left)(minc))
                count+=1
                left+=1
            }
            minc+=1

            var bottom = minc
            while(count<tno&&bottom<=maxc)
            {
                println(matrix(maxr)(bottom))
                count+=1
                bottom+=1
            }
            maxr-=1

            var up = maxr
            while(count< tno &&up>=minr)
            {
                println(matrix(up)(maxc))
                count+=1
                up-=1
            }
            maxc-=1

            var right = maxc
            while(count< tno && right>=minc)
            {
                println(matrix(minr)(right))
                count+=1
                right-=1
            }
            minr+=1
        }
    }

    def subsequences():Unit = {
        var str=readLine
        print(gss(str))
    }

    def gss(str:String): ArrayBuffer[String] = {
        if(str.length==0)
        {
            var base=ArrayBuffer[String]()
            base.append("")
            return base
        }

        var ch=str(0)
        var ros=str.substring(1)
        var res=gss(ros)
        var mres = ArrayBuffer[String]()

        for(i <- res)
        {
            mres.append(i)
        }

        for(i <- res)
        {
            mres.append(ch+i)
        }

        mres
    }
}