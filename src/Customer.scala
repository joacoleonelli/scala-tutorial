

class Customer (val name: String, val address: String) extends Ordered[Customer]{
  private var _id = ""
  private var totalValue = 0
  
  def id = _id
  
  def id_=(value: String){
    if(_id.isEmpty)
      _id = value
  }
  
  def total: Double = {
    totalValue
  }
  
  def compare(that: Customer): Int = name.compare(that.name)
  
  override def toString: String = name + " $ " + address
}

class CustormerConDescuento(name: String, address: String) extends Customer(name, address){
  override def total: Double = {
    super.total * 0.9
  }
}

object Customer{
  def main(args: Array[String]){
    val eric = new Customer("Eric", "Las moreras")
    eric.id = "000001"
  }
}