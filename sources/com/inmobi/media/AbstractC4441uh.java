package com.inmobi.media;

import okhttp3.Response;

/* JADX INFO: renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4441uh {
    public static final boolean a(Response response) {
        response.getClass();
        C4565z6 c4565z6 = B6.b;
        int iCode = response.code();
        c4565z6.getClass();
        if (C4565z6.a(iCode) != B6.d) {
            return true;
        }
        return false;
    }
}
