class Lampada:
    def _init_(self,lamp: str,preco:int):
        self.lamp =lamp
        self.preco = preco
    
    def ligar(self):
        self.lamp = "ligada"

    def desligar(self):
        self.lamp = "desligada"

    def infvalor(self):
        print(f"o valor da self.lamp é: R${self.preco}")

    def estaLigada(self):
        if self.lamp == "ligada":
            return True
        else:
            return False