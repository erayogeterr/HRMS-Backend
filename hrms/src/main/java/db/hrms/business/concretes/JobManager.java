package db.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import db.hrms.business.abstracts.JobService;
import db.hrms.dataAccess.abstracts.JobDao;
import db.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {
	
	private JobDao jobDao;

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		
		return this.jobDao.findAll();
	}

}
