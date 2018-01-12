
public class Beijing extends China
{
	protected int size=6490;
	public Beijing()
	{
	System.out.println("Beijing is the capital city of China.");
	}
	public Beijing(int population)
	{
		System.out.println("We have "+ population +" millions people in Beijing.");
	}
	public void food()
	{
		System.out.println("ZhaJiangMian is the most famous dish in Beijing.");
	}
	public void language()
	{
		System.out.println("Beijing people have their unique dialects.");
	}
	public void superclasstest()
	{
		System.out.println(super.size);
		System.out.println(size);
	}
}
