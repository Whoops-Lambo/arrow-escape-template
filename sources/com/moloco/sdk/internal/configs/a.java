package com.moloco.sdk.internal.configs;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final boolean a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashReportingConfig(enabled=");
        sb.append(this.a);
        sb.append(", url=");
        return jc1.q(sb, this.b, ')');
    }

    public a(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
