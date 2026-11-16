package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.h50;
import defpackage.jc1;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public final int a;
    public final String b;
    public final String c;

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : h50.C(i)) * 31;
        String str = this.b;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && s71.b(this.b, mVar.b) && s71.b(this.c, mVar.c);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DeviceSignalInfo(orientation=");
        int i = this.a;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "LANDSCAPE";
        } else {
            str = "PORTRAIT";
        }
        sb.append(str);
        sb.append(", locale=");
        sb.append(this.b);
        sb.append(", keyboardLocale=");
        return jc1.q(sb, this.c, ')');
    }

    public m(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
