<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account Activation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
            max-width: 600px;
            text-align: center;
        }

        h2 {
            color: #2c3e50;
        }

        p {
            color: #34495e;
            font-size: 16px;
            line-height: 1.6;
        }

        .home-link {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 25px;
            background-color: #2c3e50;
            color: #ffffff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .home-link:hover {
            background-color: #1abc9c;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Thank You for Reaching the Bank of FLM</h2>
    <p>
        Thank you for registering with the Bank of FLM. Your details have been successfully received and verified.
        Within the next 24 hours, your account will be activated by our verification team. Once activated, you will be
        able to access all our services including online banking, money transfers, and more. We’re excited to have you
        as a part of our banking family. For any queries, please feel free to contact our support team. Welcome to
        FLM!
    </p>

    <!-- Home Page Link -->
    <a href="${pageContext.request.contextPath}/index.jsp" class="home-link">Go to Home Page</a>
    
</div>
</body>
</html>
