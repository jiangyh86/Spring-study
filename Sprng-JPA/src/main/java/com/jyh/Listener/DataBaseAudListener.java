package com.jyh.Listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author jiangyiheng
 */
@Component
@Slf4j
public class DataBaseAudListener {
    /**
     * 新增数据时，填充创建时间
     */
    @PrePersist
    public void prePersist(Object object) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass =object.getClass();
            //填充创建时间
        try {
            addOperateTime(object,aClass, "creatTime");
        } catch (NoSuchFieldException e) {
            log.error("反射属性获取异常：",e);
        }
    }

    @PreUpdate
    public void preUpdate(Object object) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass =object.getClass();
        try {
            addOperateTime(object,aClass, "updateTime");
        }  catch (NoSuchFieldException e) {
            log.error("反射属性获取异常：",e);
        }
    }

   protected void  addOperateTime(Object object,Class<?> aClass ,String propertyName) throws IllegalAccessException, NoSuchFieldException {
        Field time=aClass.getDeclaredField(propertyName);
        time.setAccessible(true);
        //获取time值
       Object createTimeValue = time.get(object);
       if (createTimeValue==null) {
           //使用当前时间填充
           time.set(object,new Date());
       }
   }
    /**
     * 新增数据后操作
     */
    @PostPersist
    public void postPersist(Object o)throws NoSuchFieldException, IllegalAccessException{

    }
    /**
     * 更新数据之后操作
     */
    @PostUpdate
    public void postUpdate(Object o)throws NoSuchFieldException, IllegalAccessException{

    }

}
