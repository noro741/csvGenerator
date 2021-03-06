package com.csvConvert.company.test;

import net.sf.jsefa.csv.annotation.CsvDataType;
import net.sf.jsefa.csv.annotation.CsvField;

import java.io.Serializable;


@CsvDataType(defaultPrefix = "TC2")
public class TestClass2 implements Serializable {

private static final long serialVersionUID = 371968159365574089L;

@CsvField(pos = 3)
private int orderno;

@CsvField(pos = 4)
private String orderName;

// getter setter methods


    public TestClass2() {
    }

    public TestClass2(int orderno, String orderName) {
        this.orderno = orderno;
        this.orderName = orderName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getOrderno() {
        return orderno;
    }

    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}