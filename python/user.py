from account import Account

class User(Account):
    eag = int

    def __init__(self, name, document, eag):
        super().__init__(name, document)
        self.eag = eag

    def greeting(self):
        print("Soy el pasajero {0} y mi curp es {1}".format(self.name, self.document))