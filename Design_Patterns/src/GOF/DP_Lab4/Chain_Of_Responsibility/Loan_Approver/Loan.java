/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab4.Chain_Of_Responsibility.Loan_Approver;

/**
 *
 * @author fa20-bse-017
 */
public class Loan {
    private String number;
    private double amount;
    private String purpose;
    public Loan(String number, double amount, String purpose) {
        this.number = number;
        this.amount = amount;
        this.purpose = purpose;
    }
    public String getNumber() {
        return number;
    }
    public double getAmount() {
        return amount;
    }
    public String getPurpose() {
        return purpose;
    }
    @Override
    public String toString() {
        return "Loan [number=" + number + ", amount=" + amount + ", purpose=" + purpose + "]";
    }

}
