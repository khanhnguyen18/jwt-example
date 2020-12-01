package org.jwt.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SmsUserDTO {
    String phone;
    String token;
}
