//Universidad Del valle de Guatemala 
//Algoritmos y Estructura de Datos 
//Interface de Listas Enlazadas 
//Pedro Joaquin Castillo Coronado 14224
//Freddy José Ruíz  Gatica 14592
//Christopher Antonio Chiroy Miranda 14411
//Boris Alejandro Cifuentes 14150

public class Circular<E> extends AbstractListas<E>{
	private Nodo<E> cabeza;
	
	/**
	 * Método: Circular
	 * Funcionalidad:
	 * Constructor en la primera posición y el count igual a 0
	 */
	public Circular(){
		super();
		cabeza=null;
	}
	
	public void addFirst(E value) {
		Nodo<E> temporal = new Nodo<E>(value);
		if(cabeza == null){
			cabeza = temporal;
			cabeza.setNext(cabeza);
		}
		else{
			temporal.setNext(cabeza);
			cabeza=temporal;
		}
		count++;
	}
	
	public E removeFirst(){
		//Nodo <E> apuntador = cabeza; //Iniciando el recorrido desde el comienzo
		Nodo <E> temporal= cabeza;
		cabeza = cabeza.next();
		count--;
		return temporal.valor();
		
	}
	
	public E removeLast(){
		Nodo <E> apuntador = cabeza; //Iniciando el recorrido desde el comienzo
		Nodo <E> temporal= cabeza;
		while(apuntador.next() != cabeza){
			apuntador=apuntador.next();//Almacena el nodo siguiente
		}
	if (apuntador != cabeza){
		apuntador.setNext(cabeza.next());
		cabeza=apuntador;
		count--;
	}
	else{
		cabeza=null;
		count--;
	}
		return temporal.valor();
	}
	public void addLast(E value){ //Ya que la cola y la cabeza son iguales 
		addFirst(value);
		cabeza=cabeza.next();
	}
	
	public E getFirst(){
		return cabeza.valor();
	}
	
	public boolean contains (E value){
		Nodo<E> apuntador = cabeza;
		boolean exist=false;
		while(apuntador!=null){
			apuntador = apuntador.next();
		   if (apuntador.valor().equals(value) == true){
			   exist=true;
			}
			else{
				exist=false;
			}
		}
		return exist;
	}

}
