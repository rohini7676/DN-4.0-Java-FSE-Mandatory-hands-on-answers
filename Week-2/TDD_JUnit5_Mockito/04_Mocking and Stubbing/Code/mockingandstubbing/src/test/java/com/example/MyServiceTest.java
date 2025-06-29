package com.example;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testProcessAndSendData_VerifiesInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("mock data");
        MyService service = new MyService(mockApi);
        service.processAndSendData();
        verify(mockApi, times(1)).getData();
        verify(mockApi, times(1)).sendData("MOCK DATA");
    }
}
