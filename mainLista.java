import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Christopher Chiroy, Jose Ochoa, Diego de León
 * @category Hoja de Trabajo 2
 */
public class mainLista {
	
	public static void main(String args[]) throws FileNotFoundException, Exception{
		//CtrlCalcuLISTAS calcu = new CtrlCalcuLISTAS();
		CtrlCalculadora calcu = new CtrlCalculadora();
		
			calcu.readFile("src/datos.txt");
		try {
			System.out.println(""+calcu.calcular());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al hacer la operacion");
		}
	}

}
