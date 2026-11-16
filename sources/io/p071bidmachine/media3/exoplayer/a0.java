package io.p071bidmachine.media3.exoplayer;

import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.media3.common.util.a;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public Object e;

    public void d() {
        this.b = false;
        this.c = false;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.d + i3;
            if (length < i4) {
                this.e = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.e, this.d, i3);
            this.d += i3;
        }
    }

    public boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.d -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public void c(int i) {
        this.b |= i > 0;
        this.a += i;
    }

    public void e(int i) {
        a.i(!this.b);
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.d = 3;
            this.c = false;
        }
    }

    public a0(int i) {
        this.a = i;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.e = bArr;
        bArr[2] = 1;
    }

    public a0(u0 u0Var) {
        this.e = u0Var;
    }
}
