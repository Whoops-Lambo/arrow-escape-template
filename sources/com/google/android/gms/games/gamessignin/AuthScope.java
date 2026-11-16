package com.google.android.gms.games.gamessignin;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.internal.games_v2.zzfu;
import com.google.android.gms.internal.games_v2.zzgx;
import com.google.android.gms.internal.games_v2.zzhd;
import com.google.android.gms.internal.games_v2.zzhf;
import com.google.android.gms.internal.games_v2.zzhg;
import com.google.android.gms.internal.games_v2.zzhk;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.d;
import defpackage.iu4;
import defpackage.nm4;
import defpackage.qb5;
import defpackage.rx4;
import defpackage.ur4;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum AuthScope {
    EMAIL("email"),
    PROFILE(Scopes.PROFILE),
    OPEN_ID(Scopes.OPEN_ID),
    GAMES_LITE(Scopes.GAMES_LITE),
    DRIVE_APP_FOLDER(Scopes.DRIVE_APPFOLDER);

    private static final zzhg zzd;
    private final String zzc;

    /* JADX WARN: Code duplicated, block: B:83:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    static {
        boolean z;
        int i;
        char c;
        ?? r5;
        char c2;
        short[] sArr;
        boolean z2;
        int i2;
        ?? r16;
        boolean z3;
        ?? r6;
        rx4 rx4Var;
        boolean z4;
        boolean z5 = false;
        int i3 = 1;
        char c3 = 2;
        zzhf zzhfVar = new zzhf();
        for (AuthScope authScope : values()) {
            String str = authScope.zzc;
            int i4 = zzhfVar.b + 1;
            Object[] objArr = zzhfVar.a;
            int length = objArr.length;
            int i5 = i4 + i4;
            if (i5 > length) {
                zzhfVar.a = Arrays.copyOf(objArr, zzgx.a(length, i5));
            }
            if (str == null) {
                d.w("null key in entry: null=".concat(String.valueOf(authScope)));
                return;
            }
            Object[] objArr2 = zzhfVar.a;
            int i6 = zzhfVar.b;
            int i7 = i6 + i6;
            objArr2[i7] = str;
            objArr2[i7 + 1] = authScope;
            zzhfVar.b = i6 + 1;
        }
        iu4 iu4Var = zzhfVar.c;
        if (iu4Var != null) {
            throw iu4Var.a();
        }
        int i8 = zzhfVar.b;
        Object[] objArrCopyOf = zzhfVar.a;
        if (i8 == 0) {
            rx4Var = rx4.g;
        } else {
            rx4 rx4Var2 = rx4.g;
            iu4 iu4Var2 = null;
            ?? r7 = 0;
            iu4 iu4Var3 = null;
            iu4 iu4Var4 = null;
            if (i8 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                rx4Var = new rx4(1, null, objArrCopyOf);
            } else {
                zzfu.b(i8, objArrCopyOf.length >> 1);
                int iZzf = zzhk.zzf(i8);
                if (i8 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    z4 = false;
                    i8 = 1;
                    i = 1;
                } else {
                    int i9 = iZzf - 1;
                    if (iZzf <= 128) {
                        byte[] bArr = new byte[iZzf];
                        Arrays.fill(bArr, (byte) -1);
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < i8) {
                            int i12 = i11 + i11;
                            int i13 = i10 + i10;
                            Object obj = objArrCopyOf[i13];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i13 ^ i3];
                            Objects.requireNonNull(obj2);
                            int iT = qb5.t(obj.hashCode());
                            while (true) {
                                int i14 = iT & i9;
                                z2 = z5;
                                i2 = i3;
                                int i15 = bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i15 == 255) {
                                    bArr[i14] = (byte) i12;
                                    if (i11 < i10) {
                                        objArrCopyOf[i12] = obj;
                                        objArrCopyOf[i12 ^ 1] = obj2;
                                    }
                                    i11++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i15 == true ? 1 : 0])) {
                                    int i16 = ~i15;
                                    Object obj3 = objArrCopyOf[i16 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    iu4 iu4Var5 = new iu4(obj, obj2, obj3);
                                    objArrCopyOf[i16 == true ? 1 : 0] = obj2;
                                    iu4Var3 = iu4Var5;
                                    break;
                                }
                                iT = i14 + 1;
                                z5 = z2;
                                i3 = i2;
                            }
                            i10++;
                            z5 = z2;
                            i3 = i2;
                        }
                        z = z5;
                        i = i3;
                        if (i11 == i8) {
                            c = 2;
                            r5 = bArr;
                            r16 = z;
                        } else {
                            sArr = new Object[3];
                            sArr[z ? 1 : 0] = bArr;
                            sArr[i] = Integer.valueOf(i11);
                            sArr[2] = iu4Var3;
                            r7 = sArr;
                            z4 = z;
                        }
                    } else {
                        z = false;
                        i = 1;
                        if (iZzf <= 32768) {
                            sArr = new short[iZzf];
                            Arrays.fill(sArr, (short) -1);
                            int i17 = 0;
                            for (int i18 = 0; i18 < i8; i18++) {
                                int i19 = i17 + i17;
                                int i20 = i18 + i18;
                                Object obj4 = objArrCopyOf[i20];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i20 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iT2 = qb5.t(obj4.hashCode());
                                while (true) {
                                    int i21 = iT2 & i9;
                                    char c4 = (char) sArr[i21];
                                    if (c4 == 65535) {
                                        sArr[i21] = (short) i19;
                                        if (i17 < i18) {
                                            objArrCopyOf[i19] = obj4;
                                            objArrCopyOf[i19 ^ 1] = obj5;
                                        }
                                        i17++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[c4])) {
                                        int i22 = c4 ^ 1;
                                        Object obj6 = objArrCopyOf[i22 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        iu4 iu4Var6 = new iu4(obj4, obj5, obj6);
                                        objArrCopyOf[i22 == true ? 1 : 0] = obj5;
                                        iu4Var4 = iu4Var6;
                                        break;
                                    }
                                    iT2 = i21 + 1;
                                }
                            }
                            if (i17 == i8) {
                                r7 = sArr;
                                z4 = z;
                            } else {
                                r7 = new Object[]{sArr, Integer.valueOf(i17), iu4Var4};
                                z4 = z;
                            }
                        } else {
                            int[] iArr = new int[iZzf];
                            Arrays.fill(iArr, -1);
                            int i23 = 0;
                            int i24 = 0;
                            while (i23 < i8) {
                                int i25 = i24 + i24;
                                int i26 = i23 + i23;
                                Object obj7 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i26 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iT3 = qb5.t(obj7.hashCode());
                                while (true) {
                                    int i27 = iT3 & i9;
                                    int i28 = iArr[i27];
                                    if (i28 == -1) {
                                        iArr[i27] = i25;
                                        if (i24 < i23) {
                                            objArrCopyOf[i25] = obj7;
                                            objArrCopyOf[i25 ^ 1] = obj8;
                                        }
                                        i24++;
                                        c2 = c3;
                                        break;
                                    }
                                    c2 = c3;
                                    if (obj7.equals(objArrCopyOf[i28])) {
                                        int i29 = i28 ^ 1;
                                        Object obj9 = objArrCopyOf[i29];
                                        Objects.requireNonNull(obj9);
                                        iu4 iu4Var7 = new iu4(obj7, obj8, obj9);
                                        objArrCopyOf[i29] = obj8;
                                        iu4Var2 = iu4Var7;
                                        break;
                                    }
                                    iT3 = i27 + 1;
                                    c3 = c2;
                                }
                                i23++;
                                c3 = c2;
                            }
                            c = c3;
                            if (i24 == i8) {
                                r5 = iArr;
                                r16 = z;
                            } else {
                                Object[] objArr3 = new Object[3];
                                objArr3[0] = iArr;
                                objArr3[1] = Integer.valueOf(i24);
                                objArr3[c] = iu4Var2;
                                r5 = objArr3;
                                r16 = z;
                            }
                        }
                    }
                    z3 = r5 instanceof Object[];
                    r6 = r5;
                    if (z3) {
                        Object[] objArr4 = (Object[]) r5;
                        zzhfVar.c = (iu4) objArr4[c];
                        Object obj10 = objArr4[r16];
                        int iIntValue = ((Integer) objArr4[i]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                        r6 = obj10;
                        i8 = iIntValue;
                    }
                    rx4Var = new rx4(i8, r6, objArrCopyOf);
                }
                c = 2;
                r5 = r7;
                r16 = z4;
                z3 = r5 instanceof Object[];
                r6 = r5;
                if (z3) {
                    Object[] objArr5 = (Object[]) r5;
                    zzhfVar.c = (iu4) objArr5[c];
                    Object obj11 = objArr5[r16];
                    int iIntValue2 = ((Integer) objArr5[i]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
                    r6 = obj11;
                    i8 = iIntValue2;
                }
                rx4Var = new rx4(i8, r6, objArrCopyOf);
            }
        }
        iu4 iu4Var8 = zzhfVar.c;
        if (iu4Var8 != null) {
            throw iu4Var8.a();
        }
        zzd = rx4Var;
    }

    @NonNull
    public static zzhd zza(@NonNull List list) {
        Objects.requireNonNull(list, "Input scopes list cannot be null");
        Stream streamDistinct = list.stream().map(zzb.zza).distinct();
        ur4 ur4Var = zzhd.b;
        return (zzhd) streamDistinct.collect(nm4.a);
    }

    @NonNull
    public static zzhd zzb(@NonNull List list) {
        Objects.requireNonNull(list, "Input values list cannot be null");
        Stream map = list.stream().map(zza.zza);
        ur4 ur4Var = zzhd.b;
        return (zzhd) map.collect(nm4.a);
    }

    public static /* synthetic */ AuthScope zzc(String str) {
        Objects.requireNonNull(str, "Input list of scope strings must not be null");
        AuthScope authScope = (AuthScope) zzd.get(str);
        if (authScope != null) {
            return authScope;
        }
        d.r("Invalid scope: ".concat(str));
        return null;
    }

    @NonNull
    public String getValue() {
        return this.zzc;
    }

    AuthScope(String str) {
        this.zzc = str;
    }
}
