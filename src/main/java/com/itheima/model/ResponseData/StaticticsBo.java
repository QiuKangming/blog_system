package com.itheima.model.ResponseData;

import lombok.Data;
import lombok.ToString;

/**
 * 全站服务统计类
 */
@Data
@ToString
public class StaticticsBo {
    private Integer articles;
    private Integer comments;
}
