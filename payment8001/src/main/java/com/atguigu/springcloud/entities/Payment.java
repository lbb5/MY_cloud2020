package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author libingbing
 * @Date 2020-05-10 22:51
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{

    private Long id;
    private String serial;

}
