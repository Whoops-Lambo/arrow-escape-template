package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.p003activity.result.ActivityResultLauncher;
import androidx.p003activity.result.IntentSenderRequest;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class zaa implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ ActivityResultLauncher zac;
    final /* synthetic */ GoogleApiAvailability zad;

    public zaa(GoogleApiAvailability googleApiAvailability, Activity activity, int i, ActivityResultLauncher activityResultLauncher) {
        this.zaa = activity;
        this.zab = i;
        this.zac = activityResultLauncher;
        Objects.requireNonNull(googleApiAvailability);
        this.zad = googleApiAvailability;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.a(new IntentSenderRequest.Builder(errorResolutionPendingIntent.getIntentSender()).a());
    }
}
