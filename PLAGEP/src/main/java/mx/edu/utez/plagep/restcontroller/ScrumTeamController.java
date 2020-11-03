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
import mx.edu.utez.plagep.entity.ScrumTeamEntity;
import mx.edu.utez.plagep.repository.ProjectRepository;
import mx.edu.utez.plagep.repository.ScrumTeamRepository;

@RestController
@RequestMapping("/ScrumTeam")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class ScrumTeamController {
	@Autowired
	private ScrumTeamRepository scrumTeamRepository;
	
		@GetMapping
		public List<ScrumTeamEntity> getScrumTeamList(){
			return scrumTeamRepository.findAll();
		}
		
		@PostMapping
		public String saveScrumTeam(@RequestBody ScrumTeamEntity scrumTeam){
			scrumTeamRepository.save(scrumTeam);
			return "Added Scrum Team";
		}
		@PutMapping
		public String updateScrumTeam(@RequestBody ScrumTeamEntity scrumTeam) {
			scrumTeamRepository.save(scrumTeam);
			return "Updated Scrum Team";
		}
}
