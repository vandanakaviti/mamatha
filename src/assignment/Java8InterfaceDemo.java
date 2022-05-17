package assignment;

@FunctionalInterface
public interface Java8InterfaceDemo {
//	Body can be added to methods if used default keyword in
//	Java 1.8 and above but not in Java 1.7 in and below
	default void add() {
		
	}
	
//	static methods are supported 
	static void sub() {
		
	}
	
	void mult();
//	void divide();
//	void modulo();
}
