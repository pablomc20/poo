from account import Account

class Driver (Account):
    yearsWorking = int

    def __init__(self, name, document, yearsWorking):
        super().__init__(name, document)
        self.yearsWorking = yearsWorking

    def greeting(self):
        print("Soy el conductor {0} y llevo {1} años trabajando".format(self.name, self.yearsWorking))