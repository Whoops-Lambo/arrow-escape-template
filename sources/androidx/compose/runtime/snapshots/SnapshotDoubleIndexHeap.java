package androidx.compose.runtime.snapshots;

import defpackage.n8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnapshotDoubleIndexHeap {
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int e;

    public final int a(int i) {
        int i2 = this.a + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            n8.T(0, 14, iArr, iArr2);
            n8.T(0, 14, this.c, iArr3);
            this.b = iArr2;
            this.c = iArr3;
        }
        int i4 = this.a;
        this.a = i4 + 1;
        int length2 = this.d.length;
        if (this.e >= length2) {
            int i5 = length2 * 2;
            int[] iArr4 = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                iArr4[i6] = i7;
                i6 = i7;
            }
            n8.T(0, 14, this.d, iArr4);
            this.d = iArr4;
        }
        int i8 = this.e;
        int[] iArr5 = this.d;
        this.e = iArr5[i8];
        int[] iArr6 = this.b;
        iArr6[i4] = i;
        this.c[i4] = i8;
        iArr5[i8] = i4;
        int i9 = iArr6[i4];
        while (i4 > 0) {
            int i10 = ((i4 + 1) >> 1) - 1;
            if (iArr6[i10] <= i9) {
                break;
            }
            b(i10, i4);
            i4 = i10;
        }
        return i8;
    }

    public final void b(int i, int i2) {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        int[] iArr3 = this.d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
