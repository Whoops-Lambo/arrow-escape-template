package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i, int i2, int i3) {
        StringBuilder sbT = jc1.t("Unhandled format: ", i, " Hz, ", i2, " channels in encoding ");
        sbT.append(i3);
        super(sbT.toString());
    }
}
