package com.moloco.sdk.internal.configs;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public final String a;
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperationalMetricsConfig(reportingUrl=");
        sb.append(this.a);
        sb.append(", pollingIntervalSeconds=");
        return h50.l(sb, this.b, ')');
    }

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
