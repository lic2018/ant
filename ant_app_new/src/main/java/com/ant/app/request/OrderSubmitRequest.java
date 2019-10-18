package com.ant.app.request;

import com.ant.app.entity.Goods;
import com.ant.app.entity.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderSubmitRequest extends Order{

    private List<Goods> goodsList;

}
