package com.yanzhen.util;

import lombok.Data;

import java.util.List;
@Data
public class JsonObject<T> {
    private int code;
    private String msg;
    private Long count;
    private List<T> data;
}
