package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.dz4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ḻ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C1048 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ConcurrentHashMap f3033 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m756() {
        C1054 c1054 = (C1054) this.f3033.get(1);
        if (c1054 == null) {
            dz4.c(1, StringFog.decrypt("3RypX+L36oHhU+JJ/qX6i+Yd7Qzh6u7E+BbwDM7BpsQ=\n", "k3OJLIeFnOQ=\n"));
            return null;
        }
        byte[] bArrM759 = c1054.m759();
        byte[] bArr = new byte[bArrM759.length];
        System.arraycopy(bArrM759, 0, bArr, 0, bArrM759.length);
        return bArr;
    }
}
