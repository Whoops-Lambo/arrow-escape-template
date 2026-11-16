package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakj extends zzakg {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public zzakj(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakj.class != obj.getClass()) {
            return false;
        }
        zzakj zzakjVar = (zzakj) obj;
        return this.b == zzakjVar.b && this.c == zzakjVar.c && this.d == zzakjVar.d && Arrays.equals(this.e, zzakjVar.e) && Arrays.equals(this.f, zzakjVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
