package defpackage;

import java.util.Iterator;
import kotlinx.serialization.internal.EnumDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class k1 implements Iterator, bc1 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public k1(EnumDescriptor enumDescriptor) {
        this.a = 2;
        this.c = enumDescriptor;
        this.b = enumDescriptor.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((n1) obj).size();
            case 1:
                return this.b < ((Object[]) obj).length;
            case 2:
                return this.b > 0;
            case 3:
                return this.b < ((byte[]) obj).length;
            case 4:
                return this.b < ((int[]) obj).length;
            case 5:
                return this.b < ((long[]) obj).length;
            case 6:
                return this.b < ((short[]) obj).length;
            default:
                return this.b <= ((a53) obj).b;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    d.v();
                    return null;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                return ((n1) obj).get(i2);
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    vq2.s(e.getMessage());
                    return null;
                }
            case 2:
                EnumDescriptor enumDescriptor = (EnumDescriptor) obj;
                int i4 = enumDescriptor.c;
                int i5 = this.b;
                this.b = i5 - 1;
                return enumDescriptor.e[i4 - i5];
            case 3:
                int i6 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i6 < bArr.length) {
                    this.b = i6 + 1;
                    return new vs2(bArr[i6]);
                }
                vq2.s(String.valueOf(i6));
                return null;
            case 4:
                int i7 = this.b;
                int[] iArr = (int[]) obj;
                if (i7 < iArr.length) {
                    this.b = i7 + 1;
                    return new yx2(iArr[i7]);
                }
                vq2.s(String.valueOf(i7));
                return null;
            case 5:
                int i8 = this.b;
                long[] jArr = (long[]) obj;
                if (i8 < jArr.length) {
                    this.b = i8 + 1;
                    return new dy2(jArr[i8]);
                }
                vq2.s(String.valueOf(i8));
                return null;
            case 6:
                int i9 = this.b;
                short[] sArr = (short[]) obj;
                if (i9 < sArr.length) {
                    this.b = i9 + 1;
                    return new py2(sArr[i9]);
                }
                vq2.s(String.valueOf(i9));
                return null;
            default:
                int i10 = this.b;
                this.b = i10 + 1;
                return new dt1(Integer.valueOf(i10), Boolean.valueOf(((a53) obj).c(i10)));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k1(Object[] objArr) {
        this.a = 1;
        objArr.getClass();
        this.c = objArr;
    }

    public k1(a53 a53Var) {
        this.a = 7;
        this.c = a53Var;
        this.b = 1;
    }

    public /* synthetic */ k1(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }
}
