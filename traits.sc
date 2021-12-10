object trt{
    def main(args: Array[String])=
    {
        var m = new meow()
        println(m.speak)
        println(m.eyes)
        m.dan()
    }

    trait Cat
    {
        var name: String
        def speak : String
    }

    trait evil
    {
        def eyes : String

        def dan()=
        {
            println("Every dangerous")
        }
    }

    class meow extends Cat with evil
    {
        var name = "billi"
        def speak= "meow meow...%s".format(name)

        def eyes= "Red as blood"
    }
}