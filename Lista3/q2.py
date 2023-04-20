class Lampada3estados:
    def _init_(self,lamp: str):
        self.lamp = lamp
    
    def ligar(self):
        self.lamp = "ligada"

    def desligar(self):
        self.lamp = "desligada"

    def luzmedia(self):
        self.lamp = "meia luz"

    def modo(self):
        print(f"a lampada se encontra em {self.lamp}")