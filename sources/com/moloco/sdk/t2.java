package com.moloco.sdk;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum t2 implements Internal.EnumLite {
    UNKNOWN(0),
    HTTP_SSL_ERROR(1),
    HTTP_UKNOWN_HOST(2),
    HTTP_REQUEST_TIMEOUT(3),
    HTTP_SOCKET(4),
    ANDROID_WORK_MANAGER_ISSUE(5),
    UNRECOGNIZED(-1);

    public final int a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        defpackage.d.r("Can't get the number of an unknown enum value.");
        return 0;
    }

    t2(int i2) {
        this.a = i2;
    }
}
