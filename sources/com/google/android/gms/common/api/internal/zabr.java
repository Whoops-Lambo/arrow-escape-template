package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zabr extends BroadcastReceiver {

    @Nullable
    Context zaa;
    private final zabq zab;

    public final synchronized void zab() {
        try {
            Context context = this.zaa;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.zaa = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zaa(Context context) {
        this.zaa = context;
    }

    public zabr(zabq zabqVar) {
        this.zab = zabqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String schemeSpecificPart;
        Uri data = intent.getData();
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        } else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.zab.zaa();
            zab();
        }
    }
}
