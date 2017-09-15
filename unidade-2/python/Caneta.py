
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

	# construtor sem argumentos
	#def __init__(self):
	#	self.__cor = ""
	#	self.__marca = ""
	#	self.__material = ""
	#	self.__tipo = ""
	#	self.__preco = 0.0
	#	self.__ponta = 0.0

	# construtor com argumentos
	def __init__(self,
		cor = "", marca = "", 
		material = "", tipo = "", 
		preco = 0.0, ponta = 0.0):
		
		self.__cor = cor
		self.__marca = marca
		self.__material = material
		self.__tipo = tipo
		self.__preco = preco
		self.__ponta = ponta

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

	# novos métodos
	def imprimir(self):
		print("Cor: " + 
			self.getCor())
		print("Marca: " + 
			self.getMarca())
		print("Material: " + 
			self.getMaterial())
		print("Tipo: " + 
			self.getTipo())
		print("Preço: " + 
			str(self.getPreco()))
		print("Ponta: " + 
			str(self.getPonta()))
