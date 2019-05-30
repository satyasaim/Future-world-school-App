package com.example.futureworldschool.Pojo;

import java.time.Month;

public class MonthsData {

    String months;
    String amount;

    public MonthsData(String months, String amount) {
        this.months = months;
        this.amount = amount;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
