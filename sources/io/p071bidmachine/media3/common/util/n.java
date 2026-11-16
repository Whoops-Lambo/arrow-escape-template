package io.p071bidmachine.media3.common.util;

import io.p071bidmachine.media3.exoplayer.upstream.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ o c;

    public n(o oVar, d dVar, Executor executor) {
        this.c = oVar;
        this.a = new WeakReference(dVar);
        this.b = executor;
    }
}
