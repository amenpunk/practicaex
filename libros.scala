import scala.collection.mutable.ListBuffer

case class Libros (titulo:String,autor:String,publicacion:Int)

object Main extends App {

  val libros : ListBuffer[Libros] = ListBuffer()

  def listarLibros(): Unit = {
    libros.foreach(println)
  }

  def agregarLibro(titulo:String,autor:String,publicacion:Int): Unit = {
    val libro = Libros(titulo,autor,publicacion)
    libros += libro
  }

  def buscarLibro(id:Int): Option[Libros] = {
    libros.find(_.id == id)
  } 

  agregarLibro("El principito","Antoine de Saint-Exupéry",1943)
  listarLibros()


}
