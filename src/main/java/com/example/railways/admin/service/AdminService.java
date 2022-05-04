package com.example.railways.admin.service;

import com.example.railways.admin.model.AdminDetails;

import java.util.ArrayList;

public interface AdminService {

    public AdminDetails createAdmin(AdminDetails admin);

    public ArrayList<AdminDetails> getAdmins();

    public void deleteAdmin(String username);

	public void undeleteAdmin(String adminUsername);

	public AdminDetails adminLogin(AdminDetails admin);
}
