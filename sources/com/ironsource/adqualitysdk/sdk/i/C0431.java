package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ɜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0431 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final byte[] f885;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] f886;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0431)) {
            return false;
        }
        C0431 c0431 = (C0431) obj;
        return Arrays.equals(this.f886, c0431.f886) && Arrays.equals(this.f885, c0431.f885);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f885) + (Arrays.hashCode(this.f886) * 31);
    }

    public final String toString() {
        return StringFog.decrypt("oM17KYY8etSJ9nY1uzhhx57NYSWdOHzQrthqDpItbcbY\n", "5b0TTOtZCLU=\n") + Arrays.toString(this.f886) + StringFog.decrypt("MbIi51bRdepW9yvQTcl5+iA=\n", "HZJSkjS9HIk=\n") + Arrays.toString(this.f885) + '}';
    }

    public C0431(byte[] bArr, byte[] bArr2) {
        this.f886 = bArr;
        this.f885 = bArr2;
    }
}
