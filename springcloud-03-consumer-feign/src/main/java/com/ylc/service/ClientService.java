package com.ylc.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("application-service")
public interface ClientService extends serviceApi{


}

