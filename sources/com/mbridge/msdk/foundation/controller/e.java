package com.mbridge.msdk.foundation.controller;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static volatile e d;
    private volatile long a = 0;
    private volatile String b = "";
    private volatile boolean c = false;

    private void a() {
        if (this.c) {
            return;
        }
        d();
    }

    public static e b() {
        if (d == null) {
            synchronized (e.class) {
                try {
                    if (d == null) {
                        d = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public synchronized void d() {
        try {
            if (this.c) {
                return;
            }
            try {
                com.mbridge.msdk.config.component.common.util.b bVarA = com.mbridge.msdk.config.component.common.util.b.a(c.n().d());
                String strA = bVarA.a("sdk_init_timestamp", "");
                if (TextUtils.isEmpty(strA)) {
                    this.a = System.currentTimeMillis();
                    bVarA.b("sdk_init_timestamp", String.valueOf(this.a));
                } else {
                    try {
                        this.a = Long.parseLong(strA);
                    } catch (NumberFormatException e) {
                        q0.b("SdkIdentity", "parse cached timestamp failed: " + e.getMessage());
                        this.a = System.currentTimeMillis();
                        bVarA.b("sdk_init_timestamp", String.valueOf(this.a));
                    }
                }
                String strA2 = bVarA.a("sdk_init_unique_id", "");
                if (TextUtils.isEmpty(strA2)) {
                    this.b = v0.d();
                    bVarA.b("sdk_init_unique_id", this.b);
                } else {
                    this.b = strA2;
                }
                this.c = true;
            } catch (Throwable th) {
                q0.b("SdkIdentity", "SdkIdentity init failed: " + th.getMessage(), th);
                if (this.a == 0) {
                    this.a = System.currentTimeMillis();
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.b = v0.d();
                }
                this.c = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private e() {
    }

    public String c() {
        a();
        if (this.b == null) {
            return "";
        }
        return this.b;
    }
}
