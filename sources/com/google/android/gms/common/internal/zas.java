package com.google.android.gms.common.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zas implements Executor {
    private static volatile zas zaa;
    private static Context zab;

    public static zas zaa(Context context) {
        zas zasVar;
        zas zasVar2 = zaa;
        if (zasVar2 != null) {
            return zasVar2;
        }
        synchronized (zas.class) {
            try {
                zasVar = zaa;
                if (zasVar == null) {
                    zab = (Context) Preconditions.checkNotNull(context.getApplicationContext());
                    zasVar = new zas();
                    zaa = zasVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zasVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zar.zaa.post(runnable);
    }

    private zas() {
    }
}
