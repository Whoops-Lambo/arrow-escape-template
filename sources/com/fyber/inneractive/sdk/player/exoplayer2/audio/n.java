package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public n(int i, int i2, int i3, int i4) {
        StringBuilder sbT = jc1.t("AudioTrack init failed: ", i, ", Config(", i2, ", ");
        sbT.append(i3);
        sbT.append(", ");
        sbT.append(i4);
        sbT.append(")");
        super(sbT.toString());
    }
}
