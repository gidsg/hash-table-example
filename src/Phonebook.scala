object Phonebook {

  def main(args: Array[String]) {

    // Empty hash table whose keys are strings and values are strings:
    var phoneBook:Map[String,String] = Map()

    phoneBook= Map("Chris Spranklen" -> "07957 450504", "Tom Goodhew" -> "07841 472562")

    println( "Keys in phonebook : " + phoneBook.keys )
    println( "Values in phonebook : " + phoneBook.values )
    println( "Check if phonebook is empty : " + phoneBook.isEmpty )
  }





}
