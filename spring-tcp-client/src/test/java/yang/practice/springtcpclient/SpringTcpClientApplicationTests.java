package yang.practice.springtcpclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yang.practice.springtcpclient.gateway.TcpClientGateway;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringTcpClientApplicationTests {

    @Autowired
    private TcpClientGateway tcpClientGateway;

    @Test
    public void test() {
        for (int i = 0; i < 5; i++) {
            String serverResponse = tcpClientGateway.send("Test Message " + new Date());
            System.out.println(String.format("### Response %d: %s", i, serverResponse));
            assertNotNull(serverResponse);
        }
    }

    @Test
    void contextLoads() {
    }

}
