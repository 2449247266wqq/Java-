package NestedInterface;

public class A
{
	// 声明一个接口B
	interface B
	{
		void f();
	}

	// 公有类Bimp实现接口B
	public class Bimp implements B
	{
		public void f()
		{
		}
	}

	// 私有类Bimp2实现接口B
	private class Bimp2 implements B
	{
		public void f()
		{
		}
	}

	// 定义接口C
	public interface C
	{
		void f();
	}

	class Cimp implements C
	{
		public void f()
		{
		}
	}

	private class Cimp2 implements C
	{
		public void f()
		{
		}
	}
	//定义一个私有接口D
	private interface D
	{
		void f();
	}

	private class Dimp implements D
	{
		public void f()
		{
		}
	}
	

	// 私有类Bimp2实现接口B
	private class Dimp2 implements D
	{
		public void f()
		{
		}
	}
	public D getD(){return new Dimp2();}
	private D dRef;
	public void receive(D d) {
		dRef=d;
		dRef.f();
	}
}
