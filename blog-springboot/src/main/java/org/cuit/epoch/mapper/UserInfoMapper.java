package org.cuit.epoch.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.cuit.epoch.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author: momoka
 * @date: 2023/6/16 17:11
 * @description:
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}