package io.p071bidmachine.iab.vast;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import defpackage.s40;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static final WeakHashMap a = new WeakHashMap();
    public static final s40 b = new s40(2);
    public static final IntentFilter c;
    public static boolean d;
    public static boolean e;

    static {
        IntentFilter intentFilter = new IntentFilter();
        c = intentFilter;
        d = false;
        e = false;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    public static synchronized void a(Context context) {
        if (!d) {
            synchronized (b.class) {
                try {
                    if (!d) {
                        e = ((PowerManager) context.getSystemService("power")).isScreenOn();
                        context.getApplicationContext().registerReceiver(b, c);
                        d = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
