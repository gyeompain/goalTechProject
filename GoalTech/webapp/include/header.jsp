<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="header">
  <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
    <div class="col-md-3 mb-2 mb-md-0">
      <a href="/" class="d-inline-flex link-body-emphasis text-decoration-none">
        <svg class="bi" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
      </a>
    </div>

    <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
      <li><a href="." class="nav-link px-2 link-secondary">홈</a></li>
      <li><a href="list.do" class="nav-link px-2">예약하기</a></li>
    </ul>

    <div class="col-md-3 text-end">
      <i class="bi bi-calendar-check-fill fs-3" style="vertical-align:middle;"></i>
      <i class="bi bi-person-circle fs-3" style="vertical-align:middle;"></i>
      <a href="login.do" class="btn btn-outline-primary me-2" tabindex="-1" role="button" aria-disabled="true">로그인</a>
      <a href="join.do" class="btn btn-primary" tabindex="-1" role="button" aria-disabled="true">회원가입</a>
    </div>
  </header>
</div>