object abst
{
    def main(args: Array[String])=
    {
        var m=male("Tony")
        println(m.check)
    }

    abstract class Human(var name: String)
    {
        var sex: String
        def check :String
    }

    class male(name: String) extends Human(name){
        var sex="male"
        def check ={ 
            var st="Name : %s , sex : %s".format(this.name,this.sex)
            return st.toUpperCase()
        }
    }
}