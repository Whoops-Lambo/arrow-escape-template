package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbim {
    public zzbib a;
    public boolean b;
    public final Object c = new Object();

    public final /* synthetic */ void a() {
        synchronized (this.c) {
            try {
                zzbib zzbibVar = this.a;
                if (zzbibVar == null) {
                    return;
                }
                zzbibVar.disconnect();
                this.a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbim(Context context) {
    }
}
