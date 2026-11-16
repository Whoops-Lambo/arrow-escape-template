package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfi extends IllegalStateException {
    public final int a;
    public final int b;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfi.class == obj.getClass()) {
            zzfi zzfiVar = (zzfi) obj;
            if (this.a == zzfiVar.a && this.b == zzfiVar.b) {
                return true;
            }
        }
        return false;
    }

    public zzfi(int i, int i2) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? rl3.k(new StringBuilder(String.valueOf(i2).length() + 31), "Player stuck suppressed for ", i2, " ms") : rl3.k(new StringBuilder(String.valueOf(i2).length() + 43), "Player stuck playing without ending for ", i2, " ms") : rl3.k(new StringBuilder(String.valueOf(i2).length() + 45), "Player stuck playing with no progress for ", i2, " ms") : rl3.k(new StringBuilder(String.valueOf(i2).length() + 47), "Player stuck buffering with no progress for ", i2, " ms") : rl3.k(new StringBuilder(String.valueOf(i2).length() + 46), "Player stuck buffering and not loading for ", i2, " ms"));
        this.a = i;
        this.b = i2;
    }

    public final int hashCode() {
        return ((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b;
    }
}
