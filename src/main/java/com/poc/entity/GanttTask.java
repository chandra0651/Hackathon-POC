package com.poc.entity;


import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "gantttasks", type = "gantttask", shards = 1, replicas = 0)
public class GanttTask {

    @Id
    private String id;

    String name;

    String toDependency;

    String fromDependency;

    LocalDate startDate;

    LocalDate endDate;

    int percentage;

    String color;
}
