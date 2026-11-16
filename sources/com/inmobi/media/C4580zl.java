package com.inmobi.media;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4580zl {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(InterfaceC4472vl interfaceC4472vl) {
        interfaceC4472vl.getClass();
        if (this.a.containsKey(interfaceC4472vl.a())) {
            interfaceC4472vl.a();
        } else {
            this.a.put(interfaceC4472vl.a(), interfaceC4472vl);
        }
    }
}
