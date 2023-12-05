package com.boot.task.tracker.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskStateDto {
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Long position;
}