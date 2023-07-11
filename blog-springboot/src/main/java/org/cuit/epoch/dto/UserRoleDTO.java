package org.cuit.epoch.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: momoka
 * @date: 2023/6/16 13:55
 * @description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleDTO {

    /**
     * 角色id
     */
    private Integer id;

    /**
     * 角色名
     */
    private String roleName;

}