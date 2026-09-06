package com.securebank.controller;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BankController {

 @GetMapping({"/","/login"}) public String login(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  System.out.println(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "login";
 }

 @GetMapping("/register") public String register(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  System.out.println(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "register";
 }
 @GetMapping("/dashboard") public String dashboard(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  System.out.println(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "dashboard";
 }

 @GetMapping("/account") public String account(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute("mycurrentpage",requestURI);
  return "account";
 }

 @GetMapping("/deposit") public String deposit(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "deposit";
 }

 @GetMapping("/withdraw") public String withdraw(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "withdraw";
 }

 @GetMapping("/transfer") public String transfer(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "transfer";
 }

 @GetMapping("/transactions") public String transactions(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "transactions";}
}