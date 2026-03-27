package com.aseem.lakesidehotel.service;

import java.util.*;

import com.aseem.lakesidehotel.model.Role;
import com.aseem.lakesidehotel.model.User;


public interface IRoleService {
    List<Role> getRoles();

    Role createRole(Role theRole);

    void deleteRole(Long id);

    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);

    Role removeAllUsersFromRole(Long roleId);
}
