package io.p071bidmachine.media3.exoplayer.audio;

import com.ironsource.C4664b4;
import defpackage.d03;
import defpackage.o31;
import defpackage.q31;
import io.p071bidmachine.media3.common.util.x;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final a d;
    public final int a;
    public final int b;
    public final q31 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Objects.equals(this.c, aVar.c);
    }

    static {
        a aVar;
        if (x.a >= 33) {
            o31 o31Var = new o31(4);
            for (int i = 1; i <= 10; i++) {
                o31Var.a(Integer.valueOf(x.q(i)));
            }
            aVar = new a(2, o31Var.i());
        } else {
            aVar = new a(2, 10);
        }
        d = aVar;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        q31 q31Var = this.c;
        return i + (q31Var == null ? 0 : q31Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + C4664b4.j.e;
    }

    public a(int i, Set set) {
        this.a = i;
        q31 q31VarY = q31.y(set);
        this.c = q31VarY;
        d03 it = q31VarY.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
