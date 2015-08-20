//Universidad Del valle de Guatemala 
//Algoritmos y Estructura de Datos 
//Interface de Listas Enlazadas 
//Pedro Joaquin Castillo Coronado 14224
//Freddy José Ruíz  Gatica 14592
//Christopher Antonio Chiroy Miranda 14411
//Boris Alejandro Cifuentes 14150

public interface listaEnlazada<E> {
		public int size();
		public void addFirst(E value);
		public E removeFirst();
		public E removeLast();
		public void addLast(E value);
		public E getFirst();
		public boolean contains (E value);
	}



