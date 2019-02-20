/*
 * Copyright (C) 2019 StarChart-Labs@github.com Authors
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package org.starchartlabs.machete.sns;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.amazonaws.services.lambda.runtime.events.SNSEvent.SNS;
import com.amazonaws.services.lambda.runtime.events.SNSEvent.SNSRecord;

/**
 * Represents common utility operations related to AWS SNS event payloads
 *
 * @author romeara
 * @since 0.1.0
 */
public final class SnsEvents {

    /**
     * Prevent instantiation of utility class
     */
    private SnsEvents() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate instance of utility class '" + getClass().getName() + "'");
    }

    /**
     * Extracts SNS message payload(s) from a received set of SNS messages
     *
     * @param snsEvent
     *            The SNS payload to read from
     * @param toEvent
     *            Function for converting string payload(s) to a meaningful Java representation
     * @param subject
     *            Message subject to filter matches to. May be null to prevent any subject-based filtering
     * @param <T>
     *            Java representation of event to provide
     * @return A collection of converted message payload(s)
     * @since 0.1.0
     */
    public static <T> Collection<T> getMessages(SNSEvent snsEvent, Function<String, T> toEvent, @Nullable String subject) {
        Objects.requireNonNull(snsEvent);
        Objects.requireNonNull(toEvent);

        return snsEvent.getRecords().stream()
                .map(SNSRecord::getSNS)
                .filter(sns -> subject == null || Objects.equals(sns.getSubject(), subject))
                .map(SNS::getMessage)
                .map(toEvent)
                .collect(Collectors.toSet());
    }

}
