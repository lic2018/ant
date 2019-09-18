package com.ant.web.utils;

import com.ant.web.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by sang on 2017/12/30.
 */
public class HrUtils {
    public static User getCurrentHr() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
