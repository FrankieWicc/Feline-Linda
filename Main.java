/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static class Viagem {
        String destino;
        int dias;
        
        Viagem(String destino, int dias) {
            this.destino = destino;
            this.dias = dias;
        }
    }
	public static void main(String[] args) {
	    Viagem[] viagens = new Viagem[5];
	    Viagens[0] = new Viagens("Rio de Janeiro", 5);
	    Viagens[1] = new Viagens("Salvador", 10);
	    Viagens[2] = new Viagens("Florianópolis", 7);
	    Viagens[3] = new Viagens("São Paulo", 8);
	    Viagens[4] = new Viagens("Recife", 12);
	    
	    int somaDias = 0;
	    
		System.out.println("Viagens com mais 7 dias:");
		for (int i = 0; i < viagens.length; i++) {
		    somaDias += viagens[i].dias;
		    
		    if (viagens[i].dias > 7) {
		        System.out.println("- " + viagens[i].destino + " (" + viagens[i].dias + " dias)");
		    }
		}
		
		double media = (double) somaDias / viagens.length;
		System.out.println("\nDuração média das viagens: " + media + " dias");
	}
}
