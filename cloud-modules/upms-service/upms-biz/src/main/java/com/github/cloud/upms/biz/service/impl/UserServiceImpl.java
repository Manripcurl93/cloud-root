package com.github.cloud.upms.biz.service.impl;

import com.github.cloud.upms.api.domain.dto.UserDTO;
import com.github.cloud.upms.biz.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author : czk
 * @date 2018-09-06 15:47
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO queryUser(Long userId) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userId);
        userDTO.setAccount("account");
        userDTO.setPhone("13712345678");
        userDTO.setUserName("userName");
        return userDTO;
    }
}
