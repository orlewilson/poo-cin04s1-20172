
"""
Disciplina:	Programação Orientada a 
		    Objetos

Professor:	Orlewilson B. Maia
Data:		25/10/2017
Autor:		Orlewilson B. Maia
Descrição:	Modelo para representar
			uma jogador do Uno

Nome do arquivo: Jogador.py

"""

# Classe Caneta
class Jogador:

	# atributos (com encapsulamento)
	# __ significa private do Java
	__cartasNormal = None
	__cartasEspecial = None
	__nome = None

	# construtor com argumentos
	def __init__(self,
		nome = ""):
		
		self.__nome = nome
		self.__cartasNormal = []
		self.__cartasEspecial = []


	# Métodos para garantir o encapsulamento dos
	# atributos
	def addCartaNormal(self, cartaNormal):
		self.__cartasNormal.append(cartaNormal)

	def addCartaEspecial(self, cartaNormal):
		self.__cartasEspecial.append(cartaNormal)

	def getCartasNormal(self):
		return self.__cartasNormal

	def getCartasEspecial(self):
		return self.__cartasEspecial