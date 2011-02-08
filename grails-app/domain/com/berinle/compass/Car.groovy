package com.berinle.compass

class Car {

  String model
  Integer year

  static constraints = {}

//  static belongsTo = [person:Person]
  static belongsTo = Person

  static mapping = {
    table 'CAR'
    id column: 'PERSON_ID'
  }
}
