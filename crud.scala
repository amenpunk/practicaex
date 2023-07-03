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

  def mostrarProductos(): Unit = {
    productos.foreach(println)
  }

  agregarProducto(1,"Coca Cola", 10.0)
  agregarProducto(2,"Pepsi", 8.0)

  mostrarProductos()

  val producto = buscarProducto(1)

  productoBuscado match {
    case Some(producto) => println(s"Producto encontrado: $producto")
    case None => println("No existe el producto")
  }

  val actualizacionExitosa = actualizarPrecio(1, 12.99)
  if(acutalizacionExitosa){
    println("Precio actualizado correctamente")
  }else{
    println("no se pudo actualizar el precio del producto")
  }


  val eliminacionExitosa = eliminarProducto(1)
  if(eliminacionExitosa){
    println("Producto eliminado correctamente")
  }else{
    println("No se pudo eliminar el producto")
  }


}
