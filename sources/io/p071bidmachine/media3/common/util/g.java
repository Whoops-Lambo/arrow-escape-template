package io.p071bidmachine.media3.common.util;

import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.extractor.ts.TsExtractor;
import com.facebook.appevents.t;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaql;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzaqu;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzaqz;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzarb;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzarp;
import com.google.android.gms.internal.ads.zzarq;
import com.google.android.gms.internal.ads.zzars;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzasd;
import com.google.android.gms.internal.ads.zzase;
import com.google.android.gms.internal.ads.zzet;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfn;
import defpackage.a50;
import defpackage.hf2;
import defpackage.wx2;
import io.p071bidmachine.displays.mapper.a;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.extractor.o;
import io.p071bidmachine.media3.extractor.ts.b0;
import io.p071bidmachine.media3.extractor.ts.d0;
import io.p071bidmachine.media3.extractor.ts.e0;
import io.p071bidmachine.media3.extractor.ts.f0;
import io.p071bidmachine.media3.extractor.ts.g0;
import io.p071bidmachine.media3.extractor.x;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements b0, zzarp {
    public final int a;
    public final Object b;
    public final Object c;
    public final Cloneable d;
    public final Object e;

    @Override // com.google.android.gms.internal.ads.zzarp
    public void a(zzfn zzfnVar, zzagr zzagrVar, zzasd zzasdVar) {
    }

    @Override // io.p071bidmachine.media3.extractor.ts.b0
    public void d(v vVar, o oVar, f0 f0Var) {
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    @Override // io.p071bidmachine.media3.extractor.ts.b0
    public void c(q qVar) {
        v vVar;
        v vVar2;
        SparseArray sparseArray;
        int i;
        p pVar;
        char c;
        SparseArray sparseArray2 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        p pVar2 = (p) this.b;
        d0 d0Var = (d0) this.e;
        SparseArray sparseArray3 = d0Var.h;
        SparseBooleanArray sparseBooleanArray = d0Var.i;
        t tVar = d0Var.f;
        List list = d0Var.c;
        int i2 = d0Var.a;
        if (qVar.t() != 2) {
            return;
        }
        if (i2 == 1 || i2 == 2 || d0Var.n == 1) {
            vVar = (v) list.get(0);
        } else {
            vVar = new v(((v) list.get(0)).d());
            list.add(vVar);
        }
        if ((qVar.t() & 128) == 0) {
            return;
        }
        qVar.G(1);
        int iZ = qVar.z();
        qVar.G(3);
        qVar.e(pVar2.b, 0, 2);
        pVar2.q(0);
        pVar2.t(3);
        d0Var.t = pVar2.i(13);
        qVar.e(pVar2.b, 0, 2);
        pVar2.q(0);
        pVar2.t(4);
        qVar.G(pVar2.i(12));
        if (i2 == 2 && d0Var.r == null) {
            g0 g0VarG = tVar.g(21, new hf2(21, null, 0, null, x.c));
            d0Var.r = g0VarG;
            if (g0VarG != null) {
                g0VarG.d(vVar, d0Var.m, new f0(iZ, 21, 8192));
            }
        }
        sparseArray2.clear();
        sparseIntArray.clear();
        int iA = qVar.a();
        while (iA > 0) {
            qVar.e(pVar2.b, 0, 5);
            pVar2.q(0);
            int i3 = pVar2.i(8);
            pVar2.t(3);
            int i4 = pVar2.i(13);
            pVar2.t(4);
            int i5 = pVar2.i(12);
            int i6 = qVar.b;
            int i7 = i6 + i5;
            int i8 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iT = 0;
            int i9 = iA;
            while (true) {
                if (qVar.b >= i7) {
                    pVar = pVar2;
                    break;
                }
                int iT2 = qVar.t();
                pVar = pVar2;
                int iT3 = qVar.b + qVar.t();
                if (iT3 > i7) {
                    break;
                }
                SparseArray sparseArray4 = sparseArray3;
                if (iT2 == 5) {
                    long jV = qVar.v();
                    if (jV == 1094921523) {
                        i8 = 129;
                    } else if (jV == 1161904947) {
                        i8 = 135;
                    } else if (jV == 1094921524) {
                        i8 = 172;
                    } else if (jV == 1212503619) {
                        i8 = 36;
                    }
                } else if (iT2 == 106) {
                    iT3 = iT3;
                    i8 = 129;
                } else if (iT2 == 122) {
                    i8 = 135;
                    iT3 = iT3;
                } else if (iT2 == 127) {
                    int iT4 = qVar.t();
                    if (iT4 == 21) {
                        i8 = 172;
                    } else if (iT4 == 14) {
                        i8 = 136;
                    } else if (iT4 == 33) {
                        i8 = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                    }
                } else if (iT2 == 123) {
                    i8 = 138;
                } else if (iT2 == 10) {
                    strTrim = qVar.r(3, StandardCharsets.UTF_8).trim();
                    iT = qVar.t();
                } else if (iT2 == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (qVar.b < iT3) {
                        String strTrim2 = qVar.r(3, StandardCharsets.UTF_8).trim();
                        qVar.t();
                        v vVar3 = vVar;
                        byte[] bArr = new byte[4];
                        qVar.e(bArr, 0, 4);
                        arrayList2.add(new e0(strTrim2, bArr));
                        vVar = vVar3;
                        iT3 = iT3;
                        iZ = iZ;
                    }
                    iT3 = iT3;
                    iZ = iZ;
                    vVar = vVar;
                    arrayList = arrayList2;
                    i8 = 89;
                } else {
                    iT3 = iT3;
                    iZ = iZ;
                    vVar = vVar;
                    if (iT2 == 111) {
                        i8 = 257;
                    }
                }
                qVar.G(iT3 - qVar.b);
                vVar = vVar;
                pVar2 = pVar;
                sparseArray3 = sparseArray4;
                iZ = iZ;
            }
            SparseArray sparseArray5 = sparseArray3;
            int i10 = iZ;
            v vVar4 = vVar;
            qVar.F(i7);
            hf2 hf2Var = new hf2(i8, strTrim, iT, arrayList, Arrays.copyOfRange(qVar.a, i6, i7));
            if (i3 == 6 || i3 == 5) {
                i3 = i8;
            }
            int i11 = i9 - (i5 + 5);
            int i12 = i2 == 2 ? i3 : i4;
            if (sparseBooleanArray.get(i12)) {
                c = 21;
            } else {
                c = 21;
                g0 g0VarG2 = (i2 == 2 && i3 == 21) ? d0Var.r : tVar.g(i3, hf2Var);
                if (i2 != 2 || i4 < sparseIntArray.get(i12, 8192)) {
                    sparseIntArray.put(i12, i4);
                    sparseArray2.put(i12, g0VarG2);
                }
            }
            iA = i11;
            vVar = vVar4;
            pVar2 = pVar;
            sparseArray3 = sparseArray5;
            iZ = i10;
        }
        SparseArray sparseArray6 = sparseArray3;
        int i13 = iZ;
        v vVar5 = vVar;
        int size = sparseIntArray.size();
        int i14 = 0;
        while (i14 < size) {
            int iKeyAt = sparseIntArray.keyAt(i14);
            int iValueAt = sparseIntArray.valueAt(i14);
            sparseBooleanArray.put(iKeyAt, true);
            d0Var.j.put(iValueAt, true);
            g0 g0Var = (g0) sparseArray2.valueAt(i14);
            if (g0Var != null) {
                if (g0Var != d0Var.r) {
                    i = i13;
                    vVar2 = vVar5;
                    g0Var.d(vVar2, d0Var.m, new f0(i, iKeyAt, 8192));
                } else {
                    vVar2 = vVar5;
                    i = i13;
                }
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, g0Var);
            } else {
                vVar2 = vVar5;
                sparseArray = sparseArray6;
                i = i13;
            }
            i14++;
            sparseArray6 = sparseArray;
            i13 = i;
            vVar5 = vVar2;
        }
        SparseArray sparseArray7 = sparseArray6;
        if (i2 == 2) {
            if (d0Var.o) {
                return;
            }
            d0Var.m.endTracks();
            d0Var.n = 0;
            d0Var.o = true;
            return;
        }
        sparseArray7.remove(this.a);
        int i15 = i2 == 1 ? 0 : d0Var.n - 1;
        d0Var.n = i15;
        if (i15 == 0) {
            d0Var.m.endTracks();
            d0Var.o = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:120:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:121:0x030f  */
    /* JADX WARN: Code duplicated, block: B:124:0x032d  */
    /* JADX WARN: Code duplicated, block: B:19:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x014d A[PHI: r22 r23
  0x014d: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v1 java.lang.String), (r22v1 java.lang.String) binds: [B:52:0x013e, B:45:0x0125, B:28:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r23v3 int) = (r23v2 int), (r23v1 int), (r23v1 int) binds: [B:52:0x013e, B:45:0x0125, B:28:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    @Override // com.google.android.gms.internal.ads.zzarp
    public void e(zzey zzeyVar) {
        SparseArray sparseArray;
        zzasb zzasbVar;
        String str;
        int i;
        zzase zzariVar;
        zzase zzariVar2;
        int i2;
        if (zzeyVar.K() != 2) {
            return;
        }
        zzarz zzarzVar = (zzarz) this.e;
        List list = zzarzVar.b;
        SparseArray sparseArray2 = zzarzVar.g;
        SparseBooleanArray sparseBooleanArray = zzarzVar.h;
        int i3 = 0;
        zzfn zzfnVar = (zzfn) list.get(0);
        if ((zzeyVar.K() & 128) != 0) {
            zzeyVar.G(1);
            int iL = zzeyVar.L();
            int i4 = 3;
            zzeyVar.G(3);
            zzet zzetVar = (zzet) this.b;
            zzeyVar.H(0, 2, zzetVar.a);
            zzetVar.d(0);
            zzetVar.f(3);
            int i5 = 13;
            zzarzVar.p = zzetVar.h(13);
            zzeyVar.H(0, 2, zzetVar.a);
            zzetVar.d(0);
            int i6 = 4;
            zzetVar.f(4);
            zzeyVar.G(zzetVar.h(12));
            SparseArray sparseArray3 = (SparseArray) this.c;
            sparseArray3.clear();
            SparseIntArray sparseIntArray = (SparseIntArray) this.d;
            sparseIntArray.clear();
            int iB = zzeyVar.B();
            while (iB > 0) {
                zzeyVar.H(i3, 5, zzetVar.a);
                zzetVar.d(i3);
                int iH = zzetVar.h(8);
                zzetVar.f(i4);
                int iH2 = zzetVar.h(i5);
                zzetVar.f(i6);
                int iH3 = zzetVar.h(12);
                int i7 = zzeyVar.b;
                int i8 = i7 + iH3;
                String strTrim = null;
                ArrayList arrayList = null;
                int i9 = -1;
                int iK = 0;
                while (zzeyVar.b < i8) {
                    int iK2 = zzeyVar.K();
                    int iK3 = zzeyVar.b + zzeyVar.K();
                    if (iK3 > i8) {
                        SparseArray sparseArray4 = sparseArray2;
                        zzet zzetVar2 = zzetVar;
                        zzeyVar.E(i8);
                        zzasbVar = new zzasb(i9, strTrim, iK, arrayList, Arrays.copyOfRange(zzeyVar.a, i7, i8));
                        str = strTrim;
                        if (iH != 6 || iH == 5) {
                            iH = i9;
                        }
                        iB -= iH3 + 5;
                        if (sparseBooleanArray.get(iH2)) {
                            i6 = 4;
                            i = 3;
                        } else {
                            zzaqm zzaqmVar = zzarzVar.e;
                            zzaqmVar.getClass();
                            if (iH != 2) {
                                i = 3;
                                i6 = 4;
                                if (iH != 3 || iH == 4) {
                                    zzariVar2 = new zzari(new zzarb(str, zzasbVar.a(), "video/mp2t"));
                                } else {
                                    if (iH == 21) {
                                        zzariVar = new zzari(new zzaqz());
                                    } else if (iH == 27) {
                                        zzariVar = new zzari(new zzaqw(new zzars(zzaqmVar.a(zzasbVar))));
                                    } else if (iH == 36) {
                                        zzariVar = new zzari(new zzaqy(new zzars(zzaqmVar.a(zzasbVar))));
                                    } else if (iH == 45) {
                                        zzariVar = new zzari(new zzarc());
                                    } else if (iH == 89) {
                                        zzariVar = new zzari(new zzaqo(zzasbVar.b));
                                    } else if (iH == 172) {
                                        zzariVar2 = new zzari(new zzaqi(str, zzasbVar.a(), "video/mp2t"));
                                    } else if (iH == 257) {
                                        zzariVar = new zzarq(new zzarh("application/vnd.dvb.ait"));
                                    } else if (iH != 128) {
                                        if (iH == 129) {
                                            zzariVar2 = new zzari(new zzaqf(str, zzasbVar.a(), "video/mp2t"));
                                        } else if (iH == 138) {
                                            zzariVar2 = new zzari(new zzaqn(str, zzasbVar.a(), 4096));
                                        } else if (iH != 139) {
                                            switch (iH) {
                                                case 15:
                                                    zzariVar2 = new zzari(new zzaql(false, str, zzasbVar.a(), "video/mp2t"));
                                                    break;
                                                case 16:
                                                    zzariVar = new zzari(new zzaqu(new wx2(zzaqmVar.a(zzasbVar))));
                                                    break;
                                                case 17:
                                                    zzariVar2 = new zzari(new zzara(str, zzasbVar.a()));
                                                    break;
                                                default:
                                                    switch (iH) {
                                                        case 134:
                                                            zzariVar = new zzarq(new zzarh("application/x-scte35"));
                                                            break;
                                                        case 135:
                                                            zzariVar2 = new zzari(new zzaqf(str, zzasbVar.a(), "video/mp2t"));
                                                            break;
                                                        case 136:
                                                            zzariVar2 = new zzari(new zzaqn(str, zzasbVar.a(), 4096));
                                                            break;
                                                        default:
                                                            zzariVar = null;
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            zzariVar2 = new zzari(new zzaqn(str, zzasbVar.a(), 5408));
                                        }
                                    }
                                    sparseIntArray.put(iH2, iH2);
                                    sparseArray3.put(iH2, zzariVar);
                                }
                                zzariVar = zzariVar2;
                                sparseIntArray.put(iH2, iH2);
                                sparseArray3.put(iH2, zzariVar);
                            } else {
                                i6 = 4;
                                i = 3;
                            }
                            zzariVar = new zzari(new zzaqr(new wx2(zzaqmVar.a(zzasbVar)), "video/mp2t"));
                            sparseIntArray.put(iH2, iH2);
                            sparseArray3.put(iH2, zzariVar);
                        }
                        i4 = i;
                        zzetVar = zzetVar2;
                        sparseArray2 = sparseArray4;
                        i3 = 0;
                        i5 = 13;
                    } else {
                        zzet zzetVar3 = zzetVar;
                        if (iK2 == 5) {
                            long jP = zzeyVar.P();
                            if (jP == 1094921523) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 129;
                            } else if (jP == 1161904947) {
                                i9 = 135;
                                i2 = iK3;
                            } else if (jP == 1094921524) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 172;
                            } else if (jP == 1212503619) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 36;
                            } else {
                                i2 = iK3;
                            }
                        } else if (iK2 == 106) {
                            sparseArray2 = sparseArray2;
                            i2 = iK3;
                            i9 = 129;
                        } else {
                            if (iK2 == 122) {
                                i9 = 135;
                            } else if (iK2 == 127) {
                                int iK4 = zzeyVar.K();
                                if (iK4 == 21) {
                                    sparseArray2 = sparseArray2;
                                    i2 = iK3;
                                    i9 = 172;
                                } else if (iK4 == 14) {
                                    i9 = 136;
                                } else if (iK4 == 33) {
                                    sparseArray2 = sparseArray2;
                                    i2 = iK3;
                                    i9 = TsExtractor.TS_STREAM_TYPE_DTS_UHD;
                                }
                            } else if (iK2 == 123) {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                i9 = 138;
                            } else if (iK2 == 10) {
                                strTrim = zzeyVar.k(3, StandardCharsets.UTF_8).trim();
                                iK = zzeyVar.K();
                            } else if (iK2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (zzeyVar.b < iK3) {
                                    String strTrim2 = zzeyVar.k(3, StandardCharsets.UTF_8).trim();
                                    zzeyVar.K();
                                    byte[] bArr = new byte[4];
                                    zzeyVar.H(0, 4, bArr);
                                    arrayList2.add(new zzasa(strTrim2, bArr));
                                    iK3 = iK3;
                                    sparseArray2 = sparseArray2;
                                }
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                arrayList = arrayList2;
                                i9 = 89;
                            } else {
                                sparseArray2 = sparseArray2;
                                i2 = iK3;
                                if (iK2 == 111) {
                                    i9 = 257;
                                }
                            }
                            i2 = iK3;
                        }
                        zzeyVar.G(i2 - zzeyVar.b);
                        zzetVar = zzetVar3;
                        sparseArray2 = sparseArray2;
                    }
                }
                SparseArray sparseArray5 = sparseArray2;
                zzet zzetVar4 = zzetVar;
                zzeyVar.E(i8);
                zzasbVar = new zzasb(i9, strTrim, iK, arrayList, Arrays.copyOfRange(zzeyVar.a, i7, i8));
                str = strTrim;
                if (iH != 6) {
                    iH = i9;
                } else {
                    iH = i9;
                }
                iB -= iH3 + 5;
                if (sparseBooleanArray.get(iH2)) {
                    zzaqm zzaqmVar2 = zzarzVar.e;
                    zzaqmVar2.getClass();
                    if (iH != 2) {
                        i = 3;
                        i6 = 4;
                        if (iH != 3) {
                            zzariVar2 = new zzari(new zzarb(str, zzasbVar.a(), "video/mp2t"));
                            zzariVar = zzariVar2;
                        } else {
                            zzariVar2 = new zzari(new zzarb(str, zzasbVar.a(), "video/mp2t"));
                            zzariVar = zzariVar2;
                        }
                        sparseIntArray.put(iH2, iH2);
                        sparseArray3.put(iH2, zzariVar);
                    } else {
                        i6 = 4;
                        i = 3;
                    }
                    zzariVar = new zzari(new zzaqr(new wx2(zzaqmVar2.a(zzasbVar)), "video/mp2t"));
                    sparseIntArray.put(iH2, iH2);
                    sparseArray3.put(iH2, zzariVar);
                } else {
                    i6 = 4;
                    i = 3;
                }
                i4 = i;
                zzetVar = zzetVar4;
                sparseArray2 = sparseArray5;
                i3 = 0;
                i5 = 13;
            }
            SparseArray sparseArray6 = sparseArray2;
            int size = sparseIntArray.size();
            int i10 = 0;
            while (i10 < size) {
                int iKeyAt = sparseIntArray.keyAt(i10);
                int iValueAt = sparseIntArray.valueAt(i10);
                sparseBooleanArray.put(iKeyAt, true);
                zzarzVar.i.put(iValueAt, true);
                zzase zzaseVar = (zzase) sparseArray3.valueAt(i10);
                if (zzaseVar != null) {
                    zzaseVar.a(zzfnVar, zzarzVar.l, new zzasd(iL, iKeyAt, 8192));
                    sparseArray = sparseArray6;
                    sparseArray.put(iValueAt, zzaseVar);
                } else {
                    sparseArray = sparseArray6;
                }
                i10++;
                sparseArray6 = sparseArray;
            }
            sparseArray6.remove(this.a);
            zzarzVar.l.zzw();
            zzarzVar.m = true;
        }
    }

    public int f(String str) throws h {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        a.d();
        return iGlGetAttribLocation;
    }

    public g(String str, String str2) throws h {
        boolean z;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        a.d();
        b(iGlCreateProgram, 35633, str);
        b(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        } else {
            z = false;
        }
        a.e(z, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            a aVar = new a(5);
            ((a[]) this.b)[i] = aVar;
            ((HashMap) this.d).put(str3, aVar);
        }
        this.e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.c = new a[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i8 = 0; i8 < i7; i8++) {
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            a aVar2 = new a(6);
            ((a[]) this.c)[i5] = aVar2;
            ((HashMap) this.e).put(str4, aVar2);
        }
        a.d();
    }

    public static void b(int i, int i2, String str) throws h {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        a.e(z, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        a.d();
    }

    public g(zzarz zzarzVar, int i) {
        Objects.requireNonNull(zzarzVar);
        this.e = zzarzVar;
        this.b = new zzet(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(x xVar, w wVar, byte[] bArr, a50[] a50VarArr, int i) {
        this.b = xVar;
        this.c = wVar;
        this.d = bArr;
        this.e = a50VarArr;
        this.a = i;
    }

    public g(d0 d0Var, int i) {
        this.e = d0Var;
        this.b = new p(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i;
    }
}
