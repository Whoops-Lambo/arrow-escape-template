package com.mbridge.msdk.config.activity.backdispatcher;

import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import defpackage.gy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    OnBackInvokedCallback a;

    public void a(Window window, b bVar) {
        if (Build.VERSION.SDK_INT < 33 || window == null || bVar == null) {
            return;
        }
        try {
            this.a = new gy(bVar, 4);
            window.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.a);
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "registerOnBackInvokedCallback error");
        }
    }

    public void a(Window window) {
        if (Build.VERSION.SDK_INT < 33 || window == null) {
            return;
        }
        try {
            window.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "unregisterOnBackInvokedCallback error");
        }
    }
}
