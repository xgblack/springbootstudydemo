package cn.xgblack.yaml;

/**
 * @author 小光
 * @date 2019/12/1 15:47
 * className: Redis
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Redis {
    private Integer port;
    private String host;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Redis{" +
                "port=" + port +
                ", hosts='" + host + '\'' +
                '}';
    }
}
