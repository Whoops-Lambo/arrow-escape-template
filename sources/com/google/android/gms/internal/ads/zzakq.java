package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakq implements zzao {
    public final String a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakq.class == obj.getClass()) {
            zzakq zzakqVar = (zzakq) obj;
            if (this.a.equals(zzakqVar.a) && this.b.equals(zzakqVar.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        Integer numF;
        Integer numF2;
        Integer numF3;
        Integer numF4;
        String str = this.a;
        int iHashCode = str.hashCode();
        String str2 = this.b;
        switch (iHashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numF = zzhcr.f(str2)) != null) {
                    zzamVar.i = numF;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numF2 = zzhcr.f(str2)) != null) {
                    zzamVar.w = numF2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numF3 = zzhcr.f(str2)) != null) {
                    zzamVar.h = numF3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzamVar.c = str2;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzamVar.x = str2;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    zzamVar.a = str2;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    zzamVar.e = str2;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    zzamVar.u = str2;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numF4 = zzhcr.f(str2)) != null) {
                    zzamVar.v = numF4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzamVar.d = str2;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzamVar.b = str2;
                }
                break;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        return pv1.p(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }

    public zzakq(String str, String str2) {
        this.a = zzgvh.b(str);
        this.b = str2;
    }
}
