package mx.edu.utez.plagep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.plagep.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

}
