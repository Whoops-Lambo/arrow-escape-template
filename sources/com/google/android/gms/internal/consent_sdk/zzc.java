package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import defpackage.pv1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zzc implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzd[] c;

    @Override // java.lang.Runnable
    public final void run() {
        final JSONObject jSONObject;
        String str = this.a;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        final String lowerCase = str.toLowerCase();
        String str2 = this.b;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                return;
            }
        }
        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
        int i = 0;
        while (true) {
            zzd[] zzdVarArr = this.c;
            if (i >= zzdVarArr.length) {
                return;
            }
            final zzd zzdVar = zzdVarArr[i];
            FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(zzdVar.d(lowerCase, jSONObject));
                }
            });
            zzdVar.zza().execute(futureTask);
            try {
                if (((Boolean) futureTask.get()).booleanValue()) {
                    return;
                } else {
                    i++;
                }
            } catch (InterruptedException e) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
            } catch (ExecutionException e2) {
                Log.d("UserMessagingPlatform", pv1.n("Failed to run Action[", lowerCase, "]: "), e2.getCause());
            }
        }
    }

    public /* synthetic */ zzc(String str, String str2, zzd[] zzdVarArr) {
        this.a = str;
        this.b = str2;
        this.c = zzdVarArr;
    }
}
