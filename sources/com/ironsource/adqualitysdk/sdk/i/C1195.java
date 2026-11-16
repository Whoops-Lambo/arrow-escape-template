package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.n30;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.וֹ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1195 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final long f3599;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final byte[] f3600;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f3601;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1195) {
            return this.f3601.equals(((C1195) obj).f3601);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3601.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("XIBq6pDzUsVrlmj2mu5d5GuUbvqG9G/yM8I=\n", "DuUbn/WAJpY=\n"));
        sb.append(this.f3601);
        sb.append('\'');
        sb.append(StringFog.decrypt("gGyiTK6QOhc=\n", "rEzJKdfZXio=\n"));
        sb.append(1);
        sb.append(StringFog.decrypt("TuBkKDR43BYQrSk=\n", "YsAURFUMunk=\n"));
        sb.append(2);
        sb.append(StringFog.decrypt("rHeARO+XXtLkFpd7+cs=\n", "gFfjNor2Krc=\n"));
        return n30.o(sb, this.f3599, '}');
    }

    public C1195(String str, byte[] bArr, long j) {
        this.f3601 = str;
        this.f3600 = bArr;
        this.f3599 = j;
    }
}
