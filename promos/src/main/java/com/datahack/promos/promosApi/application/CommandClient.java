package com.datahack.promos.promosApi.application;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommandClient {

    private final CommandServer commandServer;


}
