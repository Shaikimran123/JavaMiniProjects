<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f2f5;
            padding: 20px;
        }
        .signup-container {
            max-width: 400px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        input[type="text"], input[type="email"], input[type="password"], input[type="date"], input[type="tel"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0 20px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 12px;
            width: 100%;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="signup-container">
    <h2>Create an Account</h2>
    <form action="UserSignUp" method="post">
    
        <label for="firstName">First Name</label>
        <input type="text" name="firstName" id="firstName" required>
        
        <label for="lastName">Last Name</label>
        <input type="text" name="lastName" id="lastName" required>

        <label for="email">Email Address</label>
        <input type="email" name="email" id="email" required>

        <label for="phone">Phone Number</label>
        <input type="tel" name="phone" id="phone" pattern="[0-9]{10}" title="Enter 10-digit number" required>

        <label for="password">Password</label>
        <input type="password" name="password" id="password" required 
               pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"
               title="Must contain at least one number, one uppercase and lowercase letter, and at least 6 characters">
		
		<label for="confirmPassword">Confirm Password</label>
        <input type="password" name="CPassword" id="CPassword" required>

        <label for="dob">Date of Birth</label>
        <input type="date" name="dob" id="dob" required>


        <input type="submit" value="Sign Up">
    </form>
</div>

</body>
</html>
