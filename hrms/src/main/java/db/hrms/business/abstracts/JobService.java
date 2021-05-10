package db.hrms.business.abstracts;

import java.util.List;

import db.hrms.entities.concretes.Job;

public interface JobService {

	List<Job> getAll();
}
