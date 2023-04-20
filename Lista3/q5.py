class ContaBancariaSimp:
    def __init__(self):
        self.nome = None
        self.saldo = None
        self.contaespecial = None

        def abreConta(self):
            self.nome = input("digite o nome do correntista: ")
            self.saldo = input("digite o saldo inicial: ")
            if self.saldo <0:
                self.saldo = 0
            self.contaespecial = ("a conta é especial? ")

        def abreconta_s(self):
            self.nome = input("digite o nome do correntista: ")
            self.saldo = 0.00
            self.contaespecial = False

        def deposita(self):
            aux = float (input("digite o valor do deposito: "))
            self.saldo += aux

        def retira(self):
            aux = float (input("digite o valor a sacar: "))
            self.saldo -= aux

        def mostradados(self):
            print(f"nome: {self.nome}\nsaldo: R${self.saldo}\nconta é especial: {self.especial}")