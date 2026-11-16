package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.utils.Logger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    public static void safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(LifecycleFragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/common/api/internal/LifecycleFragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        zap zapVar = this.zaa;
        if (zapVar.zaa) {
            zam zamVar = this.zab;
            ConnectionResult connectionResultZab = zamVar.zab();
            int errorCode = connectionResultZab.getErrorCode();
            GoogleApiAvailability googleApiAvailability = zapVar.zac;
            if (!googleApiAvailability.zaj(errorCode)) {
                Log.w("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(connectionResultZab)));
                zapVar.zah(connectionResultZab, zamVar.zaa());
                return;
            }
            if (connectionResultZab.hasResolution()) {
                safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(zapVar.mLifecycleFragment, GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResultZab.getResolution()), zamVar.zaa(), false), 1);
                return;
            }
            if (googleApiAvailability.getErrorResolutionIntent(zapVar.getActivity(), connectionResultZab.getErrorCode(), null) != null) {
                googleApiAvailability.zab(zapVar.getActivity(), zapVar.mLifecycleFragment, connectionResultZab.getErrorCode(), 2, zapVar);
                googleApiAvailability.zae(zapVar.getActivity().getApplicationContext(), connectionResultZab, true);
            } else {
                if (connectionResultZab.getErrorCode() != 18) {
                    zapVar.zah(connectionResultZab, zamVar.zaa());
                    return;
                }
                googleApiAvailability.zag(zapVar.getActivity().getApplicationContext(), new zan(this, googleApiAvailability.zaf(zapVar.getActivity(), zapVar)));
                googleApiAvailability.zae(zapVar.getActivity().getApplicationContext(), connectionResultZab, true);
            }
        }
    }

    public zao(zap zapVar, zam zamVar) {
        Objects.requireNonNull(zapVar);
        this.zaa = zapVar;
        this.zab = zamVar;
    }
}
