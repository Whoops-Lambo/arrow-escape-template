package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajx extends zzakg {
    public final byte[] b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajx.class != obj.getClass()) {
            return false;
        }
        zzajx zzajxVar = (zzajx) obj;
        return this.a.equals(zzajxVar.a) && Arrays.equals(this.b, zzajxVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public zzajx(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }
}
