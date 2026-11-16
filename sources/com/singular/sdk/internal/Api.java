package com.singular.sdk.internal;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface Api {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnApiCallback {
        boolean handle(SingularInstance singularInstance, int i, String str);
    }

    OnApiCallback getOnApiCallback();

    String getPath();

    long getTimestamp();

    String getType();

    boolean makeRequest(SingularInstance singularInstance) throws IOException;

    String toJsonAsString();
}
