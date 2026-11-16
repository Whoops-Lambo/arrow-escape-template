package io.p071bidmachine.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface i0 {
    void a(io.p071bidmachine.media3.common.i0 i0Var);

    io.p071bidmachine.media3.common.i0 getPlaybackParameters();

    long getPositionUs();

    default boolean hasSkippedSilenceSinceLastCall() {
        return false;
    }
}
