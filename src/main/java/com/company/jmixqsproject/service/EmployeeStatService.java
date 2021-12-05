package com.company.jmixqsproject.service;

import com.company.jmixqsproject.entity.CatalogDegree;
import com.company.jmixqsproject.entity.DegreeStat;
import com.company.jmixqsproject.entity.Employee;
import io.jmix.core.DataManager;
import io.jmix.core.entity.KeyValueEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service("employeeStatService")
public class EmployeeStatService {

    @Autowired
    private DataManager dataManager;

    // -----------------------  (начало) Список сотрудников ---------------------------------------
    public List<Employee> getEmployeeListCustom(){
        return dataManager.load(Employee.class).all().list();
    }
    // -----------------------  (конец) Список сотрудников ---------------------------------------

    // -----------------------  (начало) Сотрудник(и) по идентификатору(ам) ---------------------------------------
    public Employee getEmployeeCustom(UUID employeeId){
        return dataManager.load(Employee.class)
                .id(employeeId)
                .one();
    }

    public List<Employee> getEmployeeListIdsCustom(UUID id1, UUID id2) {
        return dataManager.load(Employee.class)
                .ids(id1, id2)
                .list();
    }
    // -----------------------  (начало) Сотрудник(и) по идентификатору(ам) ---------------------------------------

    // -----------------------  (начало) Количество докторов наук, кандидатов наук и неостепененных ---------------------------------------
    public List<DegreeStat> getDegreeStat(){
        List<CatalogDegree> degrees = dataManager.load(CatalogDegree.class).all().fetchPlan("catalogDegree-fetch-plan").list();
        List<DegreeStat> degreeStat = degrees.stream().map(degree -> {
            DegreeStat stat = dataManager.create(DegreeStat.class);
            stat.setDegreeCountId(degree.getId());
            stat.setDegeeName(degree.getName());
            stat.setDegreeCount(getDegreeCount(degree.getId()));
            //stat.setDegreeCount(7);
            return stat;
        }).collect(Collectors.toList());
        return degreeStat;
    }

    public Integer getDegreeCount(UUID degreeID){
        return dataManager.loadValue("SELECT COUNT(e.degree) FROM Employee e WHERE e.degree.id = :degreeID", Integer.class)
                .parameter("degreeID", degreeID)
                .one();
    }
    // -----------------------  (конец) Количество докторов наук, кандидатов наук и неостепененных ---------------------------------------


}
