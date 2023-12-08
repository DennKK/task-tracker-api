package com.boot.task.tracker.api.controllers;

import com.boot.task.tracker.api.factories.ProjectDtoFactory;
import com.boot.task.tracker.store.repositories.ProjectRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Transactional
public class ProjectController {
    private final ProjectDtoFactory projectDtoFactory;
    private final ProjectRepository projectRepository;

    private final String CREATE_PROJECT = "api/projects";
}