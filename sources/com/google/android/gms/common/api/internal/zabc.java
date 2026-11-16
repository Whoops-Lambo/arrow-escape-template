package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zabc extends com.google.android.gms.internal.base.zas {
    final /* synthetic */ zabd zaa;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((zabb) message.obj).zab(this.zaa);
        } else {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabd zabdVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zabdVar);
        this.zaa = zabdVar;
    }
}
