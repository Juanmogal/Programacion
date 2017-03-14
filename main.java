public class main {
	
	public static void main (String[] args) {
		
		//int numero = 2;
		int [] numeros;
		numeros = new int [10];
		//numeros [0] = 3;
		for(int i=1;i<10;i++){
		numeros [i] = i;
		
	
		
		//System.out.println("el numero es "+ numeros[i]);
		
		
			
	}
			System.out.println("");
			if(comprobarNumero(numeros,11)==true)
			{
				System.out.println("Encontrado");	
			}else
			{
				System.out.println("NO Encontrado");
				}
			
	
	}
	public static boolean comprobarNumero(int[]array,int numero)
	 {
		boolean comprobarnumero = false;
		for(int i=0;i<array.length;i++){
			if(comprobarnumero==false){
			
			
			
			if(numero==array[i])
			{
				comprobarnumero = true;
			}
			System.out.println("i: "+i+" posicionArray "+array[i]);
			}
		}
		return comprobarnumero;
		}
	
	
}


