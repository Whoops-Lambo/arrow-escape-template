package defpackage;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzai;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.internal.p002firebaseauthapi.zzao;
import com.google.android.gms.internal.p002firebaseauthapi.zzu;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f3 {
    public static final zzal d;
    public final String a;
    public final String b;
    public final String c;

    /* JADX WARN: Code duplicated, block: B:105:0x0267  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    static {
        int iHighestOneBit;
        char c;
        boolean z;
        int i;
        ?? r6;
        int i2;
        short[] sArr;
        char c2;
        boolean z2;
        ?? r17;
        boolean z3;
        ?? r7;
        av3 av3Var;
        boolean z4;
        HashMap map = new HashMap();
        char c3 = 2;
        boolean z5 = false;
        jc1.u(2, map, "recoverEmail", 0, "resetPassword");
        int i3 = 1;
        jc1.u(4, map, "signIn", 1, "verifyEmail");
        jc1.u(5, map, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        Set<Map.Entry> setEntrySet = map.entrySet();
        zzao zzaoVar = new zzao(setEntrySet != null ? setEntrySet.size() : 4);
        if (setEntrySet != null) {
            int size = setEntrySet.size() << 1;
            Object[] objArr = zzaoVar.a;
            if (size > objArr.length) {
                zzaoVar.a = Arrays.copyOf(objArr, zzai.a(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i4 = (zzaoVar.b + 1) << 1;
            Object[] objArr2 = zzaoVar.a;
            if (i4 > objArr2.length) {
                zzaoVar.a = Arrays.copyOf(objArr2, zzai.a(objArr2.length, i4));
            }
            if (key == null) {
                d.w("null key in entry: null=".concat(String.valueOf(value)));
                return;
            }
            if (value == null) {
                d.w(pv1.n("null value in entry: ", String.valueOf(key), "=null"));
                return;
            }
            Object[] objArr3 = zzaoVar.a;
            int i5 = zzaoVar.b;
            int i6 = i5 * 2;
            objArr3[i6] = key;
            objArr3[i6 + 1] = value;
            zzaoVar.b = i5 + 1;
        }
        at3 at3Var = zzaoVar.c;
        if (at3Var != null) {
            throw at3Var.a();
        }
        int i7 = zzaoVar.b;
        Object[] objArrCopyOf = zzaoVar.a;
        if (i7 == 0) {
            av3Var = av3.g;
        } else {
            av3 av3Var2 = av3.g;
            at3 at3Var2 = null;
            ?? r8 = 0;
            at3 at3Var3 = null;
            at3 at3Var4 = null;
            if (i7 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                av3Var = new av3(1, null, objArrCopyOf);
            } else {
                zzu.d(i7, objArrCopyOf.length >> 1);
                int iMax = Math.max(i7, 2);
                if (iMax < 751619276) {
                    iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
                    while (((double) iHighestOneBit) * 0.7d < iMax) {
                        iHighestOneBit <<= 1;
                    }
                } else {
                    iHighestOneBit = 1073741824;
                    if (!(iMax < 1073741824)) {
                        d.r("collection too large");
                        return;
                    }
                }
                if (i7 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    c = 2;
                    z4 = false;
                } else {
                    int i8 = iHighestOneBit - 1;
                    if (iHighestOneBit <= 128) {
                        byte[] bArr = new byte[iHighestOneBit];
                        Arrays.fill(bArr, (byte) -1);
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < i7) {
                            int i11 = i9 * 2;
                            int i12 = i10 * 2;
                            Object obj = objArrCopyOf[i11];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i11 ^ 1];
                            Objects.requireNonNull(obj2);
                            int iB = vk3.B(obj.hashCode());
                            while (true) {
                                int i13 = iB & i8;
                                c2 = c3;
                                z2 = z5;
                                int i14 = bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i14 == 255) {
                                    bArr[i13] = (byte) i12;
                                    if (i10 < i9) {
                                        objArrCopyOf[i12] = obj;
                                        objArrCopyOf[i12 ^ 1] = obj2;
                                    }
                                    i10++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i14 == true ? 1 : 0])) {
                                    int i15 = ~i14;
                                    Object obj3 = objArrCopyOf[i15 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    at3 at3Var5 = new at3(obj, obj2, obj3);
                                    objArrCopyOf[i15 == true ? 1 : 0] = obj2;
                                    at3Var3 = at3Var5;
                                    break;
                                }
                                iB = i13 + 1;
                                c3 = c2;
                                z5 = z2;
                            }
                            i9++;
                            c3 = c2;
                            z5 = z2;
                        }
                        c = c3;
                        z = z5;
                        if (i10 == i7) {
                            i = 1;
                            r6 = bArr;
                            r17 = z;
                        } else {
                            sArr = new Object[3];
                            sArr[z ? 1 : 0] = bArr;
                            sArr[1] = Integer.valueOf(i10);
                            sArr[c] = at3Var3;
                            r8 = sArr;
                            z4 = z;
                        }
                    } else {
                        c = 2;
                        z = false;
                        if (iHighestOneBit <= 32768) {
                            sArr = new short[iHighestOneBit];
                            Arrays.fill(sArr, (short) -1);
                            int i16 = 0;
                            for (int i17 = 0; i17 < i7; i17++) {
                                int i18 = i17 * 2;
                                int i19 = i16 * 2;
                                Object obj4 = objArrCopyOf[i18];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i18 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iB2 = vk3.B(obj4.hashCode());
                                while (true) {
                                    int i20 = iB2 & i8;
                                    int i21 = sArr[i20] & 65535;
                                    if (i21 == 65535) {
                                        sArr[i20] = (short) i19;
                                        if (i16 < i17) {
                                            objArrCopyOf[i19] = obj4;
                                            objArrCopyOf[i19 ^ 1] = obj5;
                                        }
                                        i16++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                                        int i22 = ~i21;
                                        Object obj6 = objArrCopyOf[i22 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        at3Var4 = new at3(obj4, obj5, obj6);
                                        objArrCopyOf[i22 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iB2 = i20 + 1;
                                }
                            }
                            if (i16 == i7) {
                                r8 = sArr;
                                z4 = z;
                            } else {
                                r8 = new Object[]{sArr, Integer.valueOf(i16), at3Var4};
                                z4 = z;
                            }
                        } else {
                            int[] iArr = new int[iHighestOneBit];
                            Arrays.fill(iArr, -1);
                            int i23 = 0;
                            int i24 = 0;
                            while (i23 < i7) {
                                int i25 = i23 * 2;
                                int i26 = i24 * 2;
                                Object obj7 = objArrCopyOf[i25];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i25 ^ i3];
                                Objects.requireNonNull(obj8);
                                int iB3 = vk3.B(obj7.hashCode());
                                while (true) {
                                    int i27 = iB3 & i8;
                                    int i28 = iArr[i27];
                                    if (i28 == -1) {
                                        iArr[i27] = i26;
                                        if (i24 < i23) {
                                            objArrCopyOf[i26] = obj7;
                                            objArrCopyOf[i26 ^ 1] = obj8;
                                        }
                                        i24++;
                                        i2 = i3;
                                        break;
                                    }
                                    i2 = i3;
                                    if (obj7.equals(objArrCopyOf[i28])) {
                                        int i29 = i28 ^ 1;
                                        Object obj9 = objArrCopyOf[i29];
                                        Objects.requireNonNull(obj9);
                                        at3 at3Var6 = new at3(obj7, obj8, obj9);
                                        objArrCopyOf[i29] = obj8;
                                        at3Var2 = at3Var6;
                                        break;
                                    }
                                    iB3 = i27 + 1;
                                    i3 = i2;
                                }
                                i23++;
                                i3 = i2;
                            }
                            i = i3;
                            if (i24 == i7) {
                                r6 = iArr;
                                r17 = z;
                            } else {
                                Object[] objArr4 = new Object[3];
                                objArr4[0] = iArr;
                                objArr4[i] = Integer.valueOf(i24);
                                objArr4[2] = at3Var2;
                                r6 = objArr4;
                                r17 = z;
                            }
                        }
                    }
                    z3 = r6 instanceof Object[];
                    r7 = r6;
                    if (z3) {
                        Object[] objArr5 = (Object[]) r6;
                        zzaoVar.c = (at3) objArr5[c];
                        Object obj10 = objArr5[r17];
                        int iIntValue = ((Integer) objArr5[i]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
                        r7 = obj10;
                        i7 = iIntValue;
                    }
                    av3Var = new av3(i7, r7, objArrCopyOf);
                }
                i = 1;
                r6 = r8;
                r17 = z4;
                z3 = r6 instanceof Object[];
                r7 = r6;
                if (z3) {
                    Object[] objArr6 = (Object[]) r6;
                    zzaoVar.c = (at3) objArr6[c];
                    Object obj11 = objArr6[r17];
                    int iIntValue2 = ((Integer) objArr6[i]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 << 1);
                    r7 = obj11;
                    i7 = iIntValue2;
                }
                av3Var = new av3(i7, r7, objArrCopyOf);
            }
        }
        at3 at3Var7 = zzaoVar.c;
        if (at3Var7 != null) {
            throw at3Var7.a();
        }
        d = av3Var;
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public f3(String str) {
        String strA = a(str, "apiKey");
        String strA2 = a(str, "oobCode");
        String strA3 = a(str, C4664b4.a.t);
        if (strA != null && strA2 != null && strA3 != null) {
            Preconditions.checkNotEmpty(strA);
            this.a = Preconditions.checkNotEmpty(strA2);
            this.b = Preconditions.checkNotEmpty(strA3);
            a(str, "continueUrl");
            a(str, R6.q);
            this.c = a(str, "tenantId");
            return;
        }
        d.r("apiKey, oobCode and mode are required in a valid action code URL");
        throw null;
    }
}
