package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴠ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0969 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Handler f2591;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0571 f2592;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m739() {
        Handler handler;
        synchronized (C0969.class) {
            try {
                if (f2591 == null) {
                    HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("WGTv7WCSkg5AdfnJYJmC\n", "EwGWuwH+52s=\n"));
                    handlerThread.start();
                    f2591 = new Handler(handlerThread.getLooper());
                }
                handler = f2591;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m740(String str) {
        C0571 c0571 = this.f2592;
        c0571.getClass();
        try {
            C0512 c0512 = c0571.f1401;
            synchronized (c0512) {
                c0512.f1156.delete(C0512.f1155, StringFog.decrypt("bNfH6GQ=\n", "B7K+1Vu70G4=\n"), new String[]{str});
            }
        } catch (Throwable unused) {
        }
    }

    public C0969(Context context, String str, String str2) {
        this.f2592 = new C0571(context, str, str2);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m741(String str) {
        C0571 c0571 = this.f2592;
        c0571.getClass();
        try {
            String strM506 = c0571.f1401.m506(str);
            if (strM506 == null || TextUtils.isEmpty(strM506)) {
                return strM506;
            }
            try {
                return c0571.f1402.m524(strM506);
            } catch (C0579 unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m742(String str, String str2) {
        C0571 c0571 = this.f2592;
        c0571.getClass();
        try {
            c0571.f1401.m508(str, c0571.f1402.m525(str2));
        } catch (Throwable unused) {
        }
    }
}
