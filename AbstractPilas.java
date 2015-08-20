
public abstract class AbstractPilas<E> implements ADTStack<E>{
	//Retorna el tipo de pila que se utilizara
	//Vector, Arraylist o listas enlazadas
		/**
		 *pre: verificar si lista esta vacia
		 *post: true si lista vacia, false si lista llena
		 */
		public boolean isEmpty(){
			if(size()>0)
				return true;
			else
				return false;
		}
}
