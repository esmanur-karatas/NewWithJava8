
public class LambdaExample {

	public static void main(String[] args) {
		CreateNumber createNumber = new CreateNumber() {
			
			@Override 
			public double create() {
				return 15.0;
			}
		};
		
		//lambda kullanılarak sayı ekleme
		CreateNumber create = () ->20.0;
		System.out.println(createNumber.create());
		System.out.println("Lambda Kullanılarak Oluşturulan Sayı: "+ create.create());
		
		Hello hello = () -> "MERHABA";
		System.out.println("Hello Inteface: " +hello.hi());
	
	     
		Hi hi = (s) -> "SELAM" + s;
		System.out.println("PARAMETRELİ İNTERFACE: "+ hi.hi(" Ahmet"));
		
		Topla topla = (x, y) -> x + y;
		System.out.println("İKİ SAYININ TOPLAMI: " +topla.topla(5,8));
	
	
	
	}

}
