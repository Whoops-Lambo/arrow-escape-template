package com.explorestack.protobuf;

import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k8 {
    public static final /* synthetic */ int b = 0;
    public final Map a = Collections.EMPTY_MAP;

    static {
        Logger.getLogger(k8.class.getName());
    }

    public static Descriptors.Descriptor a(String str) throws InvalidProtocolBufferException {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 1) {
            throw new InvalidProtocolBufferException("Invalid type url found: ".concat(str));
        }
        return (Descriptors.Descriptor) Collections.EMPTY_MAP.get(strArrSplit[strArrSplit.length - 1]);
    }
}
