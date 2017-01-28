
public class MethodCalling {

	public static void main(String[] args) {
/*		
	MethodCalling m = new MethodCalling();
	m.go();
	m.go1();
	m.go2();
		
	}
	
	public void go(){
		
		System.out.println("Inside go method");
		
	}	
	public void go1(){
		System.out.println("Inside go1 method");
	}
	
	public void go2(){
		System.out.println("Inside go2 method");
	}*/

// in other way i can call the methods.

                 MethodCalling m = new MethodCalling();
                    m.go();

	
}

                        public void go(){
	
	             System.out.println("Inside go method");
	                 go1();
}	
                       public void go1(){
	                       System.out.println("Inside go1 method");
	                             go2();
}

                          public void go2(){
	                        System.out.println("Inside go2 method");
	                        
	                        // in other way is too...
	                        

        


                  }
               }
