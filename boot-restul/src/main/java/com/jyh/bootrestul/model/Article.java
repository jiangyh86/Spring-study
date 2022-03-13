package com.jyh.bootrestul.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author jiangyiheng
 */
@Data
@AllArgsConstructor
@Builder
//@JsonPropertyOrder(value = {"content","title"})
public class Article {
    private Long id;
    //@JsonProperty("writer")
    private String author;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date CreateTime;
    private Date update;
    private List<Reader> readerList;
}
