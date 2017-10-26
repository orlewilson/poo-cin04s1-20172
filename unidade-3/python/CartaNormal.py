
"""
Disciplina:	Programação Orientada a 
		    Objetos

Professor:	Orlewilson B. Maia
Data:		25/10/2017
Autor:		Orlewilson B. Maia
Descrição:	Modelo para representar
			uma carta normal do Uno

Nome do arquivo: CartaNormal.py

"""
# importar as classes
from Carta import Carta

# Classe CartaNormal
class CartaNormal(Carta):

	# atributos (com encapsulamento)
	# __ significa private do Java
	__numero = None
	
	# construtor com argumentos
	def __init__(self, cor = "", numero = ""):
		
		# primeira forma
		# Carta.setCor(self, cor)
		
		# segunda forma
		Carta.__init__(self, cor)
		
		# terceira forma
		#super().__init__(cor)
		self.__numero = numero

	# Métodos para garantir o encapsulamento dos
	# atributos
	def setNumero(self, numero):
		self.__numero = numero

	def getNumero(self):
		return self.__numero
