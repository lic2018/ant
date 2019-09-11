package com.ant.web.Request;

import com.ant.app.entity.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Author: lic
 * @data: 2019/9/10
 */
@Getter
@Setter
public class LoginRequest extends User {

    @NotNull
    @Pattern(
            regexp = "^\\d{6}$",
            message = "{vcode.invalid}"
    )
    private String securityCode;


}
