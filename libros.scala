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

  def mostrarMenu(): Unit = {
    println("1. Agregar libro")
    println("2. Actualizar libro")
    println("3. Eliminar libro")
    println("4. Listar libros")
    println("5. Salir")
  }

  def existeLibro(id: Int): Boolean = {
    buscarLibro(id) match {
      case Some(libro) => true
      case None => false
    }
  }

  def main(args: Array[String]): Unit = {
    var opcion = 0
    while (opcion != 5) {
      mostrarMenu()
      opcion = StdIn.readInt()
      if(opcion == 5) System.exit(0)
      seleccionarOpcion(opcion)
    }
  }

  def seleccionarOpcion(opcion: Int): Unit = {
    opcion match {
      case 1 => {
        var id =0
        var publicacion = 0
        var titulo=""
        var autor = ""

        println("Ingrese el id del libro")
        id = StdIn.readInt()
        println("Ingrese autor")
        autor = StdIn.readLine()
        println("titulo")
        titulo = StdIn.readLine()
        println("Ingrese ano de publicacion")
        id = StdIn.readInt()
        agregarLibro(id, titulo, autor, publicacion)
      }
      case 2 => {
        var id =0
        var publicacion = 0
        var titulo=""
        var autor = ""

        println("Ingrese el id del libro")
        id = StdIn.readInt()

        println("Ingrese autor")
        autor = StdIn.readLine()
        println("titulo")
        titulo = StdIn.readLine()
        println("Ingrese ano de publicacion")
        id = StdIn.readInt()
        actualizarLibro(id, titulo, autor, publicacion)
        print("Libro actualizado")

      }
      case 3 => {
        var id = 0;
        printf("Ingrese el id del libro a eliminar")
        id = StdIn.readInt()
        eliminarLibro(id)
        print("Libro elmiminado")
      }
      case 4 => listarLibros()
      case 5 => System.exit(0)
      case _ => println("Opción inválida")
    }
    // println()
  }



}
