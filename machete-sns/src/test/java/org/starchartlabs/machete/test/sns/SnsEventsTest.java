/*
 * Copyright (C) 2019 StarChart-Labs@github.com Authors
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package org.starchartlabs.machete.test.sns;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

import org.mockito.Mockito;
import org.starchartlabs.machete.sns.SnsEvents;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.amazonaws.services.lambda.runtime.events.SNSEvent.SNS;
import com.amazonaws.services.lambda.runtime.events.SNSEvent.SNSRecord;

public class SnsEventsTest {

    @Test(expectedExceptions = NullPointerException.class)
    public void toMessagesNullSnsEvent() throws Exception {
        SnsEvents.getMessages(null, Function.identity(), "subject");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void toMessagesNulltoEvent() throws Exception {
        SNSEvent snsEvent = Mockito.mock(SNSEvent.class);

        SnsEvents.getMessages(snsEvent, null, "subject");
    }

    @Test
    public void toMessagesNullSubject() throws Exception {
        SNSRecord record1 = createRecordMock("subject1", "message1");
        SNSRecord record2 = createRecordMock("subject2", "message2");

        SNSEvent snsEvent = Mockito.mock(SNSEvent.class);
        Mockito.when(snsEvent.getRecords()).thenReturn(Arrays.asList(record1, record2));

        Collection<String> result = SnsEvents.getMessages(snsEvent, Function.identity(), null);

        Assert.assertNotNull(result);
        Assert.assertEquals(result.size(), 2);
        Assert.assertTrue(result.contains(record1.getSNS().getMessage()));
        Assert.assertTrue(result.contains(record2.getSNS().getMessage()));
    }

    @Test
    public void toMessages() throws Exception {
        SNSRecord record1 = createRecordMock("subject1", "message1");
        SNSRecord record2 = createRecordMock("subject2", "message2");

        SNSEvent snsEvent = Mockito.mock(SNSEvent.class);
        Mockito.when(snsEvent.getRecords()).thenReturn(Arrays.asList(record1, record2));

        Collection<String> result = SnsEvents.getMessages(snsEvent, Function.identity(), record1.getSNS().getSubject());

        Assert.assertNotNull(result);
        Assert.assertEquals(result.size(), 1);
        Assert.assertTrue(result.contains(record1.getSNS().getMessage()));
    }

    private SNSRecord createRecordMock(String subject, String message) {
        SNS sns = Mockito.mock(SNS.class);
        Mockito.when(sns.getSubject()).thenReturn(subject);
        Mockito.when(sns.getMessage()).thenReturn(message);

        SNSRecord record = Mockito.mock(SNSRecord.class);
        Mockito.when(record.getSNS()).thenReturn(sns);

        return record;
    }

}
