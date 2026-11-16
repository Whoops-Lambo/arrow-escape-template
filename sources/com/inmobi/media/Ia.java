package com.inmobi.media;

import defpackage.s71;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ia {
    public final JSONObject a;
    public final JSONArray b;
    public final C4325qc c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ia)) {
            return false;
        }
        Ia ia = (Ia) obj;
        return s71.b(this.a, ia.a) && s71.b(this.b, ia.b) && s71.b(this.c, ia.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.a + ", logs=" + this.b + ", data=" + this.c + ")";
    }

    public Ia(JSONObject jSONObject, JSONArray jSONArray, C4325qc c4325qc) {
        jSONObject.getClass();
        jSONArray.getClass();
        c4325qc.getClass();
        this.a = jSONObject;
        this.b = jSONArray;
        this.c = c4325qc;
    }
}
