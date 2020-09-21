package cn.t.base.mybatis.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private LocalDateTime crTime;

    private LocalDateTime upTime;

    public LocalDateTime getCrTime() {
        return crTime;
    }

    public void setCrTime(LocalDateTime crTime) {
        this.crTime = crTime;
    }

    public LocalDateTime getUpTime() {
        return upTime;
    }

    public void setUpTime(LocalDateTime upTime) {
        this.upTime = upTime;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "crTime=" + crTime +
                ", upTime=" + upTime +
                '}';
    }
}
