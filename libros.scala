import scala.collection.mutable.ListBuffer

case class Libros (id:Int,titulo:String,autor:String,publicacion:Int)

object Main extends App {

  val libros : ListBuffer[Libros] = ListBuffer()

  def listarLibros(): Unit = {
    libros.foreach(println)
  }

  def agregarLibro(id:Int,titulo:String,autor:String,publicacion:Int): Unit = {
    val libro = Libros(id,titulo,autor,publicacion)
    libros += libro
  }

  def buscarLibro(id:Int): Option[Libros] = {
    libros.find(_.id == id)
  } 

  def eliminarLibro(id: Int) : Boolean = {
    buscarLibro(id) match {
      case Some(libro) => {
        libros -= libro
        true
      }
      case None => false
    }
  }

  def actualizarLibro(id:Int, titulo:String, autor:String, publicacion:Int):Boolean = {
    buscarLibro(id) match {
      case Some(libro) => {
        val indice = libros.indexOf(libro)
        libros(indice) = libro.copy(titulo = titulo, autor = autor, publicacion = publicacion)
        true
      }
      case None => false
    }
  }

  // TODO: Implementar las funciones actualizarLibro y eliminarLibro

  agregarLibro(1,"Libro 1","Autor 1",1943)
  agregarLibro(2,"Libro 2","Autor 2",1999)
  agregarLibro(3,"Libro 3","Autor 4",2000)
  agregarLibro(4,"El principito","Antoine de Saint-Exupéry",1943)

  actualizarLibro(4,"La principita","Antoine de Saint-Exupéry",1552)
  eliminarLibro(2)

  listarLibros()


}
