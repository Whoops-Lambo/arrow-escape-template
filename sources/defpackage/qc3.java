package defpackage;

import io.p071bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum qc3 {
    ENCRYPTION_EXCEPTION(1100),
    RAW_ONE_DT_ERROR(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE),
    ONE_DT_PARSE_ERROR(1102),
    ONE_DT_AUTHENTICATION_ERROR(1103),
    ONE_DT_BROADCAST_ERROR(1104),
    ONE_DT_REQUEST_ERROR(1105),
    ONE_DT_GENERAL_ERROR(1106);

    public final int a;

    qc3(int i2) {
        this.a = i2;
    }
}
