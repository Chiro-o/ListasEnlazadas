
public class CtrlStackDoblementeEnlazada<E> extends AbstractPilas<E> {
private DoblementeEnlazada<E> list;
	
	public CtrlStackDoblementeEnlazada(){
		list = new DoblementeEnlazada<E>();
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
