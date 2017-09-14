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

# atrituindo valores (sem encapsulamento)
#bic.cor = "vermelha"
#bic.marca = "BIC"
#bic.material = "plástico"
#bic.tipo = "esferográfica"
#bic.preco = 2.3
#bic.ponta = 0.7

# atrituindo valores (com encapsulamento)
bic.setCor("vermelha")
bic.setMarca("BIC")
bic.setMaterial("plástico")
bic.setTipo("esferográfica")
bic.setPreco(2.3)
bic.setPonta(0.7)

# mostrando valores (sem encapsulamento)
#print("Cor: " + bic.cor)
#print("Marca: " + bic.marca)
#print("Material: " + bic.material)
#print("Tipo: " + bic.tipo)
#print("Preço: " + str(bic.preco))
#print("Ponta: " + str(bic.ponta))

# mostrando valores (com encapsulamento)
print("Cor: " + bic.getCor())
print("Marca: " + bic.getMarca())
print("Material: " + bic.getMaterial())
print("Tipo: " + bic.getTipo())
print("Preço: " + str(bic.getPreco()))
print("Ponta: " + str(bic.getPonta()))
