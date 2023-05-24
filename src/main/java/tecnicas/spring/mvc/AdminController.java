package tecnicas.spring.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	private ArrayList<Product> productList = new ArrayList<Product>();
	private ArrayList<Product> shoppingCart = new ArrayList<Product>();

	@GetMapping("/products")
    public String showProducts() {
    	return "products";
    }
	
	@GetMapping("/productList")
	public String addProducts(@RequestParam("id") String id,
	                          @RequestParam("name") String name,
	                          @RequestParam("description") String description,
	                          @RequestParam("price") double price,
	                          Model model) {
	    Product product = new Product(id, name, description, price);
	    addProduct(product);
	    
	    StringBuilder sb = new StringBuilder();
	    for (Product p : productList) {
	        sb.append("ID: ").append(p.getId())
	            .append(", Nombre: ").append(p.getName())
	            .append(", Descripción: ").append(p.getDescription())
	            .append(", Precio: ").append(p.getPrice())
	            .append("<br>");
	    }
	    
	    model.addAttribute("productList", sb.toString());
	    
	    return "productList";
	}

	@GetMapping("/eliminated")
    public String showEliminated() {
    	return "eliminated";
    }
	
	@GetMapping("/removeProduct")
	public String removeProduct(@RequestParam("id") String id, Model model) {
	    // Buscar el producto en base al ID en la lista de productos
	    Product selectedProduct = null;
	    for (Product product : productList) {
	        if (product.getId().equals(id)) {
	            selectedProduct = product;
	            break;
	        }
	    }

	    // Eliminar el producto de la lista si se encuentra
	    if (selectedProduct != null) {
	        productList.remove(selectedProduct);
	    }

	    StringBuilder sb = new StringBuilder();
	    for (Product p : productList) {
	        sb.append("ID: ").append(p.getId())
	            .append(", Nombre: ").append(p.getName())
	            .append(", Descripción: ").append(p.getDescription())
	            .append(", Precio: ").append(p.getPrice())
	            .append("<br>");
	    }

	    model.addAttribute("productList", sb.toString());

	    return "productList";
	}

	
	@GetMapping("/productInventory")
	public String showProductList(Model model) {
	    model.addAttribute("productInventory", productList);
	    return "productInventory";
	}
	
	@GetMapping("/addToCart")
	public String addToCart(@RequestParam("id") String id) {
	    // Buscar el producto en base al ID en la lista de productos
	    Product selectedProduct = null;
	    for (Product product : productList) {
	        if (product.getId().equals(id)) {
	            selectedProduct = product;
	            break;
	        }
	    }

	    // Agregar el producto al carrito (ArrayList shoppingCart)
	    if (selectedProduct != null) {
	        shoppingCart.add(selectedProduct);
	    }

	    // Redirigir a la página del carrito
	    return "redirect:/shoppingCart";
	}

	@GetMapping("/shoppingCart")
	public String showShoppingCart(Model model) {
		StringBuilder sb = new StringBuilder();
	    for (Product p : shoppingCart) {
	            sb.append("Nombre: ").append(p.getName())
	            .append(", Precio: ").append(p.getPrice())
	            .append("<br>");
	    }
	    
	    model.addAttribute("shoppingCart", sb.toString());
		return "shoppingCart";
	}
	
	//Metodos de la lista de productos
	public void addProduct(Product product) {
        productList.add(product);
    }
	public void removeProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            productList.remove(index);
        }
	}
}
