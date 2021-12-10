object tup{
    def main(args: Array[String])=
    {
        var t=(1,3,"3434")
        println(t._1)
        println(t._2)

        t.productIterator.foreach{i=> print(i.toString+",") }
        println()
        println(t.toString())
    }
}