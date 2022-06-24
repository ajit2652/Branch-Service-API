package com.branch.dao;

import java.util.List;

import com.branch.entity.Branch;

public interface BranchDao {

	public Branch saveBranch(Branch branch);

	public Branch getBranchById(Integer branchId);

	public List<Branch> getAllBranch();
}
