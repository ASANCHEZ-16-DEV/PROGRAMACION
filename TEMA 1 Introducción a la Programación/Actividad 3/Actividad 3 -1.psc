Algoritmo sin_titulo
	Escribir 'Introduce el primer número'
	Leer n1
	Escribir 'Introduce el segundo número'
	Leer n2
	Escribir 'Que operación desea realizar'
	Escribir 'suma'
	Escribir 'resta'
	Escribir 'multiplicación'
	Escribir 'división'
	suma <- n1+n2
	resta <- n1-n2
	multiplicación <- n1*n2
	division <- n1 MOD n2
	Leer operacion
	Si operacion="suma" Entonces
		Escribir suma
	SiNo
		Si operacion="resta" Entonces
			Escribir resta
		SiNo
			Si operacion="multiplicación" Entonces
				Escribir multiplicación
			SiNo
				Si operacion="division" Entonces
					Escribir division
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
