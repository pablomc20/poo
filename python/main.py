from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo desde python")

    car = Car("AMD123", Account("Pablo", "CUMP970324"))
    car.passenger = 8


    print(vars(car))
    print(vars(car.driver))