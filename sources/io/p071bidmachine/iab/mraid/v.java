package io.p071bidmachine.iab.mraid;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public static boolean a(String str, List list) {
        return list != null && list.contains(str);
    }

    public v(Context context, List list) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        boolean z2 = false;
        if (a("sms", list) && applicationContext.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        if (a("tel", list) && applicationContext.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            z2 = true;
        }
        this.b = z2;
        this.c = a("inlineVideo", list);
        this.d = a("calendar", list);
        this.e = a("storePicture", list);
    }
}
