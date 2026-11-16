package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Assertions;
import defpackage.cv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ExoPlayerImplInternal$PlaybackInfoUpdate {
    public int discontinuityReason;
    private boolean hasPendingChange;
    public boolean hasPlayWhenReadyChangeReason;
    public int operationAcks;
    public int playWhenReadyChangeReason;
    public cv1 playbackInfo;
    public boolean positionDiscontinuity;

    public void setPlayWhenReadyChangeReason(int i) {
        this.hasPendingChange = true;
        this.hasPlayWhenReadyChangeReason = true;
        this.playWhenReadyChangeReason = i;
    }

    public void incrementPendingOperationAcks(int i) {
        this.hasPendingChange |= i > 0;
        this.operationAcks += i;
    }

    public void setPlaybackInfo(cv1 cv1Var) {
        this.hasPendingChange |= this.playbackInfo != cv1Var;
        this.playbackInfo = cv1Var;
    }

    public void setPositionDiscontinuity(int i) {
        if (this.positionDiscontinuity && this.discontinuityReason != 5) {
            Assertions.checkArgument(i == 5);
            return;
        }
        this.hasPendingChange = true;
        this.positionDiscontinuity = true;
        this.discontinuityReason = i;
    }

    public ExoPlayerImplInternal$PlaybackInfoUpdate(cv1 cv1Var) {
        this.playbackInfo = cv1Var;
    }
}
