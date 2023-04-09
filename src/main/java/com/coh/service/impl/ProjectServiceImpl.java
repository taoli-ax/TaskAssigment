package com.coh.service.impl;

import com.coh.dao.ProjectDao;
import com.coh.pojo.Project;
import com.coh.pojo.ProjectExample;
import com.coh.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao projectDao;
    @Override
    public List<Project> findAll() {

        return projectDao.selectByExample(null);
    }
}
