package com.inmobi.media;

import defpackage.s71;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4526xl extends AbstractC4553yl {
    public final JSONObject a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4526xl) && s71.b(this.a, ((C4526xl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ObjectPayload(value=" + this.a + ")";
    }

    public C4526xl(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
    }
}
