package com.adsurge.adn.X;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {
    public static String a = "";
    public static int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ Context a;

        /* JADX INFO: renamed from: com.adsurge.adn.X.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class C0096a implements OnSuccessListener {
            public C0096a() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AppSetIdInfo appSetIdInfo) {
                k.b = appSetIdInfo.getScope();
                k.a = appSetIdInfo.getId();
            }
        }

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AppSet.getClient(this.a).getAppSetIdInfo().addOnSuccessListener(new C0096a());
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context) {
        if (com.adsurge.adn.K.b.a("app_set_id")) {
            return;
        }
        q.c.submit(new a(context));
    }

    public static String a() {
        return a;
    }
}
