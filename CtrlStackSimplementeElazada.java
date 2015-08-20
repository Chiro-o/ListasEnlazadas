import java.util.ArrayList;
import java.util.Vector;


/**
 * @author Christopher Chiroy, Jose Ochoa, Diego de León
 * @category Hoja de Trabajo 2
 * @param <E>
 */
//public class CtrlStack<E> implements ADTStack<E>{

public class CtrlStackSimplementeElazada<E> extends AbstractPilas<E>{
private SimplementeEnlazada<E> list;
	
	public CtrlStackSimplementeElazada(){
		list = new SimplementeEnlazada<E>();
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		while(list.getFirst()!=null)
			list.removeFirst();
		
	}

	@Override
	public void push(E x) {
		// TODO Auto-generated method stub
		list.addFirst(x);
	}

	@Override
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		if(list.size()>0){
			return list.getFirst();
			
		}
			
		return null;
	}

}
