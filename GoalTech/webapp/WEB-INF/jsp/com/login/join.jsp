<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/include/header.jsp" %>    

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입</title>

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
   <!-- Custom CSS -->
   <link rel="stylesheet" href="\WEB-INF\css\login.css">


</head>

<body>
  <div class="container">
    <div class="input-form-backgroud row">
      <div class="input-form col-md-12 mx-auto">
        <h4 class="mb-3">회원가입</h4>
        <form class="validation-form" novalidate action="insertMember.do" method="post">

            <div class="mb-3">
              <label for="user_id">아이디</label>
              <input type="text" class="form-control" id="user_id" name="user_id" placeholder="" value="" required>
              <div class="invalid-feedback">
                아이디를 입력해주세요.
              </div>
            </div>

          <div class="mb-3">
            <label for="user_name">이름</label>
            <input type="text" class="form-control" id="user_name" name="user_name" placeholder="홍길동" required>
            <div class="invalid-feedback">
              이름을 입력해주세요.
            </div>
          </div>

          <div class="mb-3">
            <label for="user_pw">비밀번호</label>
            <input type="password" class="form-control" id="user_pw" name="user_pw" required>
            <div class="invalid-feedback">
              비밀번호를 입력해주세요.
            </div>
          </div>

          <div class="mb-3">
            <label for="user_pw_confirm">비밀번호<span class="text-muted">&nbsp;(확인)</span></label>
            <input type="password" class="form-control" id="user_pw_confirm" name="user_pw_confirm" placeholder="비밀번호를 다시 입력해주세요." required>
            <div class="invalid-feedback">
              비밀번호 확인을 입력해주세요.
            </div>
          </div>

          <div class="mb-3">
            <label for="user_phone">연락처</label>
            <input type="text" class="form-control" id="user_phone" name="user_phone" placeholder="010-1234-5678" required>
            <div class="invalid-feedback">
                연락처를 입력해주세요.
            </div>
          </div>

          <hr class="mb-4">
          <div class="custom-control custom-checkbox">
            <input type="checkbox" class="custom-control-input" id="aggrement" required>
            <label class="custom-control-label" for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>
          </div>
          <div class="mb-4"></div>
          <button class="btn btn-primary btn-lg btn-block" type="submit">가입 완료</button>
        </form>
      </div>
    </div>
    <footer class="my-3 text-center text-small">
      <p class="mb-1">&copy; GoalTech</p>
    </footer>
  </div>
  <script>
    window.addEventListener('load', () => {
      const forms = document.getElementsByClassName('validation-form');

      Array.prototype.filter.call(forms, (form) => {
        form.addEventListener('submit', function (event) {
          if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
          }

          form.classList.add('was-validated');
        }, false);
      });
    }, false);
  </script>
</body>

</html>