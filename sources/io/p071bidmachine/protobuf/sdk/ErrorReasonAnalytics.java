package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum ErrorReasonAnalytics implements c5 {
    ERROR_REASON_ANALYTICS_INVALID(0),
    ERROR_REASON_ANALYTICS_UNDEFINED(2000),
    ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED(2100),
    ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT(ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE),
    ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT(ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE),
    ERROR_REASON_ANALYTICS_READER_UNDEFINED(2200),
    ERROR_REASON_ANALYTICS_READER_NO_CONTENT(2201),
    ERROR_REASON_ANALYTICS_READER_BAD_CONTENT(ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE),
    ERROR_REASON_ANALYTICS_READER_NO_ACCESS(2203),
    UNRECOGNIZED(-1);

    public static final int ERROR_REASON_ANALYTICS_INVALID_VALUE = 0;
    public static final int ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE = 2102;
    public static final int ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE = 2101;
    public static final int ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED_VALUE = 2100;
    public static final int ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE = 2202;
    public static final int ERROR_REASON_ANALYTICS_READER_NO_ACCESS_VALUE = 2203;
    public static final int ERROR_REASON_ANALYTICS_READER_NO_CONTENT_VALUE = 2201;
    public static final int ERROR_REASON_ANALYTICS_READER_UNDEFINED_VALUE = 2200;
    public static final int ERROR_REASON_ANALYTICS_UNDEFINED_VALUE = 2000;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.sdk.ErrorReasonAnalytics.1
        public ErrorReasonAnalytics findValueByNumber(int i) {
            return ErrorReasonAnalytics.forNumber(i);
        }
    };
    private static final ErrorReasonAnalytics[] VALUES = values();

    public static ErrorReasonAnalytics forNumber(int i) {
        if (i == 0) {
            return ERROR_REASON_ANALYTICS_INVALID;
        }
        if (i == 2000) {
            return ERROR_REASON_ANALYTICS_UNDEFINED;
        }
        switch (i) {
            case 2100:
                return ERROR_REASON_ANALYTICS_MONITOR_UNDEFINED;
            case ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT_VALUE:
                return ERROR_REASON_ANALYTICS_MONITOR_NO_CONTENT;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                return ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT;
            default:
                switch (i) {
                    case 2200:
                        return ERROR_REASON_ANALYTICS_READER_UNDEFINED;
                    case 2201:
                        return ERROR_REASON_ANALYTICS_READER_NO_CONTENT;
                    case ERROR_REASON_ANALYTICS_READER_BAD_CONTENT_VALUE:
                        return ERROR_REASON_ANALYTICS_READER_BAD_CONTENT;
                    case 2203:
                        return ERROR_REASON_ANALYTICS_READER_NO_ACCESS;
                    default:
                        return null;
                }
        }
    }

    public static d5 internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.c5
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        d.r("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        e32.i("Can't get the descriptor of an unrecognized enum value.");
        return null;
    }

    ErrorReasonAnalytics(int i) {
        this.value = i;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return SDKErrorsProto.getDescriptor().getEnumTypes().get(0);
    }

    public static ErrorReasonAnalytics valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        d.r("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Deprecated
    public static ErrorReasonAnalytics valueOf(int i) {
        return forNumber(i);
    }
}
