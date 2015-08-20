//Universidad Del valle de Guatemala 
//Algoritmos y Estructura de Datos 
//Interface de Listas Enlazadas 
//Pedro Joaquin Castillo Coronado 14224
//Freddy José Ruíz  Gatica 14592
//Christopher Antonio Chiroy Miranda 14411
//Boris Alejandro Cifuentes 14150

public class Nodo<E> {
	private E valor;
	private Nodo<E> next;
	
	public Nodo(E valor, Nodo<E> next){
		this.valor=valor;
		this.next=next;
	}
	
	public Nodo(E valor){
		this(valor, null);
	}
	
	public Nodo<E> next(){
		return next;
	}
	
	public void setNext(Nodo<E> next){
		this.next=next;
	}
	
	public E valor(){
		return valor;
	}
	
	public void setValor(E valor){
		this.valor = valor;
	}
}
