
public abstract class AbstractListas<E> implements listaEnlazada<E> {
	
	protected int count;
	
	public AbstractListas(){
		count = 0;
	}
	
	public int size(){
		return count;
	}

}
