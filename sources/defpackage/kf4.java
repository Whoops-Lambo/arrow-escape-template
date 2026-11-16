package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzgvh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class kf4 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = zzey.d;
        boolean z = true;
        if (!zzgvh.d("robolectric", Build.FINGERPRINT) && (((classLoader = zzey.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
