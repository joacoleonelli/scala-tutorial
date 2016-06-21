import scala.collection.mutable

class Customers extends Sortable[Customer]{
  private val customers = mutable.Set[Customer]()
  
  def add(customer: Customer) = customers.add(customer)
  def iterator: Iterator[Customer] = customers.iterator
}

object Customers{
  def main(args: Array[String]){
    val customers = new Customers()
    customers.add(new Customer("Joaquin", "Las Moreras"))
    customers.add(new Customer("Agustin", "Ampere"))
    customers.add(new Customer("Ignacio", "San Juan"))
    println(customers.sort)
  }
}