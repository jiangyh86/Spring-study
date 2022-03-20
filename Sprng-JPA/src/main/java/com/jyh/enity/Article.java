package com.jyh.enity;

import com.jyh.Listener.DataBaseAudListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author jiangyiheng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
//@EntityListeners(DataBaseAudListener.class)
public class Article implements Serializable {

    @Serial
    private static final long serialVersionUID = 954751525905604339L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String title;
    private String content;
    @Column(name = "create_time",updatable = false)
    private Date createTime;
    private  Date updateTime;

}
