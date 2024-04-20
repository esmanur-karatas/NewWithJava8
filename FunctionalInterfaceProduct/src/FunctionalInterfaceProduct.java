import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FunctionalInterfaceProduct {

	public static void main(String[] args) {
		Supplier<Product> supplier = new Supplier<Product>() {

			@Override
			public Product get() {
				Product product = new Product(1, "Laptop", 1000);
				return product;
			}
			
		};
		Supplier<Product> supplier1 = ()->new Product(2,"Telefon", 2000);
		
		//birden fazla ürün eklemek için lambda kullanımı
		
		Supplier<List<Product>> supplier2 = () -> {
			List<Product> list = new ArrayList<>();
			list.add(new Product (3, "Akıllı Saat", 2200));
			list.add(new Product (4, "Tablet", 12200));
			list.add(new Product (5, "Masaüstü", 1200));
			list.add(new Product (6, "Kulaklık",30200));
			
			return list;
		};
		System.out.println(supplier.get());
		System.out.println(supplier1.get());
		
		supplier2.get().forEach((u)->System.out.println(u));
	}

}
