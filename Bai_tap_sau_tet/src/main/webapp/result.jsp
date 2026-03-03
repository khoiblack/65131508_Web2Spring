<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kết quả bài thi</title>
<style>
    body { font-family: Arial, sans-serif; background-color: #f4f7f6; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }
    .result-card { background: white; padding: 40px; border-radius: 10px; box-shadow: 0 4px 15px rgba(0,0,0,0.1); text-align: center; width: 400px; }
    .score-circle { width: 120px; height: 120px; border-radius: 50%; background-color: #2ecc71; color: white; font-size: 36px; font-weight: bold; display: flex; justify-content: center; align-items: center; margin: 0 auto 20px; }
    h2 { color: #333; }
    p.feedback { font-size: 18px; color: #555; margin-bottom: 30px; }
    .btn { text-decoration: none; background-color: #3498db; color: white; padding: 10px 20px; border-radius: 5px; font-weight: bold; transition: 0.3s; }
    .btn:hover { background-color: #2980b9; }
</style>
</head>
<body>

<div class="result-card">
    <h2>Kết Quả Của Bạn</h2>
    
    <div class="score-circle">
        ${diemSo} / ${tongSoCau}
    </div>
    
    <p class="feedback">${nhanXet}</p>
    
    <a href="quiz.html" class="btn">Làm lại bài</a>
</div>

</body>
</html>