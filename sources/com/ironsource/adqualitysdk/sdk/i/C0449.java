package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ʄ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0449 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f905;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0449) {
            return Arrays.equals(this.f905, ((C0449) obj).f905);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f905);
    }

    public final String toString() {
        return StringFog.decrypt("GmaUfth0vPQ3d45542Gn5Cl3kGL+Rqb1M1eUfbc=\n", "WwP1GooRz4E=\n") + Arrays.toString(this.f905) + '}';
    }

    public C0449(byte[] bArr) {
        this.f905 = bArr;
    }
}
