import java.util.Scanner;
public class RodizioVeiculo {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		byte numPlaca;
		System.out.println ("Digite o �ltimo n�mero da placa do ve�culo:");
		numPlaca=ler.nextByte();
		switch (numPlaca) {
			case 1:
			case 2:
				System.out.println("O ve�culo n�o pode circular na segunda-feira.");
				break;
			case 3:
			case 4:
				System.out.println ("O ve�culo n�o pode circular na ter�a-feira.");
				break;
			case 5:
			case 6:
				System.out.println ("O ve�culo n�o pode circular na quarta-feira.");
				break;
			case 7:
			case 8:
				System.out.println("O ve�culo n�o pode circular na quinta-feira.");
				break;
			case 9:
			case 0:
				System.out.println ("O ve�culo n�o pode circular na sexta-feira.");
				break;
			default:
				System.out.println("N�mero inv�lido.");
		}
		ler.close();
	}

}
