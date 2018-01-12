
public class runner 
{
	public static void main(String[]args)
	{
	China a= new China();
	a.food();
	
	China b =new Beijing();
	b.food();
	
	China c= new China();
	c.funfacts();
	
	China d= new China();
	System.out.println(d.size);
	
	China e= new China();
	e.food();
	
	Beijing f =new Beijing();
	f.superclasstest();
	
	China g=new China(1500);
	System.out.println("THe area in China is "+g.size+" mi^2");
	
	China h=new Beijing(40);
	System.out.println("The area in Beijing is "+h.size+" mi^2");
	
	//China i =new Beijing();
	//i.superclasstest();
	
	Beijing j= new Beijing();
	j.funfacts();
	
	Beijing k=new Beijing();
	k.language();
	}
	
}
