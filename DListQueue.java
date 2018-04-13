
public class DListQueue<E> implements Queue<E>
{
	private DLList<E> queue;
	
	public void enqueue(E v) 
	{
		queue.insertAtHead(v);
	}

	public E dequeue() 
	{
		return queue.removeTail();
	}

	public E front() 
	{
		return queue.tail();
	}

	public boolean isEmpty() 
	{
		return queue.size() == 0;
	}

	public int size() 
	{
		return queue.size();
	}

}
