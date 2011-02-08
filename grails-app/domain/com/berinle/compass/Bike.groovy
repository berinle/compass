package com.berinle.compass

class Bike {

  String name
  String type

  //static belongsTo = [person:Person]
  static belongsTo = Person
  
  static constraints = {}
  static mapping = {
    table 'BIKE'
    id column: 'PERSON_ID'
  }
}
