package lista2;

public class Utilidades {
//Questão 1
	public int somatorio(int vet[]) {
		int soma = 0;
		for (int i = 2; i < vet.length - 2; i++) {
			soma = soma + vet[i];
		}
		return soma;
	}
//Questão 2
	public void numerosPares(int comeco, int fim) {
		for (int numerosEntre = comeco; numerosEntre < fim; numerosEntre++) {
			if (numerosEntre % 2 == 0)
				System.out.print(numerosEntre + " ");
		}
	}
// Questão 3
	public float media(float vet1[], float vet2[]) {
		float soma = 0;
		float media = 0;
		int i;
		for (i = 0; i < vet1.length; i++) {
			soma = soma + vet1[i];
		}
		for (i = 0; i < vet2.length; i++) {
			soma = soma + vet2[i];
		}
		media = soma / (vet1.length + vet2.length);
		return media;
	}
// Questão 4
	public float mediaPonderada(float Notas[], float Pesos[]) {
		float MediaPonderada = 0;
		float SomaPesos = 0;
		float NotaTotal = 0;
		int i;
		if (Pesos.length > Notas.length) {
			for (i = 0; i < Pesos.length; i++) {
				NotaTotal = NotaTotal + Pesos[i] * Notas[i];
			}
		}

		else {
			for (i = 0; i < Notas.length; i++) {
				NotaTotal = NotaTotal + Pesos[i] * Notas[i];
			}
		}
		for (i = 0; i < Pesos.length; i++) {
			SomaPesos = SomaPesos + Pesos[i];
		}
		MediaPonderada = NotaTotal / SomaPesos;

		return MediaPonderada;
	}
//Questão 5
	public int contagemDeElementos(int Numeros[], int Numeros2[], int Buscado) {

		int contador = 0;
		for (int i = 0; i < Numeros.length; i++) {
			if (Numeros[i] == Buscado)
				contador++;
		}
		for (int i = 0; i < Numeros2.length; i++) {
			if (Numeros2[i] == Buscado)
				contador++;
		}
		return contador;
	}
// Questão 6
	public int[] copiaDeVetor(int Base[]) {
		int Copia[] = new int[Base.length];
		for (int i = 0; i < Base.length; i++) {
			Copia[i] = Base[i];
		}
		return Copia;
	}
// Questão 7
	public int[] ordenacaoCrescente(int vet[]) {
		int i;
		boolean trocaOcorreu = false;
		do {
			for (i = 0; i < vet.length; i++) {
				if (vet[i + 1] < vet[i]) {
					vet[i] = vet[i + 1];
					trocaOcorreu = true;
				}
			}
		} while (trocaOcorreu);

		return vet;
	}
// Questão 8
	public boolean verificacaoDeOrdenacao(int vet[]) {
		int i;
		boolean ordenado = true;
		for (i = 0; i < vet.length; i++) {
			if (vet[i + 1] < vet[i]) {
				ordenado = false;
			}
		}
		if (ordenado == true) {
			return true;
		} else {
			return false;
		}
	}
// Questão 9
	public int kEsimoMaiorValor(int vet[], int k) {
		ordenacaoCrescente(vet);
		return vet[vet.length - k];
	}
// Questão 10
	public int kEsimoMenorValor(int vet[], int k) {
		ordenacaoCrescente(vet);
		return vet[k];
	}
// Questão 11
	public boolean verificacaoDeIgualdade(int vet[], int vet2[]) {
		boolean igual = true;
		int i;
		for (i = 0; i < vet.length; i++) {
			if (vet[i] != vet2[i]) {
				igual = false;
			}
		}
		if (igual == true) {
			return true;
		} else {
			return false;
		}
	}
// Questão 12
	public static double potenciacao(double base, int expoente) {
		double resultado = 1;
		int i;
		if (expoente == 0) {
			return 1;
		}
		for (i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}

	// Questão 13 e 17
	public boolean primo(int numero) {
		int i;
		if (numero == 1) {
			return false;
		}
		if (numero == 2) {
			return true;
		}
		for (i = 2; i < (numero / 2); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
// Questão 14
	public int[] buscaPorOcorrências(int vet[], int vet2[]) {
		ordenacaoCrescente(vet);
		ordenacaoCrescente(vet2);
		int i;
		int vet3[] = new int[vet.length];
		for (i = 0; i < vet.length; i++) {
			if (vet[i] == vet2[i]) {
				vet3[i] = vet[i];
			}
		}
		return vet3;
	}
// Questão 15
	public int[] remocaoDeElementoDeVetor(int vet[], int k) {
		int i;
		int contador = 0;
		for (i = 0; i < vet.length; i++) {
			if (vet[i] != k) {
				contador++;
			}
		}

		int vet2[] = new int[contador];
		for (i = 0; i < vet2.length; i++) {
			if (vet[i] != k) {
				vet2[i] = vet[i];
			}
		}
		return vet2;
	}
// Questão 16
	public boolean verificacaoPalindromo(String nome) {
		char[] nomeArray = nome.toCharArray();
		char[] nomeInvertido = new char[nome.length()];
		int i;
		int inversor = nomeArray.length;
		for (i = 0; i < nomeArray.length; i++) {
			nomeInvertido[i] = nomeArray[inversor];
			inversor--;
		}

		for (i = 0; i < nomeArray.length; i++) {
			if (nomeArray[i] != nomeInvertido[i]) {
				return false;
			}
		}

		return true;
	}
// Questão 18
	public String inversaoDeString(String nome) {
		char[] nomeArray = nome.toCharArray();
		char[] nomeInvertido = new char[nome.length()];
		int i;
		int inversor = nomeArray.length;
		for (i = 0; i < nomeArray.length; i++) {
			nomeInvertido[i] = nomeArray[inversor];
			inversor--;
		}

		return new String(nomeInvertido);
	}
// Questão 19
	public static double jurosCompostos(float valorInicial, double taxaJuros, int tempo) {
		double valorFinal;
		valorFinal = valorInicial * (potenciacao(taxaJuros + 1, tempo));
		return valorFinal;
	}
// Questão 20
	public boolean numeroPerfeito(int k) {
		int divisores[] = new int[k / 2];
		int i;
		int soma = 0;
		for (i = 1; i < k / 2; i++) {
			divisores[i - 1] = i;
		}
		for (i = 0; i < divisores.length; i++) {
			soma = soma + divisores[i];
		}

		if (soma == k) {
			return true;
		} else
			return false;

	}
// Questão 21
	public int[] diminuicaoDeVetor(int tamanho) {
		int[] vet = new int[tamanho];
		int i;
		for (i = tamanho; i > 0; i--) {
			int[] novoVet = new int[tamanho - 1];
			vet = novoVet;
		}
		return vet;
	}
// Questão 22
	public static void imprimirElementos(int tamanho) {
		for (int linha = 0; linha < tamanho; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int linha = 0; linha < tamanho; linha++) {
			for (int coluna = 0; coluna < tamanho; coluna++) {
				if (linha % 2 == 0) {
					if (coluna % 2 == 0) {
						System.out.print("@ ");
					} else {
						System.out.print("* ");
					}
				} else {
					if (coluna % 2 != 0) {
						System.out.print("@ ");
					} else {
						System.out.print("* ");
					}
				}
			}
			System.out.println();
		}

		System.out.println();

	}
}
		

	
	
	
	
	


