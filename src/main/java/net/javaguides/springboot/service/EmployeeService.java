package net.javaguides.springboot.service;

import net.javaguides.springboot.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<User> getAllEmployees();
    void saveEmployee(User employee);
    User getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}