package com.ecommerce.dashboard.controller;

import com.ecommerce.dashboard.model.DashboardData;
import com.ecommerce.dashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/customer")
    public List<DashboardData> getCustomerDashboard() {
        return dashboardService.getCustomerDashboard();
    }

    @GetMapping("/inventory")
    public List<DashboardData> getInventoryDashboard() {
        return dashboardService.getInventoryDashboard();
    }

    @GetMapping("/admin")
    public List<DashboardData> getAdminDashboard() {
        return dashboardService.getAdminDashboard();
    }
}
