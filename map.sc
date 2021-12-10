object mp
{
    def main(args: Array[String])=
    {
        var m = Map(1->"23","23"->1)

        if(m.contains(1)) println(m("23"))

        var mm=collection.mutable.Map(1->"23")
        println(mm(1))  
        mm(23)="1"
        println(mm(23))

        for ((k,v)<- mm )
        {
            println(k+","+v)
        }
    }
}