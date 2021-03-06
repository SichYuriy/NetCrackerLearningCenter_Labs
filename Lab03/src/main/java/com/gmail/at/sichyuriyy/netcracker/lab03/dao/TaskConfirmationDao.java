package com.gmail.at.sichyuriyy.netcracker.lab03.dao;

import com.gmail.at.sichyuriyy.netcracker.lab03.entity.TaskConfirmation;

import java.util.List;

/**
 * Created by Yuriy on 25.01.2017.
 */
public interface TaskConfirmationDao {

    List<TaskConfirmation> findByTaskId(Long id);
    List<TaskConfirmation> findByEmployeeId(Long id);
    TaskConfirmation findByTaskIdAndEmployeeId(Long taskId, Long employeeId);

}
