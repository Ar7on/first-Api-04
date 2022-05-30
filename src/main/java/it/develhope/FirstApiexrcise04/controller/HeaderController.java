package it.develhope.FirstApiexrcise04.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

@RestController
@RequestMapping(value = "/headers")
public class HeaderController {

    @GetMapping(value = "")
    public String getHeader(@RequestHeader HttpHeaders headers){
        InetSocketAddress host = headers.getHost();
        return "-host: " + host + " -port: " + host.getPort();
    }


}
