import com.berinle.compass.Person
import com.berinle.compass.Bike
import com.berinle.compass.Car

class BootStrap {

    def init = { servletContext ->

      println "seeding database..."
      (1..1000).each{
        new Person(firstName:'firstName'+it, lastName:'lastName'+it).save()
      }

      (1..30).each{
        Person.get(it).addToBikes(new Bike(name:"Bike"+it, type:"BMX"+it))
        Person.get(it).addToCars(new Car(model:"BMW"+it, year:2007))
      }

      (50..100).each{
        if(it%2 == 0)
          Person.get(it).addToCars(new Car(model:"Toyota"+it, year:2002))
        else
          Person.get(it).addToCars(new Car(model:"Honda"+it, year:2010))
      }

      println "done seeding!"
    }
    def destroy = {
    }
}
