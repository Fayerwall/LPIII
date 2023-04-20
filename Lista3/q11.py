class LivrodeBiblioteca:
    def __init__(self):
        self.nomel = None
        self.autor = None
        self.pag = None
        self.editora = None
        self.valor = None
        self.estoque = None
    
    def dadoslivro(self):
        self.nomel = input("qual o nome do livro: ")
        self.autor = input("qual o autor do livro: ")
        self.pag = input("qual o numero de paginas do livro: ")
        self.editora = input("qual a editora do livro: ")
        self.valor = float (input("qual o valor do livro:"))
        self.estoque = int (input("quantos deste livro ha no estoque: "))

    def mostradadosl(self):
        print(f"titulo: {self.nomel}\nautor: {self.autor}\npaginas: {self.pag}\neditora: {self.editora}\nvalor do livro: {self.valor}")

    def disponivel(self):
        if self.estoque == 0:
            print("nao ha estoque desse livro!")
        else:
            print("livro em estoque!")

    def empresta(self):
        if self.estoque >0:
            print("livro emprestado!")
            self.estoque -= 1
        else:
            print("nao restam livros para emprestar!")

    def devolve(self):
        print("livro devolvido!")
        self.estoque+=1

#a diferença dessa questao para a anterior, é que nessa os livros nao sao comprados,
#podendo ser devolvidos a biblioteca novamente