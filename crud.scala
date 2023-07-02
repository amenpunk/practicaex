import scala.collection.mutable.ListBuffer

case class Producto (id:Int,nombre:String,precio:Double)

object Main extends App {

  val productos : ListBuffer[Producto] = ListBuffer()

  def agregarProducto(id:Int,nombre:String,precio:Double): Unit = {
    val producto = Producto(id,nombre,precio)
    productos += producto
  }

  def buscarProducto(id:Int): Option[Producto] = {
    productos.find(_.id == id)
  }

  def actualizarPrecio(id:Int,nuevoPrecio: Double):Boolean = {
    buscarProducto(id) match {
      case Some(producto) => {
        val indice = productos.indexOf(producto)
        productos(indice) = producto.copy(precio = nuevoPrecio)
        true
      }
      case None => false
    }
  }

  def eliminarProducto(id: Int) : Boolean = {
    buscarProducto(id) match {
      case Some(producto) => {
        productos -= producto
        true
      }
      case None => false
    }
  }

}
