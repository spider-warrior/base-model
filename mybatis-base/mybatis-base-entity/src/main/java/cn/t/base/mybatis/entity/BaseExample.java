package cn.t.base.mybatis.entity;

public class BaseExample {

    private Integer pageNumber;
    private Integer pageSize;
    private Boolean countSql;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getCountSql() {
        return countSql;
    }

    public void setCountSql(Boolean countSql) {
        this.countSql = countSql;
    }
}
