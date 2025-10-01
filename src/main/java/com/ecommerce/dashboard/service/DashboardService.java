package com.ecommerce.dashboard.service;

import com.ecommerce.dashboard.model.DashboardData;
import com.ecommerce.dashboard.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DashboardService {
    @Autowired
    private DashboardRepository dashboardRepository;

    public List<DashboardData> getCustomerDashboard() {
        return dashboardRepository.getCustomerDashboard();
    }
    public List<DashboardData> getInventoryDashboard() {
        return dashboardRepository.getInventoryDashboard();
    }
    public List<DashboardData> getAdminDashboard() {
        return dashboardRepository.getAdminDashboard();
    }
}
