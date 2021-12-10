object inht
{
    def main(args: Array[String])=
    {
        var obj=hp1("nkoko",23,4)
        obj.display()
        obj=hp1("nkoko",23)
        obj.display()
    }

    class hp(var name: String, var num: Int)
    {
        def display()={
            println("The name is: " + name + " and the number is: " + num)
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

    class hp1(name: String,num: Int, var n: Int) extends hp(name, num)
    {
        def this(name: String,num: Int)=
        {
            this("no name",num,0)
            this.setName(name)
        }

        override def display()={
            println("The name is : " + name + " and the number is : "+ num+" and the n is : " + n)
        }
    }
}