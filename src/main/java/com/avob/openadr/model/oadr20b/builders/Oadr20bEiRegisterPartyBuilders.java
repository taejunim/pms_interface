package com.avob.openadr.model.oadr20b.builders;

import com.avob.openadr.model.oadr20b.builders.eiregisterparty.*;
import com.avob.openadr.model.oadr20b.ei.EiResponseType;

public class Oadr20bEiRegisterPartyBuilders {

	private Oadr20bEiRegisterPartyBuilders() {
	}

	public static Oadr20bCanceledPartyRegistrationBuilder newOadr20bCanceledPartyRegistrationBuilder(
			EiResponseType eiresponse, String registrationId, String venId) {
		return new Oadr20bCanceledPartyRegistrationBuilder(eiresponse, registrationId, venId)
				.withSchemaVersion("2.0b");
	}

	public static Oadr20bCancelPartyRegistrationBuilder newOadr20bCancelPartyRegistrationBuilder(String requestId,
			String registrationId, String venId) {
		return new Oadr20bCancelPartyRegistrationBuilder(requestId, registrationId, venId)
				.withSchemaVersion("2.0b");
	}

	public static Oadr20bCreatedPartyRegistrationBuilder newOadr20bCreatedPartyRegistrationBuilder(
			EiResponseType eiresponse, String venId, String vtnId) {
		return new Oadr20bCreatedPartyRegistrationBuilder(eiresponse, venId, vtnId)
				.withSchemaVersion("2.0b");
	}

	public static Oadr20bCreatePartyRegistrationBuilder newOadr20bCreatePartyRegistrationBuilder(String requestId,
			String venId, String profilName) {
		return new Oadr20bCreatePartyRegistrationBuilder(requestId, venId, profilName)
				.withSchemaVersion("2.0b");
	}

	public static Oadr20bQueryRegistrationBuilder newOadr20bQueryRegistrationBuilder(String requestId) {
		return new Oadr20bQueryRegistrationBuilder(requestId)
				.withSchemaVersion("2.0b");
	}

	public static Oadr20bRequestReregistrationBuilder newOadr20bRequestReregistrationBuilder(String venId) {
		return new Oadr20bRequestReregistrationBuilder(venId)
				.withSchemaVersion("2.0b");
	}

	public static Oadr20bOadrProfileBuilder newOadr20bOadrProfileBuilder(String profileName) {
		return new Oadr20bOadrProfileBuilder(profileName);
	}
}
