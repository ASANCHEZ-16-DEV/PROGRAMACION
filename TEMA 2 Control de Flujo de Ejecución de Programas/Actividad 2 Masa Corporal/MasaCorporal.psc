Algoritmo MasaCorporal
	Repetir
		Escribir 'Introduce tu peso'
		Leer peso
	Hasta Que peso>1
	Escribir 'Introduce tu altura'
	Leer altura
	IMC <- peso/(altura*altura)
	Si IMC>0 Y IMC<18.59 Entonces
		Escribir 'Su IMC corresponde a un peso bajo'
	SiNo
		Si IMC>18.50 Y IMC<24.9 Entonces
			Escribir 'Su IMC corresponde a un peso normal'
		SiNo
			Si IMC>25 Y IMC<29.9 Entonces
				Escribir 'Su IMC corresponde a un sobrepeso'
			SiNo
				Si IMC>30 Y IMC<34.9 Entonces
					Escribir 'Su IMC corresponde a una obesidad leve'
				SiNo
					Si IMC>35 Y IMC<39.9 Entonces
						Escribir 'Su IMC corresponde a una obesidad media'
					SiNo
						Si IMC>40 Entonces
							Escribir 'SU IMC corresponde a una obesidad mórbida'
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
