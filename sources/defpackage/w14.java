package defpackage;

import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.zzao;
import com.google.android.gms.internal.consent_sdk.zzaq;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.google.android.gms.internal.consent_sdk.zzbz;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzcc;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzd;
import com.google.android.gms.internal.consent_sdk.zze;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentForm;
import com.safedk.android.utils.Logger;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w14 implements zzd {
    public final Application a;
    public final zzbz b;
    public final Handler c;
    public final Executor d;
    public final zze e;
    public final zzao f;
    public final zzbe g;
    public final zzaq h;

    public static void safedk_zzbz_startActivity_7e6f4088e0092d1e5abae281df5386ee(zzbz p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/internal/consent_sdk/zzbz;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public final void a(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        zzd[] zzdVarArr = {this, this.f};
        zze zzeVar = this.e;
        zzeVar.getClass();
        zzeVar.a.execute(new zzc(queryParameter, queryParameter2, zzdVarArr));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzcb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public w14(Application application, zzbz zzbzVar, Handler handler, Executor executor, zze zzeVar, zzao zzaoVar, zzbe zzbeVar, zzaq zzaqVar) {
        this.a = application;
        this.b = zzbzVar;
        this.c = handler;
        this.d = executor;
        this.e = zzeVar;
        this.f = zzaoVar;
        this.g = zzbeVar;
        this.h = zzaqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean d(String str, JSONObject jSONObject) {
        int i;
        Dialog dialog;
        lx3 lx3Var;
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener;
        zzbe zzbeVar = this.g;
        switch (str) {
            case "load_complete":
                ox3 ox3Var = (ox3) zzbeVar.j.getAndSet(null);
                if (ox3Var != null) {
                    if (!zzbeVar.m && !zzbeVar.n) {
                        zzcr zzcrVar = zzbeVar.f;
                        zzcrVar.a((Queue) zzcrVar.g.get(), 4, 5, null);
                    }
                    ox3Var.onConsentFormLoadSuccess(zzbeVar);
                    return true;
                }
            case "configure_app_assets":
                this.d.execute(new zzcc(this));
                return true;
            case "browser":
                String strOptString = jSONObject.optString("url");
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri uri = Uri.parse(strOptString);
                if (uri.getScheme() == null) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
                }
                try {
                    safedk_zzbz_startActivity_7e6f4088e0092d1e5abae281df5386ee(this.b, new Intent("android.intent.action.VIEW", uri));
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e);
                    return true;
                }
            case "dismiss":
                switch (jSONObject.optString("status")) {
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                    case "personalized":
                    case "CONSENT_SIGNAL_SUFFICIENT":
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                    case "non_personalized":
                        i = 3;
                        dialog = zzbeVar.g;
                        if (dialog != null) {
                            dialog.dismiss();
                            zzbeVar.g = null;
                        }
                        zzbeVar.b.a = null;
                        lx3Var = (lx3) zzbeVar.l.getAndSet(null);
                        if (lx3Var != null) {
                            lx3Var.b.a.unregisterActivityLifecycleCallbacks(lx3Var);
                        }
                        onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) zzbeVar.k.getAndSet(null);
                        if (onConsentFormDismissedListener != null) {
                            zzbeVar.c.b.edit().putInt("consent_status", i).commit();
                            onConsentFormDismissedListener.onConsentFormDismissed(null);
                            return true;
                        }
                    case "CONSENT_SIGNAL_NOT_REQUIRED":
                        i = 1;
                        dialog = zzbeVar.g;
                        if (dialog != null) {
                            dialog.dismiss();
                            zzbeVar.g = null;
                        }
                        zzbeVar.b.a = null;
                        lx3Var = (lx3) zzbeVar.l.getAndSet(null);
                        if (lx3Var != null) {
                            lx3Var.b.a.unregisterActivityLifecycleCallbacks(lx3Var);
                        }
                        onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) zzbeVar.k.getAndSet(null);
                        if (onConsentFormDismissedListener != null) {
                            zzbeVar.c.b.edit().putInt("consent_status", i).commit();
                            onConsentFormDismissedListener.onConsentFormDismissed(null);
                            return true;
                        }
                    default:
                        zzg zzgVar = new zzg(1, "We are getting something wrong with the webview.");
                        Dialog dialog2 = zzbeVar.g;
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            zzbeVar.g = null;
                        }
                        zzbeVar.b.a = null;
                        lx3 lx3Var2 = (lx3) zzbeVar.l.getAndSet(null);
                        if (lx3Var2 != null) {
                            lx3Var2.b.a.unregisterActivityLifecycleCallbacks(lx3Var2);
                        }
                        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener2 = (ConsentForm.OnConsentFormDismissedListener) zzbeVar.k.getAndSet(null);
                        if (onConsentFormDismissedListener2 != null) {
                            zzbeVar.c(zzgVar);
                            onConsentFormDismissedListener2.onConsentFormDismissed(zzgVar.d());
                            return true;
                        }
                }
            default:
                return false;
        }
    }
}
