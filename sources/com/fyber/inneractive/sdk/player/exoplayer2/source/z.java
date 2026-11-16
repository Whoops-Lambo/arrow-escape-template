package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class z {
    public static final /* synthetic */ int d = 0;
    public final int a;
    public final y[] b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.a == zVar.a && Arrays.equals(this.b, zVar.b)) {
                return true;
            }
        }
        return false;
    }

    static {
        new z(new y[0]);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b);
        }
        return this.c;
    }

    public z(y... yVarArr) {
        this.b = yVarArr;
        this.a = yVarArr.length;
    }
}
