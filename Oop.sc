object op{
    def main(args: Array[String])=
    {
        var obj = new hello()
        obj.display()

        var obj1=new hp("abc",12)
        obj1.display()
        obj1=new hp("abc")
        obj1.display()
        obj1=new hp()
        obj1.display()
        obj1.setName("konu")
        obj1.setNum(1090)
        println(obj1.getname())
        obj1.display()
    }
    class hello 
    {
        var name: String ="popeeye"

        def display()={
            println("The name is: " + name)
        }
    }

    class hp(var name: String, var num: Int)
    {
        var k=hp.inc
        def display()={
            println("The name is: " + name + " and the number is: " + num+" k = "+k)
        }

        def setName(name: String)={
            this.name = name
        }

        def setNum(num: Int)={
            this.num = num
        }

        def getname()= name
        def getnum()= num
        def this(name: String)=
        {
            this(name,0)// calling primary constructor
        }
        def this()={
            this("no name") //calling the above auxillary constructor
        }
    }   

    object hp
    {
        private var n:Int = 0
        private  def inc ={n+=1;n}
    }
}