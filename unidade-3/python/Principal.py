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
from Jogador import Jogador
from CartaNormal import CartaNormal
from CartaEspecial import CartaEspecial

# para embaralhar lista
import random





# lista das cartas normal e especial
cartasNormal = []
cartasEspecial = []

# criando as cartas normal
for cor in ["vermelho", "azul","verde", 
"amarelo"]:
	for cont in range(0,2):
		for number in range(0, 10):
			cartasNormal.append(
				CartaNormal(cor, number))

# criando as cartas especial
cartasEspecial.append(
	CartaEspecial("vermelha", "+2"))
cartasEspecial.append(
	CartaEspecial("verde", "+2"))
cartasEspecial.append(
	CartaEspecial("amarela", "+2"))
cartasEspecial.append(
	CartaEspecial("azul", "+2"))

cartasEspecial.append(
	CartaEspecial("vermelha", "voltar"))
cartasEspecial.append(
	CartaEspecial("verde", "voltar"))
cartasEspecial.append(
	CartaEspecial("amarela", "voltar"))
cartasEspecial.append(
	CartaEspecial("azul", "voltar"))

cartasEspecial.append(
	CartaEspecial("vermelha", "bloquear"))
cartasEspecial.append(
	CartaEspecial("verde", "bloquear"))
cartasEspecial.append(
	CartaEspecial("amarela", "bloquear"))
cartasEspecial.append(
	CartaEspecial("azul", "bloquear"))

cartasEspecial.append(
	CartaEspecial("preta", "+4"))
cartasEspecial.append(
	CartaEspecial("preta", "mudarcor"))


# embaralhar lista
random.shuffle(cartasNormal)

for carta in cartasNormal:
      print (carta.getCor())
      print (carta.getNumero())




