package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kj1 {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    public final ij1 a;

    public kj1(Context context, ComponentName componentName, di diVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new jj1(context, componentName, diVar);
        } else {
            this.a = new ij1(context, componentName, diVar);
        }
    }
}
