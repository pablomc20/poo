from car import Car
from account import Account
from driver import Driver
from user import User

if __name__ == "__main__":
    driver = Driver("Pablo", "CUMP970324", 4)

    car = Car("AMD1523", driver)
    car.passenger = 8
    car.printDataCar()

    user = User("Juanito", "JUAN76584729", 40)
    user.greeting()