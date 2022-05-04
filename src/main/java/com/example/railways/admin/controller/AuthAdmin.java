package com.example.railways.admin.controller;

import com.example.railways.admin.model.AdminDetails;
import com.example.railways.admin.response.AdminDetailsResponse;
import com.example.railways.admin.response.AdminLoginResponse;
import com.example.railways.admin.service.AdminService;

import com.example.railways.utils.Validations;

import java.util.ArrayList;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class AuthAdmin {

    @Autowired
    AdminService adminService;

    
    @Autowired
    Validations validation;
    
    @PostMapping("createAdmin")
    public ResponseEntity<Object> createAdmin(@RequestBody AdminDetails admin){
    	
    validation.adminValidation(admin);	
   return new ResponseEntity<Object>( new AdminDetailsResponse(new Date(),"Admin added Successfully",adminService.createAdmin(admin)),HttpStatus.OK);
   
    
   }
    

    @GetMapping("viewAdmins")
    public ArrayList<AdminDetails> getAdmin() {
        return adminService.getAdmins();

    }


    @PostMapping("deleteAdmin")
    public String deleteAdmin(@RequestBody AdminDetails admin){
    	
    	 adminService.deleteAdmin(admin.getAdminUsername());
    	 return "Deleted Successfully";
    	 	
    }
    
    
    @PostMapping("undeleteAdmin")
    public String undeleteAdmin(@RequestBody AdminDetails admin){
    	
    	 adminService.undeleteAdmin(admin.getAdminUsername());
    	 
    	 return "Undeleted Successfully";
    	 	
    }
    
    @PostMapping("adminLogin")
    public ResponseEntity<Object> adminLogin(@RequestBody AdminDetails admin)
    {
    	validation.adminValidation(admin);
    	 AdminDetails fetchAdmin = adminService.adminLogin(admin);
    	 AdminLoginResponse res = new AdminLoginResponse(new Date(),"Log In Successfull",admin);

   	 return new  ResponseEntity<Object>(res,HttpStatus.OK);

    }

    }







