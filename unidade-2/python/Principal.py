"""
Disciplina:	Programação Orientada a 
		    Objetos

Professor:	Orlewilson B. Maia
Data:		31/08/2017
Autor:		Orlewilson B. Maia
Descrição:	Arquivo para rodar exemplo
			da classe Caneta

Nome do arquivo: Principal.py

"""

# importar arquivo
from Caneta import Caneta

# criando objeto do tipo Caneta
bic = Caneta()

# atrituindo valores
bic.cor = "vermelha"
bic.marca = "BIC"
bic.material = "plástico"
bic.tipo = "esferográfica"
bic.preco = 2.3
bic.ponta = 0.7

# mostrando valores
print("Cor: " + bic.cor)
print("Marca: " + bic.marca)
print("Material: " + bic.material)
print("Tipo: " + bic.tipo)
print("Preço: " + str(bic.preco))
print("Ponta: " + str(bic.ponta))
