package com.learn.java.basic.logic;

import com.learn.java.basic.entity.Appliance;

import java.util.ArrayList;
import java.util.List;

public class ApplianceLogic {

    private List<Appliance> appliances;

    public ApplianceLogic() {
        appliances = new ArrayList<Appliance>();
    }

    public ApplianceLogic(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public List<Appliance> searchByPrice(double minPrice, double maxPrice) {
        List<Appliance> appliancesResult = new ArrayList<Appliance>();
        for (Appliance appliance : appliances) {
            if (appliance.getPrice() >= minPrice && appliance.getPrice() <= maxPrice) {
                appliancesResult.add(appliance);
            }
        }
        return appliancesResult;
    }
}
