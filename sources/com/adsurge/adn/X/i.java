package com.adsurge.adn.X;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i {
    public static String a = "";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
                if (TextUtils.isEmpty(string)) {
                    string = "";
                }
                i.a = string;
            } catch (Throwable th) {
                com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
                dVar.a("error_msg", th.getMessage());
                com.adsurge.adn.w1.b.a(6001500, (com.adsurge.adn.Y0.c) null, dVar);
                th.getMessage();
            }
        }
    }

    public static void a(Context context) {
        if (com.adsurge.adn.K.b.a("android_id")) {
            return;
        }
        q.c.submit(new a(context));
    }

    public static String a() {
        return a;
    }
}
