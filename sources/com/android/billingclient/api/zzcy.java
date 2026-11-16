package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zzcy {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    static {
        int i = zzcz.zza;
    }

    @Nullable
    public static zziw zzb(@Nullable zzjd zzjdVar, int i, BillingResult billingResult, @Nullable String str, zzjk zzjkVar) {
        try {
            zzjb zzjbVarQ = zzjf.q();
            zzjbVarQ.h(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            zzjbVarQ.e();
            zzjf.s((zzjf) zzjbVarQ.b, debugMessage);
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                int onPurchasesUpdatedSubResponseCode = billingResult.getOnPurchasesUpdatedSubResponseCode();
                zzjbVarQ.e();
                zzjf.u((zzjf) zzjbVarQ.b, onPurchasesUpdatedSubResponseCode);
            }
            if (zzjdVar != null) {
                zzjbVarQ.g(zzjdVar);
            }
            if (str != null) {
                zzjbVarQ.e();
                zzjf.r((zzjf) zzjbVarQ.b, str);
            }
            zziu zziuVarS = zziw.s();
            zziuVarS.g(zzjbVarQ);
            zziuVarS.i(i);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                zziuVarS.e();
                zziw.v((zziw) zziuVarS.b, zzjkVar);
            }
            return (zziw) zziuVarS.c();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    @Nullable
    public static zzja zzc(int i, zzjk zzjkVar) {
        try {
            zziy zziyVarQ = zzja.q();
            zziyVarQ.e();
            zzja.p((zzja) zziyVarQ.b, i);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                zziyVarQ.e();
                zzja.s((zzja) zziyVarQ.b, zzjkVar);
            }
            return (zzja) zziyVarQ.c();
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzc.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
