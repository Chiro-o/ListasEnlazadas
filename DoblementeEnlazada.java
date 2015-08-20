//Universidad Del valle de Guatemala 
//Algoritmos y Estructura de Datos 
//Interface de Listas Enlazadas 
//Pedro Joaquin Castillo Coronado 14224
//Freddy José Ruíz  Gatica 14592
//Christopher Antonio Chiroy Miranda 14411
//Boris Alejandro Cifuentes 14150

public class DoblementeEnlazada<E> extends AbstractListas<E>{
	private DobleNodo<E> cabeza;
	private DobleNodo<E> cola; 
	
	public DoblementeEnlazada(){
		super(); 
		cabeza=null;
		cola=null;
	}
	
//	public int size() {
//		// TODO Auto-generated method stub
//		return count;
//	}

	public void addFirst(E value) {
		// TODO Auto-generated method stub	
			//DobleNodo<E> temp= cabeza;
			cabeza= new DobleNodo<E>(value,cabeza,null);
			//temp.setPrev(cabeza);
			if(cola==null)
				cola = cabeza;
			count++;
		}
	

	public E removeFirst() {
		// TODO Auto-generated method stub
			DobleNodo<E> temp =cabeza;
			cabeza=cabeza.next();
			cabeza.setPrev(null);
			count--;
			return temp.valor();
		
	}

	public E removeLast() {
		// TODO Auto-generated method stub
			DobleNodo<E> temp=cola;
			cola=temp.prev();
			cola.setNext(null);
			count--;
			return temp.valor();
		}
	

	public void addLast(E value) {
		// TODO Auto-generated method stub
			DobleNodo<E> temp= cola;
			cola= new DobleNodo<E>(value,null,temp);
			temp.setNext(cola);
			count++;
	}

	public E getFirst() {
		// TODO Auto-generated method stub
		return cabeza.valor();
	}

	public boolean contains(Object value) {
		// TODO Auto-generated method stub
		DobleNodo<E> temp=cabeza;
		int contador=0;
		while (temp.next()!=null){
			if(value==temp.valor()){
				contador++;
				temp=temp.next();
			}
			else{
				temp=temp.next();
			}
		}
		if(contador>0){
			return true;
		}
		else{
			return false;
		}
	}

}
