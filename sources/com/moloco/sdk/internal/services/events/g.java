package com.moloco.sdk.internal.services.events;

import defpackage.jc1;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c.equals(gVar.c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n30.c(jc1.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEventConfig(eventReportingEnabled=");
        sb.append(this.a);
        sb.append(", userTrackingEnabled=");
        sb.append(this.b);
        sb.append(", appForegroundUrl=");
        sb.append(this.c);
        sb.append(", appBackgroundUrl=");
        return jc1.q(sb, this.d, ')');
    }

    public g(String str, String str2, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }
}
