package com.yanzhen.po;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 树结构节点
 */

@Data
public class Node implements Serializable {
    private Integer id;
    private Integer parentId;
    private String title;
    private List<Node> children;
    private Boolean checked;

}
