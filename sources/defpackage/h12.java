package defpackage;

import android.app.Activity;
import android.os.Build;
import com.unity3d.player.UnityPlayer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h12 implements Thread.UncaughtExceptionHandler {
    public volatile Thread.UncaughtExceptionHandler a;
    public String b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        String strValueOf;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("FATAL EXCEPTION [" + thread.getName() + "]\n");
            sb.append("Unity version     : 6000.3.27f2\n");
            sb.append("Device model      : " + Build.MANUFACTURER + " " + Build.MODEL + "\n");
            String str = Build.FINGERPRINT;
            StringBuilder sb2 = new StringBuilder("Device fingerprint: ");
            sb2.append(str);
            sb2.append("\n");
            sb.append(sb2.toString());
            sb.append("CPU supported ABI : " + Arrays.toString(Build.SUPPORTED_ABIS) + "\n");
            sb.append("Build Type        : Release\nScripting Backend : IL2CPP\n");
            sb.append("Libs loaded from  : " + this.b + "\n");
            try {
                Activity activity = UnityPlayer.currentActivity;
                strValueOf = String.valueOf(activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.getBoolean("unity.strip-engine-code"));
            } catch (Exception unused) {
                strValueOf = "Undefined";
            }
            sb.append("Strip Engine Code : " + strValueOf + "\n");
            Error error = new Error(sb.toString());
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.a.uncaughtException(thread, error);
        } catch (Throwable unused2) {
            this.a.uncaughtException(thread, th);
        }
    }
}
