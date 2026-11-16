package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jl1 implements ExoTrackSelection {
    public final ExoTrackSelection a;
    public final TrackGroup b;

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final boolean blacklist(int i, long j) {
        return this.a.blacklist(i, j);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void disable() {
        this.a.disable();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl1)) {
            return false;
        }
        jl1 jl1Var = (jl1) obj;
        return this.a.equals(jl1Var.a) && this.b.equals(jl1Var.b);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int evaluateQueueSize(long j, List list) {
        return this.a.evaluateQueueSize(j, list);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i) {
        return this.a.getFormat(i);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i) {
        return this.a.getIndexInTrackGroup(i);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.a.getSelectedFormat();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndex() {
        return this.a.getSelectedIndex();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.a.getSelectedIndexInTrackGroup();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Object getSelectionData() {
        return this.a.getSelectionData();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectionReason() {
        return this.a.getSelectionReason();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
        return this.a.getType();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        return this.a.indexOf(format);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final boolean isBlacklisted(int i, long j) {
        return this.a.isBlacklisted(i, j);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.a.length();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void onDiscontinuity() {
        this.a.onDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void onPlayWhenReadyChanged(boolean z) {
        this.a.onPlayWhenReadyChanged(z);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void onPlaybackSpeed(float f) {
        this.a.onPlaybackSpeed(f);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void onRebuffer() {
        this.a.onRebuffer();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final boolean shouldCancelChunkLoad(long j, Chunk chunk, List list) {
        return this.a.shouldCancelChunkLoad(j, chunk, list);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void updateSelectedTrack(long j, long j2, long j3, List list, MediaChunkIterator[] mediaChunkIteratorArr) {
        this.a.updateSelectedTrack(j, j2, j3, list, mediaChunkIteratorArr);
    }

    public jl1(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
        this.a = exoTrackSelection;
        this.b = trackGroup;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i) {
        return this.a.indexOf(i);
    }
}
