package com.ann.demo.model;

public record content(

    Integer id,
    String title,
    String description,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime  dateUpdated,
    String url,

) {
    

}
