package com.avob.openadr.model.oadr20b.builders;

import com.avob.openadr.model.oadr20b.builders.eiopt.*;
import com.avob.openadr.model.oadr20b.ei.OptReasonEnumeratedType;
import com.avob.openadr.model.oadr20b.ei.OptTypeType;
import com.avob.openadr.model.oadr20b.xcal.VavailabilityType;

public class Oadr20bEiOptBuilders {

    private Oadr20bEiOptBuilders() {
    }

    public static Oadr20bCanceledOptBuilder newOadr20bCanceledOptBuilder(String requestId, int responseCode,
            String optId) {
        return new Oadr20bCanceledOptBuilder(requestId, responseCode, optId)
                .withSchemaVersion("2.0b");
    }

    public static Oadr20bCancelOptBuilder newOadr20bCancelOptBuilder(String requestId, String optId, String venId) {
        return new Oadr20bCancelOptBuilder(requestId, optId, venId)
                .withSchemaVersion("2.0b");
    }

    public static Oadr20bCreatedOptBuilder newOadr20bCreatedOptBuilder(String requestId, int responseCode,
            String optId) {
        return new Oadr20bCreatedOptBuilder(requestId, responseCode, optId)
                .withSchemaVersion("2.0b");
    }

    public static Oadr20bCreateOptBuilder newOadr20bCreateOptBuilder(String requestId, String venId,
            Long createdDatetime, String eventId, long modificationNumber, String optId, OptTypeType optType,
            OptReasonEnumeratedType optReason) {
        return new Oadr20bCreateOptBuilder(requestId, venId, createdDatetime, eventId, modificationNumber, optId,
                optType, optReason).withSchemaVersion("2.0b");
    }

    public static Oadr20bCreateOptBuilder newOadr20bCreateOptBuilder(String requestId, String venId,
            Long createdDatetime, VavailabilityType vavailabilityType, String optId, OptTypeType optType,
            OptReasonEnumeratedType optReason) {
        return new Oadr20bCreateOptBuilder(requestId, venId, createdDatetime, vavailabilityType, optId, optType,
                optReason).withSchemaVersion("2.0b");
    }

    public static Oadr20bVavailabilityBuilder newOadr20bVavailabilityBuilder() {
        return new Oadr20bVavailabilityBuilder();
    }
}
