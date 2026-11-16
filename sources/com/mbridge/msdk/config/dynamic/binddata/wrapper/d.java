package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class d implements b<String> {
    private String a;
    private String b;
    private WeakReference<View> c;
    private int d;
    private AtomicBoolean e = new AtomicBoolean(false);

    public d(String str, String str2, View view, int i) {
        this.c = new WeakReference<>(view);
        this.a = str;
        this.b = str2;
        this.d = i;
    }

    private void a(String str) {
        View viewA = a();
        if (!this.e.get() && viewA != null) {
            try {
                com.mbridge.msdk.config.dynamic.utils.a.a(viewA, this.a, this.b, str);
            } catch (Exception e) {
                q0.b("ViewObserverImpl", e.getMessage());
            }
        }
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callbackA = a();
        if (callbackA instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callbackA).updateBindData(str, obj);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    public View a() {
        WeakReference<View> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
