package org.cuit.epoch.dto;

import lombok.Data;

import java.util.List;

/**
 * @author: momoka
 * @date: 2023/6/15 21:20
 * @description:
 */
@Data
public class ResourceRoleDTO {

    /**
     * 资源id
     */
    private Integer id;

    /**
     * 路径
     */
    private String url;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 角色名
     */
    private List<String> roleList;

}
