class Lampada:
    def __init__(self,lamp: int):
        self.lamp = lamp
    
    def ligar(self):
        self.lamp = 100

    def desligar(self):
        self.lamp = 0

    def ajustebrilho(self):
        self.lamp = input("qual a nova porcentagem de brilho da lampada: ")

    def porcentagembrilho(self):
        print(f"a porcentagem de brilho da lampada é de:{self.lamp}%")

