package com.hook.emp.service;

import com.hook.emp.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", name = "DEPARTMENT-SERVICE")
public interface APIClient {

  @GetMapping("api/departments/{department-code}")
  ResponseEntity<DepartmentDto> getDepartment(
      @PathVariable("department-code") String departmentCode);

}