object Loops{
    def main(args: Array[String]) =
    {
        var i =0;

        while(i<=5)
        do
            print("hello")
            i+=1
        println()
    
        for(i<- 1 to 5)do
            print("Hello")
            print("bye")
        
        println()

        var str="qabcblsdljlsjdsldjsmdjsmdp"

        for (i <- 0 until str.length)
        {
            print(str(i))
        }

        println()
        for (i <- str)
        print(i)

        println()

        var l = List(1,2,3,4,5,6,7)

        for (i <- 0 until l.length)
        {
            print(l(i))
        }

        println()

        for (i <-l)
        {
            print(i)
        }

        var even=for {i <-l if (i%2==0)}yield i
        println()

        for (i <- 0 to 5;j<-6 to 10)
            print(i)
            print(j+",")

    }
}