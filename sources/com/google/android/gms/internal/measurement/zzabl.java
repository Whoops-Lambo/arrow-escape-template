package com.google.android.gms.internal.measurement;

import defpackage.ul3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzabl extends zzabp {
    public static final zzabl b = new zzabl();

    @Override // com.google.android.gms.internal.measurement.zzabp
    public final int c(zzyy zzyyVar, int i, String str, int i2, int i3, int i4) {
        int i5;
        zzza zzzaVar;
        int i6;
        zzza zzzaVar2;
        zzabh zzabgVar;
        zzabh ul3Var;
        char cCharAt = str.charAt(i4);
        int i7 = cCharAt & ' ';
        int i8 = 1;
        boolean z = i7 == 0;
        zzza zzzaVar3 = zzza.e;
        int i9 = 128;
        char c = ' ';
        int i10 = i3;
        if (i10 != i4 || z) {
            int i11 = true != z ? 0 : 128;
            while (true) {
                if (i10 != i4) {
                    int i12 = i10 + 1;
                    i5 = i8;
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 >= c && cCharAt2 <= '0') {
                        int i13 = ((int) ((zzza.d >>> ((cCharAt2 - ' ') * 3)) & 7)) - 1;
                        if (i13 >= 0) {
                            int i14 = i5 << i13;
                            if ((i11 & i14) != 0) {
                                throw zzabo.b("repeated flag", str, i10);
                            }
                            i11 |= i14;
                            i8 = i5;
                            i10 = i12;
                            c = ' ';
                        } else {
                            if (cCharAt2 != '.') {
                                throw zzabo.b("invalid flag", str, i10);
                            }
                            zzzaVar2 = new zzza(i11, -1, zzza.e(i12, i4, str));
                        }
                    } else {
                        if (cCharAt2 > '9') {
                            throw zzabo.b("invalid flag", str, i10);
                        }
                        int i15 = cCharAt2 - '0';
                        while (true) {
                            if (i6 == i4) {
                                i6 = i12;
                                zzzaVar2 = new zzza(i11, i15, -1);
                            } else {
                                int i16 = i6 + 1;
                                char cCharAt3 = str.charAt(i6);
                                if (cCharAt3 == '.') {
                                    i6 = i12;
                                    zzzaVar = new zzza(i11, i15, zzza.e(i16, i4, str));
                                    break;
                                }
                                char c2 = (char) (cCharAt3 - '0');
                                if (c2 >= '\n') {
                                    i6 = i12;
                                    throw zzabo.b("invalid width character", str, i6);
                                }
                                i15 = (i15 * 10) + c2;
                                if (i15 > 999999) {
                                    i6 = i12;
                                    throw zzabo.a("width too large", str, i10, i4);
                                }
                                i6 = i12;
                                i6 = i16;
                                i9 = 128;
                            }
                        }
                    }
                    zzzaVar = zzzaVar2;
                    break;
                }
                i5 = i8;
                zzzaVar = new zzza(i11, -1, -1);
                break;
            }
        }
        zzzaVar = zzza.e;
        i5 = 1;
        zzyz zzyzVar = zzyz.f[(cCharAt | ' ') - 97];
        if (i7 == 0 && (zzyzVar == null || (zzyzVar.c & i9) == 0)) {
            zzyzVar = null;
        }
        int i17 = i4 + 1;
        if (zzyzVar != null) {
            zzzaVar.getClass();
            if (!zzzaVar.b(zzyzVar.c, zzyzVar.b.a)) {
                throw zzabo.a("invalid format specifier", str, i2, i17);
            }
            if (i < 10) {
                Map map = zzabj.d;
                if (zzzaVar.a()) {
                    zzabh[] zzabhVarArr = (zzabj[]) zzabj.d.get(zzyzVar);
                    zzabr.a(zzabhVarArr, "default parameter");
                    zzabgVar = zzabhVarArr[i];
                }
            }
            ul3Var = new zzabj(i, zzyzVar, zzzaVar);
            zzabgVar = ul3Var;
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!zzzaVar.b(160, false)) {
                throw zzabo.a("invalid format specification", str, i2, i17);
            }
            int i18 = i4 + 2;
            if (i18 > str.length()) {
                throw zzabo.b("truncated format specifier", str, i2);
            }
            zzabf zzabfVar = (zzabf) zzabf.b.get(Character.valueOf(str.charAt(i17)));
            if (zzabfVar == null) {
                throw zzabo.b("illegal date/time conversion", str, i17);
            }
            zzabgVar = new zzabg(zzzaVar, i, zzabfVar);
            i17 = i18;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw zzabo.a("invalid format specification", str, i2, i17);
            }
            if (!zzzaVar.b(160, false)) {
                throw zzabo.a("invalid format specification", str, i2, i17);
            }
            ul3Var = new ul3(zzzaVar, i);
            zzabgVar = ul3Var;
        }
        int i19 = zzabgVar.a;
        if (i19 < 32) {
            zzyyVar.b |= i5 << i19;
        }
        zzyyVar.c = Math.max(zzyyVar.c, i19);
        zzaaf zzaafVar = zzyyVar.a;
        zzabn zzabnVar = zzaafVar.a;
        StringBuilder sb = zzyyVar.e;
        zzabnVar.b(zzyyVar.f, i2, zzaafVar.b, sb);
        Object[] objArr = zzyyVar.d;
        int i20 = zzabgVar.a;
        if (i20 < objArr.length) {
            Object obj = objArr[i20];
            if (obj != null) {
                zzabgVar.a(zzyyVar, obj);
            } else {
                sb.append("null");
            }
        } else {
            sb.append("[ERROR: MISSING LOG ARGUMENT]");
        }
        zzyyVar.f = i17;
        return i17;
    }

    private zzabl() {
    }
}
