Algoritmo sin_titulo
	Escribir 'Introduce el primer n�mero'
	Leer n1
	Escribir 'Introduce el segundo n�mero'
	Leer n2
	Escribir 'Que operaci�n desea realizar'
	Escribir 'suma'
	Escribir 'resta'
	Escribir 'multiplicaci�n'
	Escribir 'divisi�n'
	suma <- n1+n2
	resta <- n1-n2
	multiplicaci�n <- n1*n2
	division <- n1 MOD n2
	Leer operacion
	Si operacion="suma" Entonces
		Escribir suma
	SiNo
		Si operacion="resta" Entonces
			Escribir resta
		SiNo
			Si operacion="multiplicaci�n" Entonces
				Escribir multiplicaci�n
			SiNo
				Si operacion="division" Entonces
					Escribir division
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
