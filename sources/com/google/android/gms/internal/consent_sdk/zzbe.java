package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.annotation.UiThread;
import androidx.core.view.WindowCompat;
import com.facebook.internal.y0;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import defpackage.lx3;
import defpackage.ox3;
import defpackage.w14;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@UiThread
public final class zzbe implements ConsentForm {
    public final Application a;
    public final zzbz b;
    public final zzaq c;
    public final zzbs d;
    public final zzby e;
    public final zzcr f;
    public Dialog g;
    public zzbx h;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public boolean m = false;
    public boolean n = false;

    public final void a(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        this.h = this.e.zzb();
        boolean z = this.m;
        zzcr zzcrVar = this.f;
        if (!z) {
            ((Queue) zzcrVar.j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        zzbx zzbxVar = this.h;
        zzbxVar.setBackgroundColor(0);
        zzbxVar.getSettings().setJavaScriptEnabled(true);
        zzbxVar.getSettings().setAllowFileAccess(false);
        zzbxVar.getSettings().setAllowContentAccess(false);
        zzbxVar.setWebViewClient(new y0(zzbxVar));
        if (!this.m) {
            zzcrVar.a((Queue) zzcrVar.j.get(), 3, 2, null);
        }
        this.j.set(new ox3(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener));
        zzbx zzbxVar2 = this.h;
        zzbs zzbsVar = this.d;
        AdMobNetworkBridge.webviewLoadDataWithBaseURL(zzbxVar2, zzbsVar.a, zzbsVar.b, "text/html", "UTF-8", null);
        zzcz.a.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void b(zzg zzgVar) {
        ox3 ox3Var = (ox3) this.j.getAndSet(null);
        if (ox3Var == null) {
            return;
        }
        if (!this.m) {
            String message = zzgVar.getMessage();
            boolean z = this.n;
            zzcr zzcrVar = this.f;
            if (z) {
                zzcrVar.a((Queue) zzcrVar.i.get(), 10, 11, message);
            } else {
                zzcrVar.a((Queue) zzcrVar.g.get(), 4, 5, message);
            }
        }
        ox3Var.onConsentFormLoadFailure(zzgVar.d());
    }

    public final void c(zzg zzgVar) {
        if (this.m) {
            return;
        }
        String message = zzgVar == null ? null : zzgVar.getMessage();
        boolean z = this.n;
        zzcr zzcrVar = this.f;
        if (z) {
            zzcrVar.a((Queue) zzcrVar.i.get(), 10, 11, message);
        } else {
            zzcrVar.a((Queue) zzcrVar.h.get(), 6, 7, message);
        }
    }

    public zzbe(Application application, zzbz zzbzVar, zzaq zzaqVar, zzbs zzbsVar, zzby zzbyVar, zzcr zzcrVar) {
        this.a = application;
        this.b = zzbzVar;
        this.c = zzaqVar;
        this.d = zzbsVar;
        this.e = zzbyVar;
        this.f = zzcrVar;
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        String str;
        zzcz.a();
        ((Queue) this.f.h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.i.compareAndSet(false, true)) {
            if (true != this.m) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            zzg zzgVar = new zzg(3, str);
            c(zzgVar);
            onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.d());
            return;
        }
        zzbx zzbxVar = this.h;
        final w14 w14Var = zzbxVar.b;
        Objects.requireNonNull(w14Var);
        zzbxVar.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                w14 w14Var2 = w14Var;
                w14Var2.getClass();
                w14Var2.d.execute(new zzcc(w14Var2));
            }
        });
        lx3 lx3Var = new lx3(this, activity);
        this.a.registerActivityLifecycleCallbacks(lx3Var);
        this.l.set(lx3Var);
        this.b.a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            zzg zzgVar2 = new zzg(3, "Activity with null windows is passed in.");
            c(zzgVar2);
            onConsentFormDismissedListener.onConsentFormDismissed(zzgVar2.d());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        WindowCompat.a(window, false);
        this.k.set(onConsentFormDismissedListener);
        dialog.show();
        this.g = dialog;
        this.h.a("UMP_messagePresented", "");
        c(null);
    }
}
