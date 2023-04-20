class Data:
    def __init__(self):
        self.dia = None
        self.mes = None
        self.ano = None

    def inicializadata(self):
        self.dia = int(input("digite um dia: "))
        self.mes = int(input("digite um mes: "))
        self.ano = int(input("digite um ano: "))

        if not 0<self.dia<32 or not 0<self.mes<13 or not self.ano<0 :
            self.dia = 0
            self.mes = 0
            self.ano = 0

        elif self.mes == 4 or self.mes == 6 or self.mes == 9 or self.mes == 11 and self.dia>30:
            self.dia = 0
            self.mes = 0
            self.ano = 0
        elif self.mes == 2 and self.dia == 29:
            
            while True:
                if self.ano % 400 == 0:
                    break
                if self.ano % 4 == 0 and self.ano % 100 != 0:
                    break
                else:
                    self.dia = 0
                    self.mes = 0
                    self.ano = 0
                    break
                

    def datavalida(self):
        if self.dia == 0 or self.mes == 0 or self.ano == 0:
            return False
        else:
            return True
        
    def mostradata(self):
        print(f"{self.dia}/{self.mes}/{self.ano}")