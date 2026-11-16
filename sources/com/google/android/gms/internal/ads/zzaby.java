package com.google.android.gms.internal.ads;

import defpackage.zl3;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaby {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(final int i, final long j, final long j2) {
        for (final zl3 zl3Var : this.a) {
            if (!zl3Var.c) {
                zl3Var.a.post(new Runnable() { // from class: yl3
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zl3Var.b.i(i, j, j2);
                    }
                });
            }
        }
    }
}
