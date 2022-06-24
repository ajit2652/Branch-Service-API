
package com.branch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.branch.dao.BranchDao;
import com.branch.entity.Branch;

@Service
public class BranchService_impl implements BranchService {

	@Autowired
	BranchDao dao;

	@Override
	public Branch saveBranch(Branch branch) {
		Branch br = dao.saveBranch(branch);
		if (br != null) {
			return br;
		} else {
			return br;
		}

	}

	@Override
	public Branch getBranchById(Integer branchId) {

		Branch br = dao.getBranchById(branchId);
		if (br != null) {
			return br;
		} else {
			return br;
		}
	}

	@Override
	public List<Branch> getAllBranch() {

		List<Branch> list = dao.getAllBranch();
		if(list!=null) {
			return list;
		}else {
			return null;
		}
		
	}

}
