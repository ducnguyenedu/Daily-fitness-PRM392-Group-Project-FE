package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.repository;

import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.dto.LoginDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAuthRepository {
    @POST("auth/login")
    Call<LoginDto> login(@Body LoginDto loginDto);
}