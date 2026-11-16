package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class n8 extends RuntimeException {
    private final List<String> a;

    private static String f(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public n8(List<String> list) {
        super(f(list));
        this.a = list;
    }

    public n8(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.a = null;
    }
}
