import java.io.PrintWriter
import scala.io.Source
object file
{
    def main(args: Array[String])=
    {
          var file=new PrintWriter("Fileio.txt")
          file.write("Hello zombie\nIt's time to raise\nLet's go")
          file.close()

          var read=Source.fromFile("Fileio.txt","UTF-8")
          var itr=read.getLines
          for (i <- itr)
            println(i)
          read.close()
    }
}