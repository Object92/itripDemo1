package com.bdqn.auth.service;

import javax.mail.MessagingException;

public interface MailService {

    void sendSimpleMail(String to,String subject,String content) throws MessagingException;
}
