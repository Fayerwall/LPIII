class Lampada:
    def _init_(self,lamp: str,preco:int):
        self.lamp = lamp
        self.preco = preco
    
    def ligar(self):
        self.lamp = "ligada"

    def desligar(self):
        self.lamp = "desligada"

    def modo(self):
        print(f"a lampada se encontra em {self.lamp}")

    def infvalor(self):
        print(f"o valor da lamp é: R${self.preco}")
        