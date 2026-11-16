package defpackage;

import com.google.android.gms.internal.ads.zzhoi;
import com.google.android.gms.internal.ads.zzied;
import com.google.android.gms.internal.ads.zziee;
import com.google.android.gms.internal.ads.zzief;
import com.google.android.gms.internal.ads.zzieg;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziek;
import com.google.android.gms.internal.ads.zzifa;
import com.google.android.gms.internal.ads.zzifb;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cw4 extends zziek {
    public static final zziee b(zzifa zzifaVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            String strK = zzifaVar.k();
            if (zzhoi.a(strK)) {
                return new zziei(strK);
            }
            dr0.h("illegal characters in string");
            return null;
        }
        if (i2 == 6) {
            return new zziei(new dw4(zzifaVar.k()));
        }
        boolean z = true;
        if (i2 != 7) {
            if (i2 != 8) {
                e32.i("Unexpected token: ".concat(zzifb.a(i)));
                return null;
            }
            int iD = zzifaVar.g;
            if (iD == 0) {
                iD = zzifaVar.d();
            }
            if (iD != 7) {
                throw zzifaVar.U("null");
            }
            zzifaVar.g = 0;
            int[] iArr = zzifaVar.m;
            int i3 = zzifaVar.k - 1;
            iArr[i3] = iArr[i3] + 1;
            return zzief.a;
        }
        int iD2 = zzifaVar.g;
        if (iD2 == 0) {
            iD2 = zzifaVar.d();
        }
        if (iD2 == 5) {
            zzifaVar.g = 0;
            int[] iArr2 = zzifaVar.m;
            int i4 = zzifaVar.k - 1;
            iArr2[i4] = iArr2[i4] + 1;
        } else {
            if (iD2 != 6) {
                throw zzifaVar.U("a boolean");
            }
            zzifaVar.g = 0;
            int[] iArr3 = zzifaVar.m;
            int i5 = zzifaVar.k - 1;
            iArr3[i5] = iArr3[i5] + 1;
            z = false;
        }
        return new zziei(Boolean.valueOf(z));
    }

    public static final zziee c(zzifa zzifaVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            int iD = zzifaVar.g;
            if (iD == 0) {
                iD = zzifaVar.d();
            }
            if (iD != 3) {
                throw zzifaVar.U("BEGIN_ARRAY");
            }
            zzifaVar.K(1);
            zzifaVar.m[zzifaVar.k - 1] = 0;
            zzifaVar.g = 0;
            return new zzied();
        }
        if (i2 != 2) {
            return null;
        }
        int iD2 = zzifaVar.g;
        if (iD2 == 0) {
            iD2 = zzifaVar.d();
        }
        if (iD2 != 1) {
            throw zzifaVar.U("BEGIN_OBJECT");
        }
        zzifaVar.K(3);
        zzifaVar.g = 0;
        return new zzieg();
    }

    public static final zziee a(zzifa zzifaVar) throws IOException {
        String strT;
        zziee zzieeVarB;
        int iQ = zzifaVar.q();
        zziee zzieeVarC = c(zzifaVar, iQ);
        if (zzieeVarC == null) {
            return b(zzifaVar, iQ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iD = zzifaVar.g;
            if (iD == 0) {
                iD = zzifaVar.d();
            }
            if (iD != 2 && iD != 4 && iD != 17) {
                if (zzieeVarC instanceof zzieg) {
                    int iD2 = zzifaVar.g;
                    if (iD2 == 0) {
                        iD2 = zzifaVar.d();
                    }
                    if (iD2 == 14) {
                        strT = zzifaVar.G();
                    } else if (iD2 == 12) {
                        strT = zzifaVar.t('\'');
                    } else if (iD2 == 13) {
                        strT = zzifaVar.t('\"');
                    } else {
                        throw zzifaVar.U("a name");
                    }
                    zzifaVar.g = 0;
                    zzifaVar.l[zzifaVar.k - 1] = strT;
                    if (!zzhoi.a(strT)) {
                        dr0.h("illegal characters in string");
                        return null;
                    }
                } else {
                    strT = null;
                }
                int iQ2 = zzifaVar.q();
                zziee zzieeVarC2 = c(zzifaVar, iQ2);
                if (zzieeVarC2 == null) {
                    zzieeVarB = b(zzifaVar, iQ2);
                } else {
                    zzieeVarB = zzieeVarC2;
                }
                if (zzieeVarC instanceof zzied) {
                    ((zzied) zzieeVarC).a.add(zzieeVarB);
                } else {
                    zzieg zziegVar = (zzieg) zzieeVarC;
                    if (!zziegVar.a.containsKey(strT)) {
                        zziegVar.a.put(strT, zzieeVarB);
                    } else {
                        dr0.h("duplicate key: ".concat(String.valueOf(strT)));
                        return null;
                    }
                }
                if (zzieeVarC2 != null) {
                    arrayDeque.addLast(zzieeVarC);
                    if (arrayDeque.size() <= 100) {
                        zzieeVarC = zzieeVarB;
                    } else {
                        dr0.h("too many recursions");
                        return null;
                    }
                } else {
                    continue;
                }
            } else {
                boolean z = zzieeVarC instanceof zzied;
                int iD3 = zzifaVar.g;
                if (z) {
                    if (iD3 == 0) {
                        iD3 = zzifaVar.d();
                    }
                    if (iD3 == 4) {
                        int i = zzifaVar.k;
                        zzifaVar.k = i - 1;
                        int[] iArr = zzifaVar.m;
                        int i2 = i - 2;
                        iArr[i2] = iArr[i2] + 1;
                        zzifaVar.g = 0;
                    } else {
                        throw zzifaVar.U("END_ARRAY");
                    }
                } else {
                    if (iD3 == 0) {
                        iD3 = zzifaVar.d();
                    }
                    if (iD3 == 2) {
                        int i3 = zzifaVar.k;
                        int i4 = i3 - 1;
                        zzifaVar.k = i4;
                        zzifaVar.l[i4] = null;
                        int[] iArr2 = zzifaVar.m;
                        int i5 = i3 - 2;
                        iArr2[i5] = iArr2[i5] + 1;
                        zzifaVar.g = 0;
                    } else {
                        throw zzifaVar.U("END_OBJECT");
                    }
                }
                if (arrayDeque.isEmpty()) {
                    return zzieeVarC;
                }
                zzieeVarC = (zziee) arrayDeque.removeLast();
            }
        }
    }
}
