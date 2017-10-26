
"""
Disciplina:	Programação Orientada a 
		    Objetos

Professor:	Orlewilson B. Maia
Data:		25/10/2017
Autor:		Orlewilson B. Maia
Descrição:	Modelo para representar
			uma carta especial do Uno

Nome do arquivo: CartaEspecial.py

"""

# importar as classes
from Carta import Carta

# Classe CartaEspecial que herda de Carta
class CartaEspecial (Carta):

	# atributos (com encapsulamento)
	# __ significa private do Java
	__simbolo = None
	
	# construtor com argumentos
	def __init__(self, cor = "", simbolo = ""):
		
		# primeira forma
		#Carta.setCor(self, cor)
		
		# segunda forma (recomendação)
		Carta.__init__(self, cor)

		# terceira forma
		# super().__init__(cor)

		self.__simbolo = simbolo

	





	# Métodos para garantir o encapsulamento dos
	# atributos
	def setSimbolo(self, simbolo):
		self.__simbolo = simbolo

	def getSimbolo(self):
		return self.__simbolo
