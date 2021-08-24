package com.company.jmixqsproject.screen.employee;

import io.jmix.ui.screen.*;
import com.company.jmixqsproject.entity.Employee;

@UiController("Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
public class EmployeeBrowse extends StandardLookup<Employee> {
}