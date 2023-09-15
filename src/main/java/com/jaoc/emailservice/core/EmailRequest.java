package com.jaoc.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
    
}
