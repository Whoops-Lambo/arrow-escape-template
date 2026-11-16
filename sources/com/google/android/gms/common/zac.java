package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zas;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"HandlerLeak"})
final class zac extends zas {
    final /* synthetic */ GoogleApiAvailability zaa;
    private final Context zab;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.zaa;
        Context context = this.zab;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context, 17895000);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            googleApiAvailability.showErrorNotification(context, iIsGooglePlayServicesAvailable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zac(GoogleApiAvailability googleApiAvailability, Context context) {
        Looper looperMyLooper;
        Objects.requireNonNull(googleApiAvailability);
        this.zaa = googleApiAvailability;
        if (Looper.myLooper() == null) {
            looperMyLooper = Looper.getMainLooper();
        } else {
            looperMyLooper = Looper.myLooper();
        }
        super(looperMyLooper);
        this.zab = context.getApplicationContext();
    }
}
