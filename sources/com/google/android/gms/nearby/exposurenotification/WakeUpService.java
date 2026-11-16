package com.google.android.gms.nearby.exposurenotification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import defpackage.v65;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class WakeUpService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new Messenger(new v65()).getBinder();
    }
}
