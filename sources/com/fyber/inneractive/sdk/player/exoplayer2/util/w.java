package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class w {
    public static void a(String str) {
        if (z.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (z.a >= 18) {
            Trace.endSection();
        }
    }
}
