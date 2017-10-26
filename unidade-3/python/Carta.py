
"""
Disciplina:	Programação Orientada a 
		    Objetos

Professor:	Orlewilson B. Maia
Data:		25/10/2017
Autor:		Orlewilson B. Maia
Descrição:	Modelo para representar
			uma carta do Uno

Nome do arquivo: Carta.py

"""

# Classe Carta
class Carta:

	# atributos (com encapsulamento)
	# __ significa private do Java
	__cor = None
	
	# construtor com argumentos
	def __init__(self, cor = ""):
		self.__cor = cor

	# Métodos para garantir o encapsulamento dos
	# atributos
	def setCor(self, cor):
		self.__cor = cor

	def getCor(self):
		return self.__cor
