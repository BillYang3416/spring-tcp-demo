package yang.practice.springtcpclient.gateway;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "tcpClientChannel", errorChannel = "tcpClientChannel")
public interface TcpClientGateway {
    String send(String message);
}
