package pms.api.dr;

public class DrConstants {

    public static final String DR_SCHEMA_VERSION = "2.0b";
    public static final boolean DR_HTTP_PULL_MODEL = true;
    public static final boolean DR_REPORT_ONLY = false;
    public static final boolean DR_XML_SIGNATURE = false;
    public static final String DR_REPORT_SPECIFIER_ID = "KPX_TU";
    public static final String DR_RESOURCE_ID = "KpxResource";
    public static final String DR_MIN_PERIOD = "PT1M";
    public static final String DR_MAX_PERIOD = "PT5M";
    public static final String DR_PT15M = "PT15M";
    public static final String DR_REPORT_DURATION_0H = "PT0H";
    public static final String DR_REPORT_DURATION = "PT48000H";
    public static final String DR_MARKET_CONTEXT = "http://dras.kmos.kr";
    public static final String DR_CREATE_PARTY_REGISTRATION_ID = "createPartyRegistration_";
    public static final String DR_CANCEL_PARTY_REGISTRATION_ID = "cancelPartyRegistration_";
    public static final String DR_REGISTER_REPORT_ID = "registerReport_";
    public static final String DR_REPORT_ID = "report_";
    public static final String DR_REPORT_REQUEST_ID = "reportRequest_";
    public static final String DR_UPDATE_REPORT_ID = "updateReport_";
    public static final String DR_CREATED_EVENT_ID = "createdEvent_";

    public static final String FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_UTC = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static final String FORMAT_DATE = "yyyy-MM-dd";
    public static final String FORMAT_HOUR_MINUTE = "HHmm";

    /*Status Code*/
    public static final String DR_CODE_SUCCESS = "200";
}
