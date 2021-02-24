import java.util.Scanner;
class MyNode 
{
	int data;
	MyNode next;
}
class CircularLinkedList
{
	Scanner s=new Scanner(System.in);
	MyNode head;
	CircularLinkedList()
	{
		head=null;
	}
	void create(int n)
	{
		MyNode temp,last=null;
		for(int i=0;i<n;i++)
		{
			temp=new MyNode();
			temp.data=s.nextInt();
			if(head==null)
			{
				head=last=temp;
				head.next=head;
			}
			else
			{
				last.next=temp;
				temp.next=head;
				last=temp;
			}
		}
	}
void display()
	{
		MyNode temp;
		for(temp=head;temp.next!=head;temp=temp.next)
				System.out.print(temp.data+"->");
		System.out.println(temp.data);
	}
}
class CircularLinkedListDemo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		CircularLinkedList c=new CircularLinkedList();
		c.create(s.nextInt());
		c.display();
	}
}