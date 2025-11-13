package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.modal.User;
import com.services.UserServices;

import jakarta.servlet.http.HttpSession;

@RestController
public class Controller {

	@Autowired
	private UserServices userServices;
	
	@GetMapping("adminLogin")
	public String adminLogin(){
		return "adminLogin";
	}

	@PostMapping("/adminLogin")
	public String handleAdmin(
			    @RequestParam("AdminMail") String adminMail,
	            @RequestParam("password") String password){
		  if ("admin@gmail.com".equals(adminMail) && "admin123".equals(password)) {
	            return "adminDashboard";
	        } else {
	            return "adminLogin";
	         }
	}

	@GetMapping("signup")
	public String signUP(){
		return "signup";
	}

	@PostMapping("/UserSignUp")
	public String handleUserSignUp(
	        @RequestParam("firstName") String firstName,
	        @RequestParam("lastName") String lastName,
	        @RequestParam("email") String email,
	        @RequestParam("phone") String phone,
	        @RequestParam("password") String password,
	        @RequestParam("CPassword") String confirmPassword,
	        @RequestParam("dob") String dob,
	        HttpSession session,
	        RedirectAttributes redirectAttributes
	) {
	    if (!password.equals(confirmPassword)) {
	        redirectAttributes.addFlashAttribute("error", "Passwords do not match.");
	        return "redirect:/signup";
	    }

	    // Create User object
	    User user = new User();
	    user.setFirstName(firstName);
	    user.setLastName(lastName);
	    user.setEmail(email);
	    user.setPhone(phone);
	    user.setPassword(password);
	    user.setDob(dob);

	    // Save to DB
	    userServices.saveUser(user);

	    // Set session attributes (optional)
	    session.setAttribute("userEmail", email);
	    session.setAttribute("userPhone", phone);

	    return "sendOtp";
	}


	 @GetMapping("/sendOtp")
	 public String showOtpPage() {
	     return "sendOtp";
	 }

	 @GetMapping("/verifyOtp")
	 public String showOtpConfirmation() {
	     return "otpSuccess";  // This is the name of your JSP page
	 }


	 @GetMapping("/signin")
	 public String showUserLoginPage() {
	     return "signin";
	 }

	 @PostMapping("/signin")
	 public String handleUserLogin(
	         @RequestParam("email") String email,
	         @RequestParam("password") String password,
	         HttpSession session,
	         RedirectAttributes redirectAttributes
	 ) {
	     // Example hardcoded check — replace with real DB logic
	     if ("user@gmail.com".equals(email) && "user123".equals(password)) {
	         session.setAttribute("loggedInUser", email);
	         return "userDashboard";  // Go to user dashboard JSP
	     } else {
	         redirectAttributes.addFlashAttribute("error", "Invalid email or password.");
	         return "redirect:/signin";
	     }
	 }



}
