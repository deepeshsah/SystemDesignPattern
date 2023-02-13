package com.design.pattern.AdapterDesignPattern.Client;

import com.design.pattern.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import com.design.pattern.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import com.design.pattern.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
