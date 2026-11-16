package androidx.datastore.preferences.protobuf;

import com.facebook.appevents.p;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.d;
import defpackage.dr0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class UnknownFieldSetLite {
    public static final UnknownFieldSetLite f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.a;
        if (i == unknownFieldSetLite.a) {
            int[] iArr = this.b;
            int[] iArr2 = unknownFieldSetLite.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = unknownFieldSetLite.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public static UnknownFieldSetLite c() {
        return new UnknownFieldSetLite(0, new int[8], new Object[8], true);
    }

    public static void e(int i, Object obj, Writer writer) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            writer.J(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            writer.p(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            writer.h(i2, (ByteString) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                writer.c(i2, ((Integer) obj).intValue());
                return;
            } else {
                dr0.m(InvalidProtocolBufferException.i());
                return;
            }
        }
        if (writer.G() == Writer.FieldOrder.a) {
            writer.s(i2);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.u(i2);
        } else {
            writer.u(i2);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.s(i2);
        }
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int iX;
        int iZ;
        int iX2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iX2 = CodedOutputStream.X(i5) + 8;
                } else if (i6 == 2) {
                    iX2 = CodedOutputStream.S(i5, (ByteString) this.c[i3]);
                } else if (i6 == 3) {
                    iX = CodedOutputStream.X(i5) * 2;
                    iZ = ((UnknownFieldSetLite) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        p.g(InvalidProtocolBufferException.i());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    iX2 = CodedOutputStream.X(i5) + 4;
                }
                i2 = iX2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iX = CodedOutputStream.X(i5);
                iZ = CodedOutputStream.Z(jLongValue);
            }
            i2 = iZ + iX + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            d.c();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void f(Writer writer) {
        if (this.a == 0) {
            return;
        }
        if (writer.G() == Writer.FieldOrder.a) {
            for (int i = 0; i < this.a; i++) {
                e(this.b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            e(this.b[i2], this.c[i2], writer);
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
