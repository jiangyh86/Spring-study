package com.jyh.bootrestul.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author jiangyiheng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reader implements Serializable {

    @Serial
    private static final long serialVersionUID = -6313374526776232170L;
    private Integer id;
    private String name;
}
