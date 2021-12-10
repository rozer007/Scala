object exp{
    def main(args: Array[String])=
    {

            
        def divideNums(num1 : Int, num2 : Int) = try
        {
        (num1 / num2)
        } catch {
            case ex: java.lang.ArithmeticException => "Can't divide by zero"
        } finally {
            println("Hhaha don't give zero")
        }
        
        println("3 / 0 = " + divideNums(3,0))


        try {
            89/0
        }
        catch 
        { 
            case e: Exception =>println("WHY Zero")
        }
        finally {
            println("give zero")
        }
    }
}