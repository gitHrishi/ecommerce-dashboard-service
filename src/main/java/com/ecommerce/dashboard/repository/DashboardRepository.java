package com.ecommerce.dashboard.repository;

import com.ecommerce.dashboard.model.DashboardData;
import java.util.List;

public interface DashboardRepository {
    List<DashboardData> getCustomerDashboard();
    List<DashboardData> getInventoryDashboard();
    List<DashboardData> getAdminDashboard();
}
