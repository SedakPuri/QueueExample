
public class Driver {

	public static void main(String[] args) 
	{
		ArrayQueue<Integer> q = new ArrayQueue<>(10);
		
		for(int i=0; i < 10; i++)
		{
			q.enqueue(i);
		}
		
		System.out.println(q);
		
		for(int i=0; i < 5; i++)
		{
			q.dequeue();
		}
		System.out.println(q);
		
		for(int i=0; i < 5; i++)
		{
			q.enqueue(i);
		}
		System.out.println(q);

	}

}
