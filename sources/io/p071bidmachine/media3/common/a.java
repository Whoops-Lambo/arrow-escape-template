package io.p071bidmachine.media3.common;

import android.net.Uri;
import com.explorestack.protobuf.z;
import io.p071bidmachine.media3.common.util.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final y[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;

    static {
        z.p(0, 1, 2, 3, 4);
        z.p(5, 6, 7, 8, 9);
        x.G(10);
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f) && Arrays.equals(this.g, aVar.g);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.a * 31) + this.b) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.g)) * 31;
    }

    public a(int i, int i2, int[] iArr, y[] yVarArr, long[] jArr, String[] strArr) {
        boolean z;
        Uri uri;
        int i3 = 0;
        if (iArr.length == yVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        io.p071bidmachine.media3.common.util.a.c(z);
        this.a = i;
        this.b = i2;
        this.e = iArr;
        this.d = yVarArr;
        this.f = jArr;
        this.c = new Uri[yVarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 < uriArr.length) {
                y yVar = yVarArr[i3];
                if (yVar == null) {
                    uri = null;
                } else {
                    v vVar = yVar.b;
                    vVar.getClass();
                    uri = vVar.a;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.g = strArr;
                return;
            }
        }
    }
}
