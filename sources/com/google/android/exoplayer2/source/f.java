package com.google.android.exoplayer2.source;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public final MaskingMediaSource a;
    public int d;
    public int e;
    public boolean f;
    public final ArrayList c = new ArrayList();
    public final Object b = new Object();

    public f(MediaSource mediaSource, boolean z) {
        this.a = new MaskingMediaSource(mediaSource, z);
    }
}
