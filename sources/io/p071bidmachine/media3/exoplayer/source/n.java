package io.p071bidmachine.media3.exoplayer.source;

import defpackage.d31;
import defpackage.y21;
import defpackage.y32;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.exoplayer.h0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements d1 {
    public final y32 a;
    public long b;

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean a(h0 h0Var) {
        boolean zA;
        boolean z = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zA = false;
            while (true) {
                y32 y32Var = this.a;
                if (i >= y32Var.d) {
                    break;
                }
                long nextLoadPositionUs2 = ((m) y32Var.get(i)).a.getNextLoadPositionUs();
                boolean z2 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= h0Var.a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    zA |= ((m) y32Var.get(i)).a.a(h0Var);
                }
                i++;
            }
            z |= zA;
        } while (zA);
        return z;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            y32 y32Var = this.a;
            if (i >= y32Var.d) {
                return false;
            }
            if (((m) y32Var.get(i)).a.isLoading()) {
                return true;
            }
            i++;
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final void reevaluateBuffer(long j) {
        int i = 0;
        while (true) {
            y32 y32Var = this.a;
            if (i >= y32Var.d) {
                return;
            }
            ((m) y32Var.get(i)).reevaluateBuffer(j);
            i++;
        }
    }

    public n(List list, List list2) {
        boolean z;
        y21 y21VarX = d31.x();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        for (int i = 0; i < list.size(); i++) {
            y21VarX.a(new m((d1) list.get(i), (List) list2.get(i)));
        }
        this.a = y21VarX.g();
        this.b = -9223372036854775807L;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getBufferedPositionUs() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            y32 y32Var = this.a;
            if (i >= y32Var.d) {
                break;
            }
            m mVar = (m) y32Var.get(i);
            long bufferedPositionUs = mVar.a.getBufferedPositionUs();
            d31 d31Var = mVar.b;
            if ((d31Var.contains(1) || d31Var.contains(2) || d31Var.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        if (j != -9223372036854775807L) {
            return j;
        }
        return jMin2;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getNextLoadPositionUs() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            y32 y32Var = this.a;
            if (i >= y32Var.d) {
                break;
            }
            long nextLoadPositionUs = ((m) y32Var.get(i)).a.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
