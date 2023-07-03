import scala.collection.mutable.ListBuffer
import scala.io.StdIn

case class Libros (id:Int,titulo:String,autor:String,publicacion:Int)

object Libros {

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

  // // TODO: Implementar las funciones actualizarLibro y eliminarLibro
  //
  agregarLibro(1,"Libro 1","Autor 1",1943)
  agregarLibro(2,"Libro 2","Autor 2",1999)
  agregarLibro(3,"Libro 3","Autor 4",2000)
  agregarLibro(4,"El principito","Antoine de Saint-Exupéry",1943)
  //
  // actualizarLibro(4,"La principita","Antoine de Saint-Exupéry",1552)
  // eliminarLibro(2)
  //
  // listarLibros()

 //
  def mostrarMenu(): Unit = {
    println("1. Agregar libro")
    println("2. Buscar libro")
    println("3. Actualizar libro")
    println("4. Eliminar libro")
    println("5. Listar libros")
    println("6. Salir")
  }
 //
 //
 //
  def main(args: Array[String]): Unit = {
    var opcion = 0
    while (opcion != 4) {
      mostrarMenu()
      opcion = StdIn.readInt()
      // seleccionarOpcion(opcion)
    }
    // listarLibros()
  }
 //
 //  def seleccionarOpcion(opcion: Int): Unit = {
 //    opcion match {
 //      case 1 => println("Has seleccionado la Opción 1")
 //      case 2 => println("Has seleccionado la Opción 2")
 //      case 3 => println("Has seleccionado la Opción 3")
 //      case 4 => println("Saliendo del programa...")
 //      case _ => println("Opción inválida")
 //    }
 //    // println()
 //  }



}
