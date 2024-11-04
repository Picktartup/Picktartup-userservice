package com.picktartup.userservice.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginRequest {

    @NotBlank(message = "이메일를 입력해주세요.")
    @Size(min = 5, message = "이메일은 5자 이상이어야 합니다.")
    @Schema(description = "이메일", example = "user@example.com")
    private String email;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Size(min = 8, message = "비밀번호는 8자 이상이어야 합니다")
    @Schema(description = "비밀번호", example = "password123")
    private String password;

}

