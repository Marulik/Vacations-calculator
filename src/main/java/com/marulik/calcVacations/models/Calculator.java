package com.marulik.calcVacations.models;

public class Calculator {
    private int vacationDays, workPay;
    private String operation;

    public Calculator() {}


    public Calculator(String operation) {
        this.operation = operation;
    }

    public Calculator(int vacationDays, int workPay) {
        this.vacationDays = vacationDays;
        this.workPay = workPay;
     }

    public int getVacationDays() {
        return vacationDays;
    }

    public int getWorkPay() {
        return workPay;
    }


    public String getOperation() {
        return operation;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public void setWorkPay(int workPay) {
        this.workPay = workPay;
    }


    public void setOperation(String operation) {
        this.operation = operation;
    }
}
