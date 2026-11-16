package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.jc1;
import defpackage.qb5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ExperimentTokensCreator")
@SafeParcelable.Reserved({1})
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new zzjm();
    public final String a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;

    static {
        byte[][] bArr = new byte[0][];
        new zzjl("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public static Set t0(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(qb5.b(length));
        for (byte[] bArr2 : bArr) {
            Preconditions.checkNotNull(bArr2);
            hashSet.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSet;
    }

    public static List v0(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new zzju(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object hashSet;
        Object hashSet2;
        int length;
        int length2;
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (zzkl.a(this.a, zzjlVar.a) && zzkl.a(r0(), zzjlVar.r0()) && zzkl.a(t0(this.c), t0(zzjlVar.c)) && zzkl.a(t0(this.d), t0(zzjlVar.d)) && zzkl.a(t0(this.e), t0(zzjlVar.e)) && zzkl.a(t0(this.f), t0(zzjlVar.f))) {
                int[] iArr = this.g;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    hashSet = Collections.EMPTY_SET;
                } else {
                    hashSet = new HashSet(qb5.b(length2));
                    for (int i : iArr) {
                        hashSet.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = zzjlVar.g;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    hashSet2 = Collections.EMPTY_SET;
                } else {
                    hashSet2 = new HashSet(qb5.b(length));
                    for (int i2 : iArr2) {
                        hashSet2.add(Integer.valueOf(i2));
                    }
                }
                if (zzkl.a(hashSet, hashSet2) && zzkl.a(v0(this.i), v0(zzjlVar.i)) && zzkl.a(t0(this.j), t0(zzjlVar.j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set r0() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.h;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return t0((byte[][]) arrayList.toArray(new byte[0][]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.a;
        sb.append(str == null ? "null" : jc1.o("'", str, new StringBuilder(str.length() + 2), "'"));
        sb.append(", direct==");
        byte[] bArr = this.b;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        d(sb, "GAIA=", this.c);
        sb.append(", ");
        d(sb, "PSEUDO=", this.d);
        sb.append(", ");
        d(sb, "ALWAYS=", this.e);
        sb.append(", ");
        d(sb, "OTHER=", this.f);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.g));
        sb.append(", ");
        d(sb, "directs=", this.h);
        sb.append(", genDims=");
        sb.append(Arrays.toString(v0(this.i).toArray()));
        sb.append(", ");
        d(sb, "external=", this.j);
        sb.append(")");
        return sb.toString();
    }

    public zzjl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.g = iArr;
        this.h = bArr6;
        this.i = iArr2;
        this.j = bArr7;
    }

    public static void d(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            Preconditions.checkNotNull(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.b, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.c, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.d, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.e, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.f, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.g, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.h, false);
        SafeParcelWriter.writeIntArray(parcel, 10, this.i, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 11, this.j, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
