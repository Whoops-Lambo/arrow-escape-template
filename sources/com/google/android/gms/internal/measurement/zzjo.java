package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FlagCreator", doNotParcelTypeDefaultValues = true)
@SafeParcelable.Reserved({1})
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        boolean z = str == null;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        if (!z) {
            SafeParcelWriter.writeString(parcel, 2, str, false);
        }
        long j = this.b;
        if (j != 0) {
            SafeParcelWriter.writeLong(parcel, 3, j);
        }
        if (this.c) {
            SafeParcelWriter.writeBoolean(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            SafeParcelWriter.writeDouble(parcel, 5, d);
        }
        String str2 = this.e;
        if (str2 != null) {
            SafeParcelWriter.writeString(parcel, 6, str2, false);
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            SafeParcelWriter.writeByteArray(parcel, 7, bArr, false);
        }
        int i2 = this.g;
        if (i2 != 0) {
            SafeParcelWriter.writeInt(parcel, 8, i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            SafeParcelWriter.writeInt(parcel, 9, i3);
        }
        int i4 = this.i;
        if (i4 != 0) {
            SafeParcelWriter.writeInt(parcel, 10, i4);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(zzjo zzjoVar) {
        int i;
        zzjo zzjoVar2 = zzjoVar;
        int iCompareTo = this.a.compareTo(zzjoVar2.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = zzjoVar2.g;
        int i3 = this.g;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.b;
            long j2 = zzjoVar2.b;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = zzjoVar2.c;
            boolean z2 = this.c;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.d, zzjoVar2.d);
        }
        if (i3 == 4) {
            String str = zzjoVar2.e;
            String str2 = this.e;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            defpackage.d.p(pv1.l(i3, "Invalid enum value: ", new StringBuilder(String.valueOf(i3).length() + 20)));
            return 0;
        }
        byte[] bArr = zzjoVar2.f;
        byte[] bArr2 = this.f;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final void d(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            sb.append((String) Preconditions.checkNotNull(this.e));
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            sb.append(Base64.encodeToString((byte[]) Preconditions.checkNotNull(this.f), 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzkl.a(this.a, zzjoVar.a)) {
                int i = zzjoVar.g;
                int i2 = this.g;
                if (i2 == i && this.h == zzjoVar.h && this.i == zzjoVar.i) {
                    if (i2 == 1) {
                        return this.b == zzjoVar.b;
                    }
                    if (i2 == 2) {
                        return this.c == zzjoVar.c;
                    }
                    if (i2 == 3) {
                        return this.d == zzjoVar.d;
                    }
                    if (i2 == 4) {
                        return zzkl.a(this.e, zzjoVar.e);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f, zzjoVar.f);
                    }
                    defpackage.d.p(pv1.l(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    public zzjo(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }
}
