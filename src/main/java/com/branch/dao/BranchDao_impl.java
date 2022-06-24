package com.branch.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.branch.entity.Branch;
import com.mysql.cj.Session;

@Repository
public class BranchDao_impl implements BranchDao {

	@Autowired
	SessionFactory sf;

	@Override
	public Branch saveBranch(Branch branch) {

		org.hibernate.Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(branch);
			tx.commit();

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

		return branch;
	}

	@Override
	public Branch getBranchById(Integer branchId) {
		Branch branch = null;
		org.hibernate.Session session = sf.openSession();
		try {
			branch = session.get(Branch.class, branchId);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return branch;
	}

	@Override
	public List<Branch> getAllBranch() {

		org.hibernate.Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Branch.class);
		List<Branch> list = criteria.list();
		
		session.close();
		return list;

	}

}
