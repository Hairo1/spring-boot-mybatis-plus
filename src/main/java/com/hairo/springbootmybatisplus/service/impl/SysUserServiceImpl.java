package com.hairo.springbootmybatisplus.service.impl;

import com.hairo.springbootmybatisplus.entity.SysUser;
import com.hairo.springbootmybatisplus.mapper.SysUserMapper;
import com.hairo.springbootmybatisplus.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hairo
 * @since 2021-09-12
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
