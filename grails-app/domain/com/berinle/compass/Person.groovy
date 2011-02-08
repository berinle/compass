package com.berinle.compass

class Person {

  String firstName
  String lastName

  static hasMany = [cars:Car, bikes:Bike]

    static constraints = {
    }

  static mapping = {
    table 'PERSON'
    car joinTable:[name:'CAR', column:'PERSON_ID']
    bike joinTable:[name:'BIKE', column:'PERSON_ID']
  }
}
