package com.ecommerce.dashboard.repository.impl;

import com.ecommerce.dashboard.model.DashboardData;
import com.ecommerce.dashboard.repository.DashboardRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DashboardRepositoryImpl implements DashboardRepository {
    @Override
    public List<DashboardData> getCustomerDashboard() {
        // Dummy data
        List<DashboardData> list = new ArrayList<>();
        DashboardData data = new DashboardData();
        data.setField1("Customer1");
        data.setField2("Value2");
        data.setField3("Value3");
        data.setField4("Value4");
        data.setField5("Value5");
        list.add(data);
        return list;
    }
    @Override
    public List<DashboardData> getInventoryDashboard() {
        List<DashboardData> list = new ArrayList<>();
        DashboardData data = new DashboardData();
        data.setField1("Inventory1");
        data.setField2("Value2");
        data.setField3("Value3");
        data.setField4("Value4");
        data.setField5("Value5");
        list.add(data);
        return list;
    }
    @Override
    public List<DashboardData> getAdminDashboard() {
        List<DashboardData> list = new ArrayList<>();
        DashboardData data = new DashboardData();
        data.setField1("Admin1");
        data.setField2("Value2");
        data.setField3("Value3");
        data.setField4("Value4");
        data.setField5("Value5");
        list.add(data);
        return list;
    }
}
