class Linha2D:
    def __init__(self):
        self.x1 = 0
        self.y1 = 0
        self.x2 = 0
        self.y2 = 0

    def inserirval(self):
        self.x1 = int(input("insira o novo valor do primeiro x: "))
        self.y1 = int(input("insira o novo valor do primeiro y: "))
        self.x2 = int(input("insira o valor do segundo x: "))
        self.x2 = int(input("insira o valor do segundo y:"))
    def mostralinha(self):
        print(f"a linha traca os pontos: ({self.x1},{self.y2}) e ({self.x2},{self.y2})")
        