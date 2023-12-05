package com.boot.task.tracker.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name="project")
@Entity
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique=true)
    private String name;
    @Builder.Default
    private LocalDate createdAt = LocalDate.now();
    private String description;
    @JoinColumn(name = "project_id", referencedColumnName="id")
    @OneToMany
    @Builder.Default
    private List<TaskStateEntity> taskStates = new ArrayList<>();
}