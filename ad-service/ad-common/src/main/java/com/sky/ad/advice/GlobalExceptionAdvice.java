package com.sky.ad.advice;

import com.sky.ad.exception.AdException;
import com.sky.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req, AdException ex){
        CommonResponse<String> response = new CommonResponse<>(-1,"bussiness error");
        response.setData(ex.getMessage());
        return response;
    }
}
