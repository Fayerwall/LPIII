class Horaexata:
    def __init__(self):
        self.hora = None
        self.min = None
        self.seg = None
        self.cent = None

    def definirhora(self):
        self.hora = int(input("digite apenas a hora do horario: "))
        self.min = int(input("digite agora os minutos do horario: "))
        self.seg = int(input("digite agora os segundos do horario: "))
        self.cent = int(input("digite agora os milisegundos do horario: "))
        if not 0<=self.hora<25 or not 0<=self.min<61 or not 0<=self.seg<60 or not 0<=self.cent<100:
            print("HORA INVALIDA!!!")
            self.hora = 0
            self.min = 0
            self.seg = 0
            self.cent = 0 

    def mostrahora(self):
        print(f"agora sao aproximadamente {self.hora}:{self.min}:{self.seg}:{self:cent}")

#pode-se usar todos os dados e operações do hora aproximada
