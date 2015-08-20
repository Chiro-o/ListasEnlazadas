import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class CtrlCalcuLISTAS implements ADTCalculadora{

	private AbstractListas<Double> lista;
	private String c;
	
	public CtrlCalcuLISTAS(){
		lista = new Circular<Double>();
		c="";
	}
	@Override
	public void readFile(String file) throws FileNotFoundException, Exception {
		// TODO Auto-generated method stub
		String texto="";
		try{
			//FileReader lector=new FileReader("src/texto.txt");
			/**
			 * se crean parapoder leer el archivo txt
			 */
			FileReader lector=new FileReader(file);
			BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null)
			{
			System.out.println("operacion: "+ texto);
			c=texto;
			}
		}
		/**
		 *programación en caso de que exista un error
		 */
		catch(Exception e){
			System.out.println("Error al leer");

		}
	}

	@Override
	public double calcular() throws Exception {
		// TODO Auto-generated method stub
		double n1, n2;
		/**
		 * pre: recibe cadena con la operacion
		 * post: resultado de la operacion
		 *este es el que va conparando si es un operando como +,-;/;*
		 */
		// TODO Auto-generated method stub
		for(int i=0; i<c.length(); i+=2){
			String valor = c.charAt(i)+"";
			
			if(!valor.equals("+") && !valor.equals("-") && !valor.equals("*") && !valor.equals("/")){
				
				double num = Double.parseDouble(valor);
				lista.addFirst(num);
				System.out.println(lista.getFirst());
			}
			/**
			 *si el valor es igual a "+" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("+")){
				n1= lista.removeFirst();
				n2= lista.removeFirst();
				lista.addFirst(n2+n1);
				System.out.println(lista.getFirst());
			}
			/**
			 *si el valor es igual a "-" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("-")){
				n1= lista.removeFirst();
				n2= lista.removeFirst();
				lista.addFirst(n2-n1);
				System.out.println(lista.getFirst());
			}
			/**
			 *si el valor es igual a "*" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("*")){
				n1= lista.removeFirst();
				n2= lista.removeFirst();
				lista.addFirst(n2*n1);
				System.out.println(lista.getFirst());
			}
			/**
			 *si el valor es igual a "/" procede a sacar n2 y n2 para sumarlos ymeterlos 
			 *nuevamente con el push
			 */
			else if(valor.equals("/")){
				//System.out.println(lista.getFirst());
				n1= lista.removeFirst();
				//System.out.println(lista.getFirst());
				n2= lista.getFirst();
				lista.addFirst(n1/n2);
				System.out.println(lista.getFirst());
			}
		}
		return lista.removeFirst();
		
	}
	
}
