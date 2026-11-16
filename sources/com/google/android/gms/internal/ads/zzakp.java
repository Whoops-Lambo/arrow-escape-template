package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakp implements zzao {
    public final float a;
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakp.class == obj.getClass()) {
            zzakp zzakpVar = (zzakp) obj;
            if (this.a == zzakpVar.a && this.b == zzakpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return n30.b(this.a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + this.b;
    }

    public final String toString() {
        float f = this.a;
        int length = String.valueOf(f).length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    public zzakp(float f, int i) {
        this.a = f;
        this.b = i;
    }
}
