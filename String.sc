object string
{
    def main(args: Array[String])=
    {
        // string format specifier
        var str="helloo zombie"
        var j=4.6734
        printf("ro : %s",str)
        println()
        printf("%-5f",j)
        println()
        printf("%.3f",j)
        println()
        printf("%5s","hi")
        println()
        printf("%-5s","hi")
        println()

        // String interpolation
        var i=10.1
        j=12.9090
        println(f"sum : ${i+j}")
        println(s"sum : ${i+j}")
        println(f"$j%.2f")

        str ="Zombie apo" 
        println(str(3))
        println(str.length)
        println(str.concat("hahaha"))
        println(str+"hahaha")
        println(str.equals("hihih"))
        println(str.indexOf("bie"))

        var arr= str.toArray
        for(v<- arr)
        print(v+",")
    }
}