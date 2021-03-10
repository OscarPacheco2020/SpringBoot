package el.com.op;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import el.com.op.model.Producto;
import el.com.op.service.ProductoService;

@SpringBootApplication
public class CrudSeguryApplication  implements CommandLineRunner {

	@Autowired
	ProductoService productoService;
	
	private static Logger LOG = LoggerFactory.getLogger(CrudSeguryApplication.class); 
	
	public static void main(String[] args) {
		SpringApplication.run(CrudSeguryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Prueba de losger");
		Producto producto = new Producto();
		producto.setNombre("Producto 1");
		producto.setPrecio(100);
		productoService.save(producto);
		
		Producto producto2 = new Producto();
		producto2.setNombre("Producto 2");
		producto2.setPrecio(200);
		productoService.save(producto2);
	}

}
