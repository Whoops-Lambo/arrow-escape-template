package com.adsurge.adn.I0;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.c(this.a);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.b(this.a);
            } catch (Throwable unused) {
            }
        }
    }

    public static void d(String str) {
        g.c(new b(str));
    }

    public static void e(String str) {
        g.c(new a(str));
    }

    public static Toast a(String str) {
        Context contextA = com.adsurge.adn.D0.a.c().a();
        TextView textView = new TextView(contextA);
        textView.setText(str);
        textView.setPadding(i.a(contextA, 20), i.a(contextA, 12), i.a(contextA, 20), i.a(contextA, 12));
        textView.setTextColor(-1);
        textView.setTextSize(2, 16.0f);
        textView.setBackgroundDrawable(j.a(60.0f, -16777216, 100));
        Toast toast = new Toast(contextA);
        toast.setGravity(17, 0, 0);
        toast.setView(textView);
        return toast;
    }

    public static void b(String str) {
        Toast toastA = a(str);
        toastA.setDuration(1);
        toastA.show();
    }

    public static void c(String str) {
        Toast toastA = a(str);
        toastA.setDuration(0);
        toastA.show();
    }
}
