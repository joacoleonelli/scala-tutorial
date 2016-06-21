

//class Counter{ } constructor sin parametros
class Counter (forename: String, initial: String, surname: String) {
  private var count = 0
  
  //constructor auxiliar, podemos evitar este constructor dandole un valor por defecto
  //al parametro intial --> initial: String = ""
  def this(forename: String, surname: String){
    this(forename, "", surname)
  }
  
  def increment(){
    count += 1
  }
  
  def getCount = count
}

object Counter{
  
  //factory method
  def apply(forename: String, initial: String, surname: String) = new Counter(forename, initial, surname)
  
  def main(args: Array[String]){
    new Counter("Joaquin", "F", "Leonelli")
    new Counter("Joaquin", surname = "Leonelli") // para decirle q es surname y no initial
    
    Counter.apply("Paula", "G", "Leonelli")
  }
}