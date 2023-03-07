

package tubitak_yte.student_management_system.security.controller;

        import lombok.RequiredArgsConstructor;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;
        import tubitak_yte.student_management_system.security.service.LoginService;

        import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class LoginController {

        private final LoginService loginService;

        @PostMapping("/login")
        public String login(@RequestBody @Valid LoginRequest loginRequest) {
                return loginService.login(loginRequest);
        }}
