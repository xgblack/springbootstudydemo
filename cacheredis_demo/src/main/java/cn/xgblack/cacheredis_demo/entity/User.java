package cn.xgblack.cacheredis_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xg BLACK
 * @date 2019/12/10 10:04
 * description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;;
    private String username;
    private String address;
}
