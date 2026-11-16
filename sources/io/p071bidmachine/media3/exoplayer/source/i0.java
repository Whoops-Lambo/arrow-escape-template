package io.p071bidmachine.media3.exoplayer.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.s0;
import io.p071bidmachine.media3.exoplayer.source.chunk.e;
import io.p071bidmachine.media3.exoplayer.source.chunk.k;
import io.p071bidmachine.media3.exoplayer.trackselection.q;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements q {
    public final q a;
    public final s0 b;

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int a(n nVar) {
        return this.a.indexOf(this.b.a(nVar));
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void b(long j, long j2, long j3, List list, k[] kVarArr) {
        this.a.b(j, j2, j3, list, kVarArr);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final boolean c(long j, e eVar, List list) {
        return this.a.c(j, eVar, list);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void disable() {
        this.a.disable();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a.equals(i0Var.a) && this.b.equals(i0Var.b);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int evaluateQueueSize(long j, List list) {
        return this.a.evaluateQueueSize(j, list);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final boolean excludeTrack(int i, long j) {
        return this.a.excludeTrack(i, j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final n getFormat(int i) {
        return this.b.d[this.a.getIndexInTrackGroup(i)];
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getIndexInTrackGroup(int i) {
        return this.a.getIndexInTrackGroup(i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final n getSelectedFormat() {
        return this.b.d[this.a.getSelectedIndexInTrackGroup()];
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getSelectedIndex() {
        return this.a.getSelectedIndex();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getSelectedIndexInTrackGroup() {
        return this.a.getSelectedIndexInTrackGroup();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final Object getSelectionData() {
        return this.a.getSelectionData();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getSelectionReason() {
        return this.a.getSelectionReason();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final s0 getTrackGroup() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int indexOf(int i) {
        return this.a.indexOf(i);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final boolean isTrackExcluded(int i, long j) {
        return this.a.isTrackExcluded(i, j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int length() {
        return this.a.length();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void onDiscontinuity() {
        this.a.onDiscontinuity();
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void onPlayWhenReadyChanged(boolean z) {
        this.a.onPlayWhenReadyChanged(z);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void onPlaybackSpeed(float f) {
        this.a.onPlaybackSpeed(f);
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void onRebuffer() {
        this.a.onRebuffer();
    }

    public i0(q qVar, s0 s0Var) {
        this.a = qVar;
        this.b = s0Var;
    }
}
