package com.hairo.springbootmybatisplus;

import com.hairo.springbootmybatisplus.entity.SysUser;
import com.hairo.springbootmybatisplus.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {SpringBootMybatisPlusApplication.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class SpringBootMybatisPlusApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void contextLoads() {
        sysUserService.save(SysUser.builder().age(1).password("123456").username("Hairo").userId(1).importTime(LocalDateTime.now().withNano(0)).build());
        List<SysUser> list = sysUserService.lambdaQuery().list();
        list.forEach(o -> log.debug(o.getUsername()));
    }

}
