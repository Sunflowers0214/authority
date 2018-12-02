package com.flysnow.common;

import java.util.List;

public class Page {

    private int pageNo;//当前页数
    private int pageSize;//页显示数量
    private int beginRow;//查询起始行
    private int totalRows;//总记录数
    private int totalPages;//总页数
    private List datalist;//查询结果


    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getBeginRow() {
        return beginRow;
    }

    public void setBeginRow(int beginRow) {
        this.beginRow = beginRow;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List getDatalist() {
        return datalist;
    }

    public void setDatalist(List datalist) {
        this.datalist = datalist;
    }
}
