package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.ironsource.C4664b4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.BuildConfig;
import defpackage.e32;
import defpackage.h50;
import defpackage.n30;
import defpackage.pv1;
import defpackage.q63;
import defpackage.qm4;
import defpackage.rl3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzv {
    public static final /* synthetic */ int R = 0;
    public final int A;
    public final boolean B;
    public final float C;
    public final byte[] D;
    public final int E;
    public final zzi F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public int Q;
    public final String a;
    public final String b;
    public final zzgzb c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final zzap l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final zzq s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new zzv(new zzt());
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
        Integer.toString(39, 36);
        Integer.toString(40, 36);
        Integer.toString(41, 36);
    }

    public static String c(zzv zzvVar) {
        String str;
        String str2;
        String string;
        int i;
        int i2;
        StringBuilder sbP = h50.p("id=");
        sbP.append(zzvVar.a);
        sbP.append(", mimeType=");
        sbP.append(zzvVar.o);
        String str3 = zzvVar.n;
        if (str3 != null) {
            sbP.append(", container=");
            sbP.append(str3);
        }
        String str4 = zzvVar.m;
        if (str4 != null) {
            sbP.append(", primaryGroupId=");
            sbP.append(str4);
        }
        int i3 = zzvVar.j;
        if (i3 != -1) {
            sbP.append(", bitrate=");
            sbP.append(i3);
        }
        String str5 = zzvVar.k;
        if (str5 != null) {
            sbP.append(", codecs=");
            sbP.append(str5);
        }
        zzq zzqVar = zzvVar.s;
        if (zzqVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < zzqVar.d; i4++) {
                UUID uuid = zzqVar.a[i4].b;
                if (uuid.equals(zzg.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzg.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzg.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzg.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzg.a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb = new StringBuilder(string2.length() + 10);
                    sb.append("unknown (");
                    sb.append(string2);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
            }
            sbP.append(", drm=[");
            zzgvt.a(sbP, linkedHashSet.iterator(), ",");
            sbP.append(']');
        }
        int i5 = zzvVar.v;
        if (i5 != -1 && (i2 = zzvVar.w) != -1) {
            pv1.s(i5, i2, ", res=", "x", sbP);
        }
        int i6 = zzvVar.x;
        if (i6 != -1 && (i = zzvVar.y) != -1) {
            pv1.s(i6, i, ", decRes=", "x", sbP);
        }
        float f = zzvVar.C;
        int i7 = zzhcg.a;
        double d = f;
        if (Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbP.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            String str6 = zzfq.a;
            sbP.append(String.format(Locale.US, "%.3f", objArr));
        }
        zzi zziVar = zzvVar.F;
        if (zziVar != null) {
            int i8 = zziVar.f;
            int i9 = zziVar.e;
            if ((i9 != -1 && i8 != -1) || zziVar.d()) {
                sbP.append(", color=");
                if (zziVar.d()) {
                    String strE = zzi.e(zziVar.a);
                    String strG = zzi.g(zziVar.b);
                    String strF = zzi.f(zziVar.c);
                    String str7 = zzfq.a;
                    Locale locale = Locale.US;
                    str2 = strE + "/" + strG + "/" + strF;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i9 == -1 || i8 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(rl3.c(i9, 1) + String.valueOf(i8).length());
                    sb2.append(i9);
                    sb2.append("/");
                    sb2.append(i8);
                    string = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(string.length() + str2.length() + 1);
                sb3.append(str2);
                sb3.append("/");
                sb3.append(string);
                sbP.append(sb3.toString());
            }
        }
        float f2 = zzvVar.z;
        if (f2 != -1.0f) {
            sbP.append(", fps=");
            sbP.append(f2);
        }
        int i10 = zzvVar.A;
        if (i10 != 0) {
            sbP.append(", rotation=");
            sbP.append(i10);
        }
        if (zzvVar.B) {
            sbP.append(", mirrorHorizontal");
        }
        int i11 = zzvVar.G;
        if (i11 != -1) {
            sbP.append(", maxSubLayers=");
            sbP.append(i11);
        }
        int i12 = zzvVar.H;
        if (i12 != -1) {
            sbP.append(", channels=");
            sbP.append(i12);
        }
        int i13 = zzvVar.I;
        if (i13 != -1) {
            sbP.append(", channel_mask=");
            sbP.append(i13);
        }
        int i14 = zzvVar.J;
        if (i14 != -1) {
            sbP.append(", sample_rate=");
            sbP.append(i14);
        }
        String str8 = zzvVar.d;
        if (str8 != null) {
            sbP.append(", language=");
            sbP.append(str8);
        }
        zzgzb zzgzbVar = zzvVar.c;
        if (!zzgzbVar.isEmpty()) {
            sbP.append(", labels=[");
            zzgvt.a(sbP, zzhab.b(zzgzbVar, qm4.h).iterator(), ",");
            sbP.append(C4664b4.j.e);
        }
        int i15 = zzvVar.e;
        if (i15 != 0) {
            sbP.append(", selectionFlags=[");
            String str9 = zzfq.a;
            ArrayList arrayList = new ArrayList();
            if ((i15 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            zzgvt.a(sbP, arrayList.iterator(), ",");
            sbP.append(C4664b4.j.e);
        }
        int i16 = zzvVar.f;
        if (i16 != 0) {
            sbP.append(", roleFlags=[");
            int i17 = i16 & 32768;
            String str10 = zzfq.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i16 & 1) != 0) {
                arrayList2.add(C4664b4.i.Z);
            }
            if ((i16 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i16 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i16 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i16 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i16 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i16 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i16 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i16 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i16 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i16 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i16 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i16 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i16 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i16 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i17 != 0) {
                arrayList2.add("auxiliary");
            }
            zzgvt.a(sbP, arrayList2.iterator(), ",");
            sbP.append(C4664b4.j.e);
        }
        if ((i16 & 32768) != 0) {
            sbP.append(", auxiliaryTrackType=");
            int i18 = zzvVar.g;
            String str11 = zzfq.a;
            if (i18 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i18 == 1) {
                str = "original";
            } else if (i18 == 2) {
                str = "depth-linear";
            } else if (i18 == 3) {
                str = "depth-inverse";
            } else {
                if (i18 != 4) {
                    e32.i("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbP.append(str);
        }
        return sbP.toString();
    }

    public final zzt a() {
        return new zzt(this);
    }

    public final boolean b(zzv zzvVar) {
        List list = this.r;
        int size = list.size();
        List list2 = zzvVar.r;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || zzv.class != obj.getClass()) {
            return false;
        }
        zzv zzvVar = (zzv) obj;
        int i2 = this.Q;
        return (i2 == 0 || (i = zzvVar.Q) == 0 || i2 == i) && this.e == zzvVar.e && this.f == zzvVar.f && this.g == zzvVar.g && this.h == zzvVar.h && this.i == zzvVar.i && this.p == zzvVar.p && this.t == zzvVar.t && this.v == zzvVar.v && this.w == zzvVar.w && this.x == zzvVar.x && this.y == zzvVar.y && this.A == zzvVar.A && this.B == zzvVar.B && this.E == zzvVar.E && this.G == zzvVar.G && this.H == zzvVar.H && this.I == zzvVar.I && this.J == zzvVar.J && this.K == zzvVar.K && this.L == zzvVar.L && this.M == zzvVar.M && this.N == zzvVar.N && this.P == zzvVar.P && Float.compare(this.z, zzvVar.z) == 0 && Float.compare(-1.0f, -1.0f) == 0 && Float.compare(this.C, zzvVar.C) == 0 && Objects.equals(this.a, zzvVar.a) && Objects.equals(this.b, zzvVar.b) && this.c.equals(zzvVar.c) && Objects.equals(this.k, zzvVar.k) && Objects.equals(this.m, zzvVar.m) && Objects.equals(this.n, zzvVar.n) && Objects.equals(this.o, zzvVar.o) && Objects.equals(this.d, zzvVar.d) && Arrays.equals(this.D, zzvVar.D) && Objects.equals(this.l, zzvVar.l) && Objects.equals(this.F, zzvVar.F) && Objects.equals(this.s, zzvVar.s) && b(zzvVar);
    }

    public final int hashCode() {
        int i = this.Q;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = this.c.hashCode() + pv1.c(iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, str2 == null ? 0 : str2.hashCode(), 31);
        String str3 = this.d;
        int iFloatToIntBits = (((((((Float.floatToIntBits(-1.0f) + ((((pv1.c(iHashCode2, 31, str3 == null ? 0 : str3.hashCode(), 31) + this.e) * 31) + this.f) * 31)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int iHashCode3 = (iFloatToIntBits + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzap zzapVar = this.l;
        int iHashCode4 = iHashCode3 + (zzapVar == null ? 0 : zzapVar.hashCode());
        String str5 = this.m;
        int iC = pv1.c(iHashCode4, 961, str5 == null ? 0 : str5.hashCode(), 31);
        String str6 = this.n;
        int iHashCode5 = (iC + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.o;
        int iFloatToIntBits2 = ((((((((((((((((((((((((Float.floatToIntBits(this.C) + ((((((Float.floatToIntBits(this.z) + ((((com.explorestack.protobuf.z.i((((((((iHashCode5 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31, this.w, 31, -1, 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.E) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) - 1) * 31) - 1) * 31) + this.P;
        this.Q = iFloatToIntBits2;
        return iFloatToIntBits2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.F);
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.k;
        int length5 = String.valueOf(str5).length();
        int i = this.j;
        int length6 = String.valueOf(i).length();
        String str6 = this.d;
        int length7 = String.valueOf(str6).length();
        int i2 = this.v;
        int length8 = String.valueOf(i2).length();
        int i3 = this.w;
        int length9 = String.valueOf(i3).length();
        float f = this.z;
        int length10 = String.valueOf(f).length();
        int length11 = strValueOf.length();
        int i4 = this.H;
        int length12 = String.valueOf(i4).length();
        int i5 = this.I;
        int length13 = String.valueOf(i5).length();
        int i6 = this.J;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i6).length() + 2);
        q63.y(sb, "Format(", str, ", ", str2);
        q63.y(sb, ", ", str3, ", ", str4);
        n30.t(i, ", ", str5, ", ", sb);
        n30.t(i2, ", ", str6, ", [", sb);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        n30.t(i4, ", ", strValueOf, "], [", sb);
        pv1.s(i5, i6, ", ", ", ", sb);
        sb.append("])");
        return sb.toString();
    }

    public zzv(zzt zztVar) {
        boolean z;
        String str;
        boolean z2;
        this.a = zztVar.a;
        String strQ = zzfq.q(zztVar.d);
        this.d = strQ;
        if (zztVar.c.isEmpty() && zztVar.b != null) {
            this.c = zzgzb.x(new zzx(strQ, zztVar.b));
            this.b = zztVar.b;
        } else if (!zztVar.c.isEmpty() && zztVar.b == null) {
            zzgzb zzgzbVar = zztVar.c;
            this.c = zzgzbVar;
            Iterator it = zzgzbVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    zzx zzxVar = (zzx) it.next();
                    if (TextUtils.equals(zzxVar.a, strQ)) {
                        str = zzxVar.b;
                        break;
                    }
                } else {
                    str = ((zzx) zzgzbVar.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (zztVar.c.isEmpty() && zztVar.b == null) {
                z = true;
                break;
            }
            int i = 0;
            while (true) {
                if (i < zztVar.c.size()) {
                    if (((zzx) zztVar.c.get(i)).b.equals(zztVar.b)) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            zzgvz.f(z);
            this.c = zztVar.c;
            this.b = zztVar.b;
        }
        this.e = zztVar.e;
        if (zztVar.g == 0 || (zztVar.f & 32768) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgvz.g("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = zztVar.f;
        this.g = zztVar.g;
        int i2 = zztVar.h;
        this.h = i2;
        int i3 = zztVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = zztVar.j;
        this.l = zztVar.k;
        this.m = zztVar.l;
        this.n = zztVar.m;
        this.o = zztVar.n;
        this.p = zztVar.o;
        this.q = zztVar.p;
        List list = zztVar.q;
        this.r = list == null ? Collections.EMPTY_LIST : list;
        zzq zzqVar = zztVar.r;
        this.s = zzqVar;
        this.t = zztVar.s;
        this.u = zztVar.t;
        this.v = zztVar.u;
        this.w = zztVar.v;
        this.x = zztVar.w;
        this.y = zztVar.x;
        this.z = zztVar.y;
        int i4 = zztVar.z;
        this.A = i4 == -1 ? 0 : i4;
        this.B = zztVar.A;
        float f = zztVar.B;
        this.C = f == -1.0f ? 1.0f : f;
        this.D = zztVar.C;
        this.E = zztVar.D;
        this.F = zztVar.E;
        this.G = zztVar.F;
        int i5 = zztVar.G;
        this.H = i5;
        int i6 = zztVar.H;
        this.I = i6;
        if (i5 != -1 && i6 != -1 && Integer.bitCount(i6) != i5) {
            e32.i(zzgwq.a("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i5), Integer.valueOf(i6)));
            throw null;
        }
        this.J = zztVar.I;
        this.K = zztVar.J;
        int i7 = zztVar.K;
        this.L = i7 == -1 ? 0 : i7;
        int i8 = zztVar.L;
        this.M = i8 != -1 ? i8 : 0;
        this.N = zztVar.M;
        this.O = zztVar.N;
        int i9 = zztVar.O;
        if (i9 == 0 && zzqVar != null) {
            this.P = 1;
        } else {
            this.P = i9;
        }
    }
}
