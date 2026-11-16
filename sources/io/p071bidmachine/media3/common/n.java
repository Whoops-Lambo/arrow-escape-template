package io.p071bidmachine.media3.common;

import android.text.TextUtils;
import com.explorestack.protobuf.z;
import com.google.android.gms.ads.AdError;
import com.ironsource.C4664b4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.BuildConfig;
import defpackage.d31;
import defpackage.e32;
import defpackage.h50;
import defpackage.jc1;
import defpackage.kd0;
import defpackage.l7;
import defpackage.nj;
import defpackage.p91;
import defpackage.pv1;
import defpackage.uq2;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    public final int A;
    public final f B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public final String a;
    public final String b;
    public final d31 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final d0 l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final DrmInitData r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final float w;
    public final int x;
    public final float y;
    public final byte[] z;

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        int i2 = this.N;
        return (i2 == 0 || (i = nVar.N) == 0 || i2 == i) && this.e == nVar.e && this.f == nVar.f && this.g == nVar.g && this.h == nVar.h && this.i == nVar.i && this.o == nVar.o && this.s == nVar.s && this.u == nVar.u && this.v == nVar.v && this.x == nVar.x && this.A == nVar.A && this.C == nVar.C && this.D == nVar.D && this.E == nVar.E && this.F == nVar.F && this.G == nVar.G && this.H == nVar.H && this.I == nVar.I && this.K == nVar.K && this.L == nVar.L && this.M == nVar.M && Float.compare(this.w, nVar.w) == 0 && Float.compare(this.y, nVar.y) == 0 && Objects.equals(this.a, nVar.a) && Objects.equals(this.b, nVar.b) && this.c.equals(nVar.c) && Objects.equals(this.k, nVar.k) && Objects.equals(this.m, nVar.m) && Objects.equals(this.n, nVar.n) && Objects.equals(this.d, nVar.d) && Arrays.equals(this.z, nVar.z) && Objects.equals(this.l, nVar.l) && Objects.equals(this.B, nVar.B) && Objects.equals(this.r, nVar.r) && b(nVar);
    }

    static {
        new m().a();
        x.G(0);
        x.G(1);
        x.G(2);
        x.G(3);
        x.G(4);
        z.p(5, 6, 7, 8, 9);
        z.p(10, 11, 12, 13, 14);
        z.p(15, 16, 17, 18, 19);
        z.p(20, 21, 22, 23, 24);
        z.p(25, 26, 27, 28, 29);
        z.p(30, 31, 32, 33, 34);
    }

    public static String c(n nVar) {
        int i;
        String str;
        String str2;
        String str3;
        if (nVar == null) {
            return "null";
        }
        int i2 = nVar.e;
        d31 d31Var = nVar.c;
        String str4 = nVar.d;
        int i3 = nVar.E;
        int i4 = nVar.D;
        int i5 = nVar.C;
        float f = nVar.w;
        f fVar = nVar.B;
        float f2 = nVar.y;
        int i6 = nVar.v;
        int i7 = nVar.u;
        DrmInitData drmInitData = nVar.r;
        String str5 = nVar.k;
        int i8 = nVar.j;
        String str6 = nVar.m;
        int i9 = nVar.f;
        p91 p91VarC = p91.c();
        StringBuilder sbP = h50.p("id=");
        sbP.append(nVar.a);
        sbP.append(", mimeType=");
        sbP.append(nVar.n);
        if (str6 != null) {
            sbP.append(", container=");
            sbP.append(str6);
        }
        int i10 = -1;
        if (i8 != -1) {
            sbP.append(", bitrate=");
            sbP.append(i8);
        }
        if (str5 != null) {
            sbP.append(", codecs=");
            sbP.append(str5);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < drmInitData.d) {
                UUID uuid = drmInitData.a[i11].b;
                if (uuid.equals(e.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(e.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(e.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(e.d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(e.a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                    i11++;
                    drmInitData = drmInitData;
                }
                i11++;
                drmInitData = drmInitData;
            }
            sbP.append(", drm=[");
            p91VarC.a(sbP, linkedHashSet.iterator());
            sbP.append(']');
            i10 = -1;
        }
        if (i7 != i10 && i6 != i10) {
            pv1.s(i7, i6, ", res=", "x", sbP);
        }
        if (!kd0.a(f2)) {
            sbP.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            int i12 = x.a;
            sbP.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (fVar != null) {
            int i13 = fVar.f;
            int i14 = fVar.e;
            if ((i14 != -1 && i13 != -1) || fVar.d()) {
                sbP.append(", color=");
                if (fVar.d()) {
                    String strB = f.b(fVar.a);
                    String strA = f.a(fVar.b);
                    String strC = f.c(fVar.c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i14 == -1 || i13 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i14 + "/" + i13;
                }
                sbP.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            sbP.append(", fps=");
            sbP.append(f);
        }
        if (i5 != -1) {
            sbP.append(", maxSubLayers=");
            sbP.append(i5);
        }
        if (i4 != -1) {
            sbP.append(", channels=");
            sbP.append(i4);
        }
        if (i3 != -1) {
            sbP.append(", sample_rate=");
            sbP.append(i3);
        }
        if (str4 != null) {
            sbP.append(", language=");
            sbP.append(str4);
        }
        int i15 = 2;
        if (!d31Var.isEmpty()) {
            sbP.append(", labels=[");
            p91VarC.a(sbP, l7.H(d31Var, new uq2(i15)).iterator());
            sbP.append(C4664b4.j.e);
        }
        if (i2 != 0) {
            sbP.append(", selectionFlags=[");
            int i16 = x.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            p91VarC.a(sbP, arrayList.iterator());
            sbP.append(C4664b4.j.e);
        }
        if (i9 != 0) {
            sbP.append(", roleFlags=[");
            int i17 = x.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i9 & 1) != 0) {
                arrayList2.add(C4664b4.i.Z);
            }
            if ((i9 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i9 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i9 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i9 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i9 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i9 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i9;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            p91VarC.a(sbP, arrayList2.iterator());
            sbP.append(C4664b4.j.e);
        } else {
            i = i9;
        }
        if ((i & 32768) != 0) {
            sbP.append(", auxiliaryTrackType=");
            int i18 = nVar.g;
            int i19 = x.a;
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

    public final m a() {
        m mVar = new m();
        mVar.a = this.a;
        mVar.b = this.b;
        mVar.c = this.c;
        mVar.d = this.d;
        mVar.e = this.e;
        mVar.f = this.f;
        mVar.h = this.h;
        mVar.i = this.i;
        mVar.j = this.k;
        mVar.k = this.l;
        mVar.l = this.m;
        mVar.m = this.n;
        mVar.n = this.o;
        mVar.o = this.p;
        mVar.p = this.q;
        mVar.q = this.r;
        mVar.r = this.s;
        mVar.s = this.t;
        mVar.t = this.u;
        mVar.u = this.v;
        mVar.v = this.w;
        mVar.w = this.x;
        mVar.x = this.y;
        mVar.y = this.z;
        mVar.z = this.A;
        mVar.A = this.B;
        mVar.B = this.C;
        mVar.C = this.D;
        mVar.D = this.E;
        mVar.E = this.F;
        mVar.F = this.G;
        mVar.G = this.H;
        mVar.H = this.I;
        mVar.I = this.J;
        mVar.J = this.K;
        mVar.K = this.L;
        mVar.L = this.M;
        return mVar;
    }

    public final boolean b(n nVar) {
        List list = this.q;
        if (list.size() != nVar.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) nVar.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final n d(n nVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == nVar) {
            return this;
        }
        int i3 = f0.i(this.n);
        String str3 = nVar.a;
        d31 d31Var = nVar.c;
        int i4 = nVar.K;
        int i5 = nVar.L;
        String str4 = nVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (d31Var.isEmpty()) {
            d31Var = this.c;
        }
        if ((i3 != 3 && i3 != 1) || (str = nVar.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = nVar.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = nVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strT = x.t(nVar.k, i3);
            if (x.W(strT).length == 1) {
                str5 = strT;
            }
        }
        d0 d0VarB = nVar.l;
        d0 d0Var = this.l;
        if (d0Var != null) {
            d0VarB = d0Var.b(d0VarB);
        }
        float f = this.w;
        if (f == -1.0f && i3 == 2) {
            f = nVar.w;
        }
        int i8 = this.e | nVar.e;
        int i9 = this.f | nVar.f;
        DrmInitData drmInitData = nVar.r;
        ArrayList arrayList = new ArrayList();
        d31 d31Var2 = d31Var;
        if (drmInitData != null) {
            String str6 = drmInitData.c;
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.a;
            int length = schemeDataArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                DrmInitData.SchemeData schemeData = schemeDataArr[i11];
                int i12 = length;
                if (schemeData.e != null) {
                    arrayList.add(schemeData);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.r;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.a;
            String str7 = str2;
            int length2 = schemeDataArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                DrmInitData.SchemeData schemeData2 = schemeDataArr2[i14];
                int i15 = length2;
                if (schemeData2.e != null) {
                    UUID uuid = schemeData2.b;
                    i2 = i5;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i = size;
                            arrayList.add(schemeData2);
                            break;
                        }
                        i = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i16)).b.equals(uuid)) {
                            break;
                        }
                        i16++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i5;
                }
                i13 = i14 + 1;
                length2 = i15;
                i5 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i17 = i5;
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
        m mVarA = a();
        mVarA.a = str3;
        mVarA.b = str4;
        mVarA.c = d31.A(d31Var2);
        mVarA.d = str;
        mVarA.e = i8;
        mVarA.f = i9;
        mVarA.h = i6;
        mVarA.i = i7;
        mVarA.j = str5;
        mVarA.k = d0VarB;
        mVarA.q = drmInitData3;
        mVarA.v = f;
        mVarA.J = i4;
        mVarA.K = i17;
        return new n(mVarA);
    }

    public final int hashCode() {
        if (this.N == 0) {
            String str = this.a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iG = jc1.g(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.d;
            int iHashCode2 = (((((((((((iG + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d0 d0Var = this.l;
            int iHashCode4 = (iHashCode3 + (d0Var == null ? 0 : d0Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.N = ((((((((((((((((((((((Float.floatToIntBits(this.y) + ((((Float.floatToIntBits(this.w) + ((((((((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31)) * 31) + this.x) * 31)) * 31) + this.A) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.K) * 31) + this.L) * 31) + this.M;
        }
        return this.N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.B);
        sb.append("], [");
        sb.append(this.D);
        sb.append(", ");
        return nj.l(this.E, "])", sb);
    }

    public n(m mVar) {
        boolean z;
        String str;
        boolean z2;
        this.a = mVar.a;
        String strM = x.M(mVar.d);
        this.d = strM;
        if (mVar.c.isEmpty() && mVar.b != null) {
            this.c = d31.E(new p(strM, mVar.b));
            this.b = mVar.b;
        } else if (!mVar.c.isEmpty() && mVar.b == null) {
            d31 d31Var = mVar.c;
            this.c = d31Var;
            int size = d31Var.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = d31Var.get(i);
                    i++;
                    p pVar = (p) obj;
                    if (TextUtils.equals(pVar.a, strM)) {
                        str = pVar.b;
                        break;
                    }
                } else {
                    str = ((p) d31Var.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (mVar.c.isEmpty() && mVar.b == null) {
                z = true;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 < mVar.c.size()) {
                    if (((p) mVar.c.get(i2)).b.equals(mVar.b)) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            a.i(z);
            this.c = mVar.c;
            this.b = mVar.b;
        }
        this.e = mVar.e;
        if (mVar.g != 0 && (mVar.f & 32768) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        a.h("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = mVar.f;
        this.g = mVar.g;
        int i3 = mVar.h;
        this.h = i3;
        int i4 = mVar.i;
        this.i = i4;
        this.j = i4 != -1 ? i4 : i3;
        this.k = mVar.j;
        this.l = mVar.k;
        this.m = mVar.l;
        this.n = mVar.m;
        this.o = mVar.n;
        this.p = mVar.o;
        List list = mVar.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = mVar.q;
        this.r = drmInitData;
        this.s = mVar.r;
        this.t = mVar.s;
        this.u = mVar.t;
        this.v = mVar.u;
        this.w = mVar.v;
        int i5 = mVar.w;
        this.x = i5 == -1 ? 0 : i5;
        float f = mVar.x;
        this.y = f == -1.0f ? 1.0f : f;
        this.z = mVar.y;
        this.A = mVar.z;
        this.B = mVar.A;
        this.C = mVar.B;
        this.D = mVar.C;
        this.E = mVar.D;
        this.F = mVar.E;
        int i6 = mVar.F;
        this.G = i6 == -1 ? 0 : i6;
        int i7 = mVar.G;
        this.H = i7 != -1 ? i7 : 0;
        this.I = mVar.H;
        this.J = mVar.I;
        this.K = mVar.J;
        this.L = mVar.K;
        int i8 = mVar.L;
        if (i8 == 0 && drmInitData != null) {
            this.M = 1;
        } else {
            this.M = i8;
        }
    }
}
