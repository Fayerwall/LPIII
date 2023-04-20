class Livro:
    def __init__(self):
        self.nomel = None
        self.autor = None
        self.pag = None
        self.editora = None
    
    def dadoslivro(self):
        self.nomel = input("qual o nome do livro: ")
        self.autor = input("qual o autor do livro: ")
        self.pag = input("qual o numero de paginas do livro: ")
        self.editora = input("qual a editora do livro: ")

    def mostradadosl(self):
        print(f"titulo: {self.nomel}\nautor: {self.autor}\npaginas: {self.pag}\neditora: {self.editora}")

    