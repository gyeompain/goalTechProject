<!-- Footer-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<footer class="bg-black text-center py-5">
	<div class="container px-5">
		<div class="text-white-50 small">
			<div class="mb-2">&copy; GoalTech 2024. All Rights Reserved.</div>
			<a href="#!">Privacy</a> <span class="mx-1">&middot;</span> <a
				href="#!">Terms</a> <span class="mx-1">&middot;</span> <a href="#!">FAQ</a>
		</div>
	</div>
</footer>
<!-- Feedback Modal-->
<div class="modal fade" id="feedbackModal" tabindex="-1"
	aria-labelledby="feedbackModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<div class="modal-header bg-gradient-primary-to-secondary p-4">
				<h5 class="modal-title font-alt text-white" id="feedbackModalLabel">Login</h5>
				<button class="btn-close btn-close-white" type="button"
					data-bs-dismiss="modal" aria-label="Close"></button>
			</div>
			<div class="modal-body border-0 p-4">
				<form id="contactForm" action="login_proc.do" method="post">

					<!-- Email address input-->
					<div class="form-floating mb-3">
						<input class="form-control" id="email" type="email" name="user_id"
							placeholder="name@example.com"
							data-sb-validations="required,email" /> <label for="email">이메일</label>
						<div class="invalid-feedback" data-sb-feedback="email:required">이메일을
							입력해주세요.</div>
						<div class="invalid-feedback" data-sb-feedback="email:email">이메일
							타입이 아닙니다.</div>
					</div>
					<!-- Phone number input-->
					<div class="form-floating mb-3">
						<input class="form-control" id="phone" name="user_pw"
							type="password" placeholder="password"
							data-sb-validations="required" /> <label for="phone">비밀번호</label>
						<div class="invalid-feedback" data-sb-feedback="phone:required">A
							비밀번호를 입력해주세요.</div>
					</div>

					<!-- Submit success message-->
					<!---->
					<!-- This is what your users will see when the form-->
					<!-- has successfully submitted-->
					<div class="d-none" id="submitSuccessMessage">
						<div class="text-center mb-3">
							<div class="fw-bolder">Form submission successful!</div>
							To activate this form, sign up at <br /> <a
								href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
						</div>
					</div>
					<!-- Submit Button-->
					<div class="d-grid">
						<button class="btn btn-primary rounded-pill btn-lg"
							id="submitButton" type="submit">Login</button>
					</div>
					<br>
					<div class="d-grid">
						<button class="btn btn-primary rounded-pill btn-lg" onclick="join.do"
							id="submitButton" type="button">Join</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<!-- Bootstrap core JS-->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="./static/js/scripts.js"></script>
]
<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>
