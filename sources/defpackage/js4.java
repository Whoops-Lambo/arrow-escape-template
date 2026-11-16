package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgzd;
import com.google.android.gms.internal.ads.zzgze;
import com.google.android.gms.internal.ads.zzgzl;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class js4 extends zzgze {
    public static final js4 d = new js4(0, null, new Object[0]);
    public final transient Object a;
    public final transient Object[] b;
    public final transient int c;

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzgze, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.c;
            Object[] objArr = this.b;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.a;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iH = s71.H(obj.hashCode());
                    while (true) {
                        int i2 = iH & length;
                        int i3 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iH = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iH2 = s71.H(obj.hashCode());
                    while (true) {
                        int i4 = iH2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iH2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iH3 = s71.H(obj.hashCode());
                    while (true) {
                        int i5 = iH3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iH3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static js4 h(int i, Object[] objArr, zzgzd zzgzdVar) {
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        er4 er4Var;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return d;
        }
        er4 er4Var2 = null;
        ?? r5 = 0;
        er4 er4Var3 = null;
        er4 er4Var4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new js4(1, null, objArrCopyOf);
        }
        zzgvz.j(i4, objArrCopyOf.length >> 1);
        int iX = zzgzl.x(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i6 = iX - 1;
            if (iX <= 128) {
                byte[] bArr = new byte[iX];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object obj = objArrCopyOf[i10];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i10 ^ i5];
                    Objects.requireNonNull(obj2);
                    int iH = s71.H(obj.hashCode());
                    while (true) {
                        int i11 = iH & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = obj;
                                objArrCopyOf[i9 ^ 1] = obj2;
                            }
                            i8++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            Object obj3 = objArrCopyOf[i13 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            er4 er4Var5 = new er4(obj, obj2, obj3);
                            objArrCopyOf[i13 == true ? 1 : 0] = obj2;
                            er4Var3 = er4Var5;
                            break;
                        }
                        iH = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = er4Var3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iX <= 32768) {
                    sArr = new short[iX];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object obj4 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iH2 = s71.H(obj4.hashCode());
                        while (true) {
                            int i18 = iH2 & i6;
                            char c4 = (char) sArr[i18];
                            if (c4 == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = obj4;
                                    objArrCopyOf[i16 ^ 1] = obj5;
                                }
                                i14++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i19 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i19 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                er4 er4Var6 = new er4(obj4, obj5, obj6);
                                objArrCopyOf[i19 == true ? 1 : 0] = obj5;
                                er4Var4 = er4Var6;
                                break;
                            }
                            iH2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), er4Var4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iX];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object obj7 = objArrCopyOf[i23];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i23 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iH3 = s71.H(obj7.hashCode());
                        while (true) {
                            int i24 = iH3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = obj7;
                                    objArrCopyOf[i22 ^ 1] = obj8;
                                }
                                i21++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (obj7.equals(objArrCopyOf[i25])) {
                                int i26 = i25 ^ 1;
                                Object obj9 = objArrCopyOf[i26];
                                Objects.requireNonNull(obj9);
                                er4 er4Var7 = new er4(obj7, obj8, obj9);
                                objArrCopyOf[i26] = obj8;
                                er4Var2 = er4Var7;
                                break;
                            }
                            iH3 = i24 + 1;
                            c3 = c2;
                        }
                        i20++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i21 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c] = er4Var2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                er4Var = (er4) objArr2[c];
                if (zzgzdVar != null) {
                    throw er4Var.a();
                }
                zzgzdVar.c = er4Var;
                Object obj10 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj10;
                i4 = iIntValue;
            }
            return new js4(i4, r4, objArrCopyOf);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z4 = false;
        i4 = 1;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            er4Var = (er4) objArr2[c];
            if (zzgzdVar != null) {
                throw er4Var.a();
            }
            zzgzdVar.c = er4Var;
            Object obj11 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj11;
            i4 = iIntValue2;
        }
        return new js4(i4, r4, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ds4 entrySet() {
        return new ds4(this, this.b, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final es4 keySet() {
        return new es4(this, new is4(this.b, 0, this.c));
    }

    @Override // com.google.android.gms.internal.ads.zzgze, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final is4 values() {
        return new is4(this.b, 1, this.c);
    }

    @Override // java.util.Map
    public final int size() {
        return this.c;
    }

    public js4(int i, Object obj, Object[] objArr) {
        this.a = obj;
        this.b = objArr;
        this.c = i;
    }
}
