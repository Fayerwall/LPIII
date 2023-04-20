class Horaaprox:
    def __init__(self):
        self.hora = None
        self.min = None

    def definirhora(self):
        self.hora = int(input("digite apenas a hora do horario: "))
        self.min = int(input("digite agora os minutos do horario: "))
        if not 0<=self.hora<25 or not 0<=self.min<61:
            print("HORA INVALIDA!!!")
            self.hora = 0
            self.min = 0

    def mostrahora(self):
        print(f"agora sao aproximadamente {self.hora}:{self.min}")

