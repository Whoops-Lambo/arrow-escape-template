package defpackage;

import com.google.android.gms.internal.ads.zzanf;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.extractor.mp4.n;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k90 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public synchronized void a(long j, Object obj) {
        int i = this.b;
        if (i > 0) {
            if (j <= ((long[]) this.c)[((this.a + i) - 1) % ((Object[]) this.d).length]) {
                b();
            }
        }
        c();
        int i2 = this.a;
        int i3 = this.b;
        Object[] objArr = (Object[]) this.d;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.c)[length] = j;
        objArr[length] = obj;
        this.b = i3 + 1;
    }

    public synchronized void b() {
        this.a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public Object e(long j, boolean z) {
        Object objH = null;
        long j2 = Long.MAX_VALUE;
        while (this.b > 0) {
            long j3 = j - ((long[]) this.c)[this.a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objH = h();
            j2 = j3;
        }
        return objH;
    }

    public synchronized Object f() {
        return this.b == 0 ? null : h();
    }

    public synchronized Object g(long j) {
        return e(j, true);
    }

    public synchronized int i() {
        return this.b;
    }

    public void c() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.a, objArr, 0, i3);
        int i4 = this.a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.a);
        }
        this.c = jArr;
        this.d = objArr;
        this.a = 0;
    }

    public void d(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        if (i < 0) {
            int i6 = this.a;
            i += i6;
            i2 += 4 - ((i6 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        ((byte[]) this.d)[(i * i5) + i2] = (byte) ((((String) this.c).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public Object h() {
        a.i(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public void j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        d(i4, i5, i3, 1);
        int i6 = i2 - 1;
        d(i4, i6, i3, 2);
        int i7 = i - 1;
        d(i7, i5, i3, 3);
        d(i7, i6, i3, 4);
        d(i7, i2, i3, 5);
        d(i, i5, i3, 6);
        d(i, i6, i3, 7);
        d(i, i2, i3, 8);
    }

    public k90(int i, float[] fArr, float[] fArr2, int i2) {
        boolean z;
        this.a = i;
        if (((long) fArr.length) * 2 == ((long) fArr2.length) * 3) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        this.c = fArr;
        this.d = fArr2;
        this.b = i2;
    }

    public k90() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public k90(int i, int i2) {
        switch (i2) {
            case 5:
                this.c = new zzanf[i];
                this.b = 0;
                break;
            default:
                this.c = new n[i];
                this.b = 0;
                break;
        }
    }
}
