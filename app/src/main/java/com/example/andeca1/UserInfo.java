package com.example.andeca1;

public class UserInfo {

    private int income;
    private int expense;
    private int Monthlytotal;
    private String date;
    private String category;

    public UserInfo() {

    }

    public UserInfo(int income, int expense, String date, String category) {
        this.income = income;
        this.expense = expense;
        this.date = date;
        this.category = category;
    }

    public int getIncome() {
        return this.income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getExpense() {
        return this.expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public String date() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getMonthlytotal() {
        return Monthlytotal;
    }

    public void setMonthlytotal(int monthlytotal) {
        Monthlytotal = monthlytotal;
    }
}
