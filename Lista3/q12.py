class Ponto2D:
    def __init__(self):
        self.x = 0
        self.y = 0

    def inserirval(self):
        self.x = int(input("insira o novo valor de x: "))
        self.y = int(input("insira o novo valor de y: "))

    def mostrarponto(self):
        print(f"o ponto se encontra no conjunto: ({self.x},{self.y})")
        