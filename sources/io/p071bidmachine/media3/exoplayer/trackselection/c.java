package io.p071bidmachine.media3.exoplayer.trackselection;

import android.os.SystemClock;
import defpackage.l83;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.s0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c implements q {
    public final s0 a;
    public final int b;
    public final int[] c;
    public final n[] d;
    public final long[] e;
    public int f;

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int a(n nVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == nVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public void disable() {
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && Arrays.equals(this.c, cVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void onPlayWhenReadyChanged(boolean z) {
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public void onPlaybackSpeed(float f) {
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final n getFormat(int i) {
        return this.d[i];
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getIndexInTrackGroup(int i) {
        return this.c[i];
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final n getSelectedFormat() {
        return this.d[getSelectedIndex()];
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getSelectedIndexInTrackGroup() {
        return this.c[getSelectedIndex()];
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final s0 getTrackGroup() {
        return this.a;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final boolean isTrackExcluded(int i, long j) {
        return this.e[i] > j;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int length() {
        return this.c.length;
    }

    public c(s0 s0Var, int[] iArr) {
        boolean z;
        n[] nVarArr;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        a.i(z);
        s0Var.getClass();
        this.a = s0Var;
        int length = iArr.length;
        this.b = length;
        this.d = new n[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            nVarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            nVarArr[i2] = s0Var.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(nVarArr, new l83(12));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = s0Var.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public int evaluateQueueSize(long j, List list) {
        return list.size();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final boolean excludeTrack(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i, jElapsedRealtime);
        for (int i2 = 0; i2 < this.b && !zIsTrackExcluded; i2++) {
            if (i2 != i && !isTrackExcluded(i2, jElapsedRealtime)) {
                zIsTrackExcluded = true;
            } else {
                zIsTrackExcluded = false;
            }
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = x.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }
}
