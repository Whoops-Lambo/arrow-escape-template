package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.h50;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public final int a;
    public final Integer b;

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : h50.C(i)) * 31;
        Integer num = this.b;
        return iC + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && s71.b(this.b, fVar.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioSignal(muteSwitchState=");
        int i = this.a;
        if (i == 1) {
            str = "SILENT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "NORMAL";
        } else {
            str = "VIBRATE";
        }
        sb.append(str);
        sb.append(", mediaVolume=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }

    public f(int i, Integer num) {
        this.a = i;
        this.b = num;
    }
}
