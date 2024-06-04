package sec02_set.EX02_set.EX02_HashSetMachanism;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			if(this.data ==((B)obj).data)
				return true;
		} 
		return false;
	}
}

class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if(this.data ==((C)obj).data)
				return true;
		} 
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}
}

public class HashSetMachanism {
	public static void main(String[] args) {
		// 1. none
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() + " , " + a2.hashCode());
		hashSet1.add(a1);
		hashSet1.add(a2);
		System.out.println(hashSet1.size());
		System.out.println();
		
		// 2. equals() Overriding
		Set<B> hashSet2 = new HashSet<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println(hashSet2.size());
		System.out.println();
		
		// 3. equals(), hashCode() Overriding
		Set<C> hashSet3 = new HashSet<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + " , " + c2.hashCode());
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());
	}
}
