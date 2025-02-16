package com.example.itmo.extended.model.dto.response;

import com.example.itmo.extended.model.dto.request.CarInfoRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarInfoResponse extends CarInfoRequest {
    private Long id;
    private UserInfoResponse user;
}
