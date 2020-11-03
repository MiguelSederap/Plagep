package mx.edu.utez.plagep.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.plagep.entity.ProjectEntity;
import mx.edu.utez.plagep.repository.ProjectRepository;

@RestController
@RequestMapping("/Project")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping
	public List<ProjectEntity> getAllProject(){
		return projectRepository.findAll();
	}
	
	@PostMapping
	public String saveProject(@RequestBody ProjectEntity project) {
		projectRepository.save(project);
		return "Added Project";
	}
	
	@PutMapping
	public String updateProject(@RequestBody ProjectEntity project) {
		projectRepository.save(project);
		return "Updated Project";
	}
}
