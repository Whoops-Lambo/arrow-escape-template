package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import defpackage.m93;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public e a;
    public String b;
    public j c;
    public boolean d = true;

    public abstract e a();

    public abstract void a(String str, w0 w0Var);

    public final e a(String str) throws Exception {
        this.d = str != null;
        e eVar = this.a;
        eVar.getClass();
        eVar.c = System.currentTimeMillis();
        this.c.a(this);
        String strA = this.c.a();
        this.a.h = strA;
        w0 w0VarA = com.fyber.inneractive.sdk.config.a.a(this.b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.b);
        IAlog.a("%s%s", IAlog.a(this), w0VarA);
        if (this.d) {
            a(str, w0VarA);
        } else if (this instanceof l) {
            a(strA, w0VarA);
        } else {
            h hVar = new h(strA);
            if (hVar.a) {
                String str2 = hVar.b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    m93.j("empty ad content detected. failing fast.");
                    return null;
                }
                a(str2, w0VarA);
            }
        }
        return this.a;
    }

    public boolean b() {
        return this instanceof c;
    }
}
