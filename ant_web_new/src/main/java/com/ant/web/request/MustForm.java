package com.ant.web.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class MustForm extends BaseForm {

    @NotNull
    private String name;

    @NotNull
    private String age;


}
