package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class xg3 {
    public static Context a;
    public static String b;
    public static nu c;

    public static String a() {
        if (TextUtils.isEmpty(b)) {
            try {
                File file = new File(a.getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                b = file.getAbsolutePath();
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7U=", "becpkAyfZsmGQ9A=", "XOs5owq4bMikT9FcmR20HlLqKJontXs=", 40);
            }
        }
        return b;
    }

    public static nu b() {
        if (c == null) {
            nu.kgy kgyVar = new nu.kgy("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c = kgyVar.kgy(10000L, timeUnit).ahm(10000L, timeUnit).rz(10000L, timeUnit).kgy();
        }
        return c;
    }
}
