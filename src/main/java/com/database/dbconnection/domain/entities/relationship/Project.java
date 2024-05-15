package com.database.dbconnection.domain.entities.relationship;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "projects")
public class Project {
    @Id
    private Long id;
    private String name;
    private String description;
    private String goal;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employee;
}
