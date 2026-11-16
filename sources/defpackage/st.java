package defpackage;

import android.hardware.SensorManager;
import com.facebook.appevents.codeless.ViewIndexer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class st {
    public static SensorManager c;
    public static ViewIndexer d;
    public static String e;
    public static volatile boolean h;
    public static final st a = new st();
    public static final c63 b = new c63();
    public static final AtomicBoolean f = new AtomicBoolean(true);
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static final String a() {
        if (lz.a.contains(st.class)) {
            return null;
        }
        try {
            if (e == null) {
                e = UUID.randomUUID().toString();
            }
            String str = e;
            str.getClass();
            return str;
        } catch (Throwable th) {
            lz.a(st.class, th);
            return null;
        }
    }
}
