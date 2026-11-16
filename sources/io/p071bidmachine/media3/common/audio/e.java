package io.p071bidmachine.media3.common.audio;

import defpackage.h50;
import io.p071bidmachine.media3.common.util.x;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static final e e = new e(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return h50.l(sb, this.c, ']');
    }

    public e(int i, int i2, int i3) {
        int iR;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (x.H(i3)) {
            iR = x.r(i3) * i2;
        } else {
            iR = -1;
        }
        this.d = iR;
    }
}
