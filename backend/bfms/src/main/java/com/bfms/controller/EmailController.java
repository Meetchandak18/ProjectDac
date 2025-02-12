//package com.bfms.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.bfms.service.EmailService;
//import com.bfms.service.SendEmailService;
//
//@RestController
//public class EmailController {
//
//    @Autowired
//    private EmailService sendEmailService;
//
//    @GetMapping("/sendEmail")
//    public String sendEmail() {
//        EmailService.sendEmail("chandak18meet@gmail.com", "This is a test body", "Test Subject");
//        return "Email sent successfully!";
//    }
//}