//Universidad Del valle de Guatemala 
//Algoritmos y Estructura de Datos 
//Interface de Listas Enlazadas 
//Pedro Joaquin Castillo Coronado   	14224
//Freddy José Ruíz Gatica 				14592
//Christopher Antonio Chiroy Miranda    14411
//Boris Alejandro Cifuentes 			14150

public class DobleNodo<E>{
	private E valor; 
	private DobleNodo<E> next; 
	private DobleNodo<E> prev; 
	
	public DobleNodo(E valor, DobleNodo<E> next,DobleNodo<E> prev){
		this.valor=valor;
		this.next=next; 
		this.prev=prev;
	}
	
	public void setValor(E valor){
		this.valor=valor;
	}
	
	public void setNext(DobleNodo<E> next){
		this.next=next;
	}
	
	public void setPrev(DobleNodo<E> prev){
		this.prev=prev;
	}
	
	public E valor(){
		return valor;
	}
	
	public DobleNodo<E> next(){
		return next;
	}
	
	public DobleNodo<E> prev(){
		return prev; 
	}
}
