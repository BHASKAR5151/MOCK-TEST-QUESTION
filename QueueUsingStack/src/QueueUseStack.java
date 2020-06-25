import java.util.*; 
  
class QueueUseStack 
{  
    static Stack<Integer> stack1 = new Stack<Integer>();  
    static Stack<Integer> stack2 = new Stack<Integer>();  
  
    static void enQueue(int x)  
    {  
        while (!stack1.isEmpty()) 
        {  
            stack2.push(stack1.pop());  
        }  
        stack1.push(x);  
  
        while (!stack2.isEmpty())  
        {  
            stack1.push(stack2.pop());  
        }  
    }  
  
    static int deQueue()  
    {  
        if (stack1.isEmpty())  
        {  
            System.out.println("Q is Empty");  
            System.exit(0);  
        }  
        return stack1.pop();  
    }  

  
public static void main(String[] args)  
{  
	QueueUseStack q = new QueueUseStack();  
    q.enQueue(9);  
    q.enQueue(8);  
    q.enQueue(6);  
    q.enQueue(4);
    System.out.println(q.deQueue());  
    System.out.println(q.deQueue()); 
    System.out.println(q.deQueue()); 
}  
}  