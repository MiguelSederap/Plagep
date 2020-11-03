package mx.edu.utez.plagep.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.plagep.entity.ProductBacklogEntity;
import mx.edu.utez.plagep.repository.ProductBacklogRepository;

@RestController
@RequestMapping("/ProductBacklog")
public class ProductBacklogController {
	@Autowired
	private ProductBacklogRepository productBacklogRepository;
	
	@GetMapping
	public List<ProductBacklogEntity> getAllProductBacklog(){
		return productBacklogRepository.findAll();
	}
	
	@PostMapping
	public String saveProductBacklog(@RequestBody ProductBacklogEntity productBacklog) {
		productBacklogRepository.save(productBacklog);
		return "Added Product Backlog";
	}
	
	@PutMapping
	public String updateProductBacklog(@RequestBody ProductBacklogEntity productBacklog) {
		productBacklogRepository.save(productBacklog);
		return "Updated Product Backlog";
	}
}
