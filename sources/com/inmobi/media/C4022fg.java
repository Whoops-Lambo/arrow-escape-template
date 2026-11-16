package com.inmobi.media;

import defpackage.s71;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.fg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4022fg {
    public final Map a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4022fg) && s71.b(this.a, ((C4022fg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.a + ")";
    }

    public C4022fg(Map map) {
        map.getClass();
        this.a = map;
    }
}
