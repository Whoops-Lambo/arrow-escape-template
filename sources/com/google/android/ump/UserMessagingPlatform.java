package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.consent_sdk.zzv;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import defpackage.ua5;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class UserMessagingPlatform {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return com.google.android.gms.internal.consent_sdk.zza.a(context).b();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull final Activity activity, @RecentlyNonNull final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza zzaVarA = com.google.android.gms.internal.consent_sdk.zza.a(activity);
        if (zzaVarA.b().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        ((Queue) zzaVarA.d().i.get()).add(Long.valueOf(System.currentTimeMillis()));
        zzbq zzbqVarC = zzaVarA.c();
        zzcz.a();
        OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = new OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                consentForm.show(activity, onConsentFormDismissedListener);
            }
        };
        Objects.requireNonNull(onConsentFormDismissedListener);
        zzbqVarC.a(onConsentFormLoadSuccessListener, new OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                onConsentFormDismissedListener.onConsentFormDismissed(formError);
            }
        }, true);
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zza zzaVarA = com.google.android.gms.internal.consent_sdk.zza.a(context);
        ((Queue) zzaVarA.d().g.get()).add(Long.valueOf(System.currentTimeMillis()));
        zzaVarA.c().a(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, false);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        boolean z;
        boolean z2;
        final zzbq zzbqVarC = com.google.android.gms.internal.consent_sdk.zza.a(activity).c();
        zzbqVarC.getClass();
        zzcz.a();
        final zzj zzjVarB = com.google.android.gms.internal.consent_sdk.zza.a(activity).b();
        if (zzjVarB == null) {
            zzcz.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new zzg(1, "No consentInformation.").d());
                }
            });
            return;
        }
        if (!zzjVarB.isConsentFormAvailable() && zzjVarB.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcz.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "No valid response received yet.").d());
                }
            });
            if (zzjVarB.a()) {
                synchronized (zzjVarB.e) {
                    z2 = zzjVarB.h;
                }
                if (!z2) {
                    synchronized (zzjVarB.e) {
                        zzjVarB.h = true;
                    }
                    ua5 ua5Var = zzjVarB.b;
                    ConsentRequestParameters consentRequestParameters = zzjVarB.i;
                    ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener = new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                        public final void onConsentInfoUpdateSuccess() {
                            zzj zzjVar = zzjVarB;
                            synchronized (zzjVar.e) {
                                zzjVar.h = false;
                            }
                        }
                    };
                    ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener = new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                        public final void onConsentInfoUpdateFailure(FormError formError) {
                            zzj zzjVar = zzjVarB;
                            synchronized (zzjVar.e) {
                                zzjVar.h = false;
                            }
                        }
                    };
                    ua5Var.getClass();
                    ua5Var.c.execute(new zzv(ua5Var, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener));
                    return;
                }
            }
            boolean zA = zzjVarB.a();
            synchronized (zzjVarB.e) {
                z = zzjVarB.h;
            }
            Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zA + ", retryRequestIsInProgress=" + z);
            return;
        }
        if (zzjVarB.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcz.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Privacy options form is not required.").d());
                }
            });
            return;
        }
        ConsentForm consentForm = (ConsentForm) zzbqVarC.d.get();
        if (consentForm == null) {
            zzcz.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Privacy options form is being loading. Please try again later.").d());
                }
            });
        } else {
            consentForm.show(activity, onConsentFormDismissedListener);
            zzbqVarC.b.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                @Override // java.lang.Runnable
                public final void run() {
                    zzbqVarC.b();
                }
            });
        }
    }
}
