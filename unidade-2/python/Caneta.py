
"""
Disciplina:	Programação Orientada a 
		    Objetos

Professor:	Orlewilson B. Maia
Data:		31/08/2017
Autor:		Orlewilson B. Maia
Descrição:	Modelo para representar
			o modelo de uma caneta

Nome do arquivo: Caneta.py

"""

# Classe Caneta
class Caneta:

	# atributos (sem encapsulamento)
	#cor = None
	#marca = None
	#material = None
	#tipo = None
	#preco = None
	#ponta = None
	
	# atributos (com encapsulamento)
	# __ significa private do Java
	__cor = None
	__marca = None
	__material = None
	__tipo = None
	__preco = None
	__ponta = None

	# Métodos para garantir o encapsulamento dos
	# atributos
	def setCor(self, cor):
		self.__cor = cor

	def getCor(self):
		return self.__cor

	def setMarca(self, marca):
		self.__marca = marca

	def getMarca(self):
		return self.__marca

	def setMaterial(self, material):
		self.__material = material

	def getMaterial(self):
		return self.__material

	def setTipo(self, tipo):
		self.__tipo = tipo

	def getTipo(self):
		return self.__tipo

	def setPreco(self, preco):
		self.__preco = preco

	def getPreco(self):
		return self.__preco

	def setPonta(self, ponta):
		self.__ponta = ponta

	def getPonta(self):
		return self.__ponta