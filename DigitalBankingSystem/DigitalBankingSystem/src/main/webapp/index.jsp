<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Digital Banking System</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>
    :root {
        --olive: #808000;
        --dark-olive: #556B2F;
        --light-olive: #BDB76B;
        --white: #ffffff;
    }

    body, html {
        margin: 0;
        padding: 0;
        height: 100%;
        scroll-behavior: smooth;
        font-family: Arial, sans-serif;
        background-color: var(--light-olive); /* Light olive background */
        color: var(--dark-olive);
    }

    /* Navigation */
    nav.navbar {
        background-color: var(--dark-olive) !important;
    }

    nav a {
        color: var(--white) !important;
    }

    /* Hero Section */
    .hero-section {
        background-color: var(--olive);
        height: 100vh;
        color: var(--white);
        display: flex;
        flex-direction: column;
        justify-content: center;
        text-align: center;
        position: relative;
    }

    .overlay {
        position: absolute;
        top: 0;
        left: 0;
        height: 100%;
        width: 100%;
        background-color: rgba(0, 0, 0, 0.4);
        z-index: 1;
    }

    .hero-content {
        position: relative;
        z-index: 2;
        padding: 20px;
    }

    .hero-logo {
        max-height: 200px;
        margin-bottom: 30px;
    }

    .description-section {
        padding: 60px 20px;
        background-color: var(--white);
        color: var(--dark-olive);
        text-align: center;
    }

    .floating-boxes {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        padding: 50px 20px;
        background-color: var(--light-olive);
        gap: 30px;
    }

    .box {
        background-color: var(--white);
        border-radius: 10px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        padding: 30px;
        width: 300px;
        transition: all 0.3s ease;
        text-align: center;
        color: var(--dark-olive);
    }

    .box:hover {
        transform: translateY(-5px);
    }

    footer {
        background-color: var(--dark-olive);
        color: var(--white);
        padding: 20px 0;
        text-align: center;
    }

    footer a {
        color: #ddd;
    }
</style>

</head>
<body>

    <!-- Header / Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark">
        <a class="navbar-brand" href="index.jsp">🏦 Bank of FIM - Built for the Future</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                
                <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/bank/signin">Sign In</a></li>
                <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/bank/signup">Sign Up</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/bank/adminLogin">Admin Login</a></li>
            </ul>
        </div>
    </nav>

    <!-- Hero Section -->
    <section class="hero-section">
        <div class="overlay"></div>
        <div class="hero-content">
            <img src="images/Bank-Logo-Background-PNG-Image.png" alt="Bank Logo" class="img-fluid hero-logo">
            <h1 class="display-4">Welcome to FLM Digital Banking System</h1>
            <p class="lead">Your one-stop solution for modern, secure, and convenient banking.</p>
        </div>
    </section>

    <!-- Description Section -->
    <section class="description-section">
        <div class="container">
            <h2>About Our Digital Bank</h2>
            <p>
                Welcome to our Digital Banking System – the future of banking at your fingertips. Our platform offers seamless access to all your financial needs, empowering you to manage accounts, make transactions, and apply for services from the comfort of your home. With a commitment to cutting-edge security, responsive design, and intuitive interfaces, we bring the full power of banking to your screen.
                Our mission is to make banking simpler, faster, and more secure. Whether you're transferring money, applying for loans, or exploring financial tools, our system is built for your convenience. Say goodbye to long queues and paperwork — say hello to digital freedom. Join us today and take control of your financial future.
            </p>
        </div>
    </section>

    <!-- Floating Feature Boxes -->
    <section class="floating-boxes">
        <div class="box">
            <h4>💸 Money Transfer</h4>
            <p>Send and receive money instantly across bank accounts. Our service is fast, secure, and available 24/7.</p>
        </div>
        <div class="box">
            <h4>🏦 Loan Request</h4>
            <p>Need a loan? Apply for personal, home, or business loans with minimal paperwork and quick approval.</p>
        </div>
        <div class="box">
            <h4>🛠️ Banking Services</h4>
            <p>Access digital statements, card services, cheque book requests, and more — all in one place.</p>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <div class="container">
            <p>📧 Contact us: <a href="mailto:bankofflm@flm.com">bankofflm@flm.com</a></p>
            <p>📞 Phone: +91 987 786 123 0</p>
            <p>&copy; 2025 Digital Banking System. All rights reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap JS (Optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
