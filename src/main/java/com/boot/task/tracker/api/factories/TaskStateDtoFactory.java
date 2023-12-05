package com.boot.task.tracker.api.factories;

import com.boot.task.tracker.api.dto.TaskStateDto;
import com.boot.task.tracker.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {
    TaskStateDto makeTaskStateDto(TaskStateEntity entity) {
        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .position(entity.getPosition())
                .build();
    }
}