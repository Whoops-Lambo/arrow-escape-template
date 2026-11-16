package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᔅ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0884 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String f2372;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f2373;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0884)) {
            return false;
        }
        C0884 c0884 = (C0884) obj;
        return this.f2373.equals(c0884.f2373) && this.f2372.equals(c0884.f2372);
    }

    public final int hashCode() {
        Long l = 300000L;
        return l.hashCode() + ((((((this.f2372.hashCode() + (this.f2373.hashCode() * 31)) * 31) + 2) * 31) + 2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("EEqLmgYmdv06SpqsGy1c9SRUm4sfFV/uMEaHgUlk\n", "Qy/o73RDOpw=\n"));
        sb.append(this.f2373);
        sb.append('\'');
        sb.append(StringFog.decrypt("2eInaEBTVD+UsS4lFw==\n", "9cJGGDAaMHc=\n"));
        sb.append(this.f2372);
        sb.append('\'');
        sb.append(StringFog.decrypt("Fcuv7GLAU4BLhuI=\n", "OevfgAO0Ne8=\n"));
        sb.append(2);
        sb.append(StringFog.decrypt("yp5bbAKUCImVzVFsAbADnIOD\n", "5r44A2/keuw=\n"));
        sb.append(2);
        return AbstractC0529.m515("HfFOD5/UfVBUolcPivBHVlSmbh3a\n", "MdEjbueAFD0=\n", sb, "300000}");
    }

    public C0884(String str, String str2) {
        if (str != null && !str.trim().isEmpty()) {
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f2373 = str;
                this.f2372 = str2;
                return;
            } else {
                defpackage.d.r(StringFog.decrypt("K0xa0/dP4XMLT0LT036yb0pSRYeeaaQ7CFBLndU=\n", "ajwq874LwRs=\n"));
                throw null;
            }
        }
        defpackage.d.r(StringFog.decrypt("yJs2gBXoBqXysBOADvgHoruxEtRD7xH2+bMczgg=\n", "m999oGONdNY=\n"));
        throw null;
    }
}
