package com.lancoder.buildupload.controller;

import com.lancoder.buildupload.entity.Employee;
import com.lancoder.buildupload.exception.ResourceNotFoundException;
import com.lancoder.buildupload.repository.EmployeeRepository;
import com.lancoder.buildupload.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @project: build-upload
 * @author: wangchengda
 * @email: wangchengda1990@gmail.com
 * @date: 2019-07-05
 * @Description:
 * @Copyright: 2019 broderickwang.github.io Inc. All rights reserved.
 * @version: V1.0
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RecordRepository recordRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/addr")
    public List<Employee> getEmloyeesByAddr(){
        return employeeRepository.findByEmailAddress("%chengda%");
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("/test")
    public List<RecordRepository.WorkerAttendanceDTO> test(){
        /*List<Object> objects = recordRepository.getAllRecord(5);

        List<WorkerAttendanceDTO> rst = new ArrayList<>();
        objects.forEach(new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                Object[] os = (Object[]) o;

                WorkerAttendanceDTO dto = new WorkerAttendanceDTO(String.valueOf(os[0]),String.valueOf(os[1])
                        ,String.valueOf(os[2]),String.valueOf(os[3]));
                rst.add(dto);
            }
        });

        return rst;*/
        return recordRepository.findAllWorkers(5);
    }
}
