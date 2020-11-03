package mx.edu.utez.plagep.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "projectScrum")
public class ProjectEntity {
	@Id
	@Column(name = "idProjectScrum")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "startdate")
	private Date startDate;
	@Column(name = "finishdate")
	private Date finishDate;
	@Column(name = "statusdate")
	private Date statusDate;
	@Column(name = "status")
	private String status;
	private int idProductOwner;
	private int idScrumMaster;

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public int getIdProductOwner() {
		return idProductOwner;
	}

	public void setIdProductOwner(int idProductOwner) {
		this.idProductOwner = idProductOwner;
	}

	public int getIdScrumMaster() {
		return idScrumMaster;
	}

	public void setIdScrumMaster(int idScrumMaster) {
		this.idScrumMaster = idScrumMaster;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
