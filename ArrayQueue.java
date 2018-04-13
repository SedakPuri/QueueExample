
public class ArrayQueue<E> implements Queue<E>
{

	private E[] queue;
	private int size;
	private int front;
	
	public ArrayQueue(int capacity)
	{
		queue = (E[]) new Object[capacity];
		size = 0;
		front = 0;
	}
	public void enqueue(E v) 
	{
		if(size == queue.length)
		{
			throw new IllegalStateException("queue is full");
		}
		
		queue[(front + size) % queue.length] = v;
		size++;
		
	}

	public E dequeue() 
	{
		if(size == 0)
		{
			throw new IllegalStateException("queue is full");
		}
		E value = queue[front];
		queue[front] = null;
		front = (front + 1) % queue.length;
		
		size--;
		return value;
	}

	@Override
	public E front() {
		if(size == 0)
		{
			throw new IllegalStateException("queue is full");
		}
		return queue[front];
	}

	@Override
	public boolean isEmpty()
	{
		return size == 0;
	}

	@Override
	public int size() 
	{
		return size;
	}
	
	public String toString()
	{
		String r = "";
		for(int i=0; i < size; i++)
		{
			r += queue[(front+i) % queue.length] + " ";
		}
		return r;
	}
	

}
