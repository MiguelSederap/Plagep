package mx.edu.utez.plagep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.plagep.entity.ProductBacklogEntity;

public interface ProductBacklogRepository extends JpaRepository<ProductBacklogEntity, Long> {

}
