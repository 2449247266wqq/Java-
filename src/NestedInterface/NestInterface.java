package NestedInterface;
interface E{
	interface G{
		void f();
	}
	public interface H{
		void f();
	}
	void g();
}
public class NestInterface
{
	public class Bimp implements A.B{
		public void f() {}
	}
	class Cimp implements A.C{
		public void f() {}
	}
	//不能实现一个私有的接口，除非这个接口在这个类里面
	//class Dimp implements A.D{
	//	public void f() {}
	//}
    class Eimp implements E{
    	public void g() {}
    }
    class EGimp implements E.G{
    	public void f() {}
    }
    class Eimp2 implements E{
    	public void g() {}
    	class EG implements E.G{
    		public void f() {}
    	}
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A a = new A();
		//无法访问A.D
		//！A.D ad = a.get(D);
		//! A.Dimp2 ad2=a.getD();
		//! a.getD().f();
		A a2 = new A();
		a2.receive(a.getD());

	}

}
