<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <title>OTP Verification</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: #fff;
            padding: 30px 40px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 350px;
        }

        h2 {
            color: #333;
            margin-bottom: 20px;
        }

        p {
            font-size: 16px;
            color: #555;
        }

        .btn {
            background-color: #007bff;
            color: white;
            padding: 10px 18px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 15px;
            margin-top: 15px;
        }

        .btn:disabled {
            background-color: #7da3cc;
            cursor: not-allowed;
        }

        input[type="text"] {
            padding: 10px;
            width: 90%;
            margin: 15px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 14px;
        }

        input[type="submit"] {
            background-color: #28a745;
            color: white;
            padding: 10px 18px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 15px;
        }

        #otpSection {
            display: none;
        }

        #otpMessage {
            color: green;
            font-size: 14px;
            margin-top: 10px;
            display: none;
        }
    </style>

    <script>
        function showOtpField() {
            // Disable button
            document.getElementById("sendBtn").disabled = true;

            // Show OTP section
            document.getElementById("otpSection").style.display = "block";

            // Show inline message
            document.getElementById("otpMessage").style.display = "block";
        }
    </script>
</head>
<body>
    <div class="container">
        <h2>OTP Verification</h2>

        <p>Email: <strong>${sessionScope.userEmail}</strong></p>

        <button id="sendBtn" class="btn" onclick="showOtpField()">Send OTP</button>

        <div id="otpMessage">OTP has been sent to your email.</div>

        <div id="otpSection">
            <form action="verifyOtp" method="get">
                <input type="text" name="otp" required placeholder="Enter OTP">
                <br>
                <input type="submit" value="Verify">
            </form>
        </div>
    </div>
</body>
</html>
