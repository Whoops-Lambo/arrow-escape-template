package com.inmobi.media;

import defpackage.s71;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.wl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4499wl extends AbstractC4553yl {
    public final JSONArray a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4499wl) && s71.b(this.a, ((C4499wl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ArrayPayload(value=" + this.a + ")";
    }

    public C4499wl(JSONArray jSONArray) {
        jSONArray.getClass();
        this.a = jSONArray;
    }
}
