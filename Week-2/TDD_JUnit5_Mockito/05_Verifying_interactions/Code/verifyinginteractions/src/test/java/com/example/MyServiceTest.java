package com.example;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteractionWithSpecificArguments() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.sendProcessedData("hello world");

        verify(mockApi).sendData("HELLO WORLD");
    }
}
