package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.google.android.gms.internal.consent_sdk.zzbz;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentForm;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lx3 implements Application.ActivityLifecycleCallbacks {
    public final Activity a;
    public final /* synthetic */ zzbe b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzbe zzbeVar = this.b;
        Dialog dialog = zzbeVar.g;
        AtomicReference atomicReference = zzbeVar.l;
        if (dialog == null || !zzbeVar.m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        zzbz zzbzVar = zzbeVar.b;
        if (zzbzVar != null) {
            zzbzVar.a = activity;
        }
        lx3 lx3Var = (lx3) atomicReference.getAndSet(null);
        if (lx3Var != null) {
            lx3Var.b.a.unregisterActivityLifecycleCallbacks(lx3Var);
            lx3 lx3Var2 = new lx3(zzbeVar, activity);
            zzbeVar.a.registerActivityLifecycleCallbacks(lx3Var2);
            atomicReference.set(lx3Var2);
        }
        Dialog dialog2 = zzbeVar.g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.a) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        zzbe zzbeVar = this.b;
        if (zIsChangingConfigurations && zzbeVar.m && (dialog = zzbeVar.g) != null) {
            dialog.dismiss();
            return;
        }
        zzg zzgVar = new zzg(3, "Activity is destroyed.");
        Dialog dialog2 = zzbeVar.g;
        if (dialog2 != null) {
            dialog2.dismiss();
            zzbeVar.g = null;
        }
        zzbeVar.b.a = null;
        lx3 lx3Var = (lx3) zzbeVar.l.getAndSet(null);
        if (lx3Var != null) {
            lx3Var.b.a.unregisterActivityLifecycleCallbacks(lx3Var);
        }
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) zzbeVar.k.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        zzbeVar.c(zzgVar);
        onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.d());
    }

    public lx3(zzbe zzbeVar, Activity activity) {
        Objects.requireNonNull(zzbeVar);
        this.b = zzbeVar;
        this.a = activity;
    }
}
