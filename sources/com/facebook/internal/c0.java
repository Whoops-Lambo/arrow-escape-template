package com.facebook.internal;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ c0(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.c;
                Context context = this.b;
                String str2 = this.d;
                d0 d0Var = d0.a;
                JSONObject jSONObjectA = d0.a();
                if (jSONObjectA.length() != 0) {
                    d0.e(str, jSONObjectA);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectA.toString()).apply();
                    d0.e = Long.valueOf(System.currentTimeMillis());
                }
                d0.f();
                d0.b.set(false);
                break;
            default:
                FetchedAppSettingsManager.loadAppSettingsAsync$lambda$0(this.b, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ c0(String str, Context context, String str2) {
        this.c = str;
        this.b = context;
        this.d = str2;
    }
}
