package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import defpackage.m93;
import defpackage.n30;
import defpackage.r80;
import defpackage.s80;
import defpackage.vm3;
import defpackage.yw0;
import java.net.HttpURLConnection;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafj {
    public final Context a;
    public zzagc b;
    public final String c;
    public final FirebaseApp d;
    public boolean e = false;
    public String f;

    public final void a(HttpURLConnection httpURLConnection) {
        yw0 yw0Var;
        String str;
        boolean z = this.e;
        String str2 = this.c;
        String strM = z ? n30.m(str2, "/FirebaseUI-Android") : n30.m(str2, "/FirebaseCore-Android");
        if (this.b == null) {
            this.b = new zzagc(this.a);
        }
        httpURLConnection.setRequestProperty("X-Android-Package", this.b.a);
        httpURLConnection.setRequestProperty("X-Android-Cert", this.b.b);
        httpURLConnection.setRequestProperty("Accept-Language", zzafm.a());
        httpURLConnection.setRequestProperty("X-Client-Version", strM);
        httpURLConnection.setRequestProperty("X-Firebase-Locale", this.f);
        FirebaseApp firebaseApp = this.d;
        httpURLConnection.setRequestProperty("X-Firebase-GMPID", firebaseApp.getOptions().getApplicationId());
        vm3 vm3Var = (vm3) firebaseApp.get(vm3.class);
        if (vm3Var == null || (yw0Var = (yw0) vm3Var.c.get()) == null) {
            str = null;
        } else {
            try {
                s80 s80Var = (s80) yw0Var;
                str = (String) Tasks.await(!((UserManager) s80Var.b.getSystemService(UserManager.class)).isUserUnlocked() ? Tasks.forResult("") : Tasks.call(s80Var.e, new r80(s80Var, 0)));
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e.getMessage());
                str = null;
            }
        }
        httpURLConnection.setRequestProperty("X-Firebase-Client", str);
        vm3 vm3Var2 = (vm3) firebaseApp.get(vm3.class);
        if (vm3Var2 != null && vm3Var2.b.get() != null) {
            m93.b();
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            httpURLConnection.setRequestProperty("X-Firebase-AppCheck", null);
        }
        this.f = null;
    }

    public zzafj(Context context, FirebaseApp firebaseApp, String str) {
        this.a = (Context) Preconditions.checkNotNull(context);
        this.d = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.c = "Android/Fallback/".concat(str);
    }
}
