package com.example.invoice;
public class InvoiceCalculator{
    public double calculatePA(double price,int quantity){
        return price*quantity;
    }
    public double calculateDA(double amount){
        if(amount>=5000){
            return amount*0.10;
        }else if(amount>=2000){
            return amount*0.05;
        }
        return 0;
    }
    public double calculateGST(double amount){
        return amount*0.18;
    }
    public double calculateFA(double amount){
        double discount=calculateDA(amount);
        double DA=amount-discount;
        double gst=calculateGST(DA);
        return DA+gst;
    }
}