object Phonebook {

  def main(args: Array[String]) {

    // Empty hash table whose keys are strings and values are strings:
    var phoneBook:Map[String,String] = Map()

    phoneBook= Map("Chris Spranklen" -> "0123 456789", "Tom Goodhew" -> "456 789123")

    println( "Keys in phonebook : " + phoneBook.keys )
    println( "Values in phonebook : " + phoneBook.values )
    println( "Check if phonebook is empty : " + phoneBook.isEmpty )

    //lookup
    if(phoneBook.contains("Chris Spranklen")){
      println("Chris Spranklen is in the phonebook with value: "  + phoneBook("Chris Spranklen"))
    }else{
      println("Chris Spranklen not found")
    }

  }

}
