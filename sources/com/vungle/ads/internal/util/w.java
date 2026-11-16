package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class w extends BroadcastReceiver {
    public v a;

    public final void a(v vVar) {
        this.a = vVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        v vVar;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e) {
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage != null) {
                    boolean z = u.a;
                    t.b("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (s71.b(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            boolean z2 = u.a;
            t.a("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                v vVar2 = this.a;
                if (vVar2 != null) {
                    vVar2.a(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (vVar = this.a) != null) {
                    vVar.a(false);
                    return;
                }
                return;
            }
            v vVar3 = this.a;
            if (vVar3 != null) {
                vVar3.a(true);
            }
        }
    }
}
