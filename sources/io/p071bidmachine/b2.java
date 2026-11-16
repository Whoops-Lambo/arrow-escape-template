package io.p071bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.protobuf.InitResponse;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {
    public final Context a;
    public final String b;
    public final w c;
    public x1 d;
    public final Object e;
    public final f2 f;

    public final void a(Executable executable) {
        Context context = this.a;
        SharedPreferences sharedPreferencesA = c.a(context);
        InitResponse from = null;
        try {
            from = InitResponse.parseFrom(Base64.decode(sharedPreferencesA.getString("initData", null), 0));
        } catch (Exception unused) {
            p.R(sharedPreferencesA, "initData");
        }
        String strH = p.H(c.a(context), "init_data_session_id");
        if (strH == null) {
            strH = "";
        }
        if (from != null) {
            executable.execute(new z1(from, strH));
        }
    }

    public final void b() {
        synchronized (this.e) {
            try {
                x1 x1Var = this.d;
                if (x1Var == null) {
                    return;
                }
                x1Var.g = null;
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.e) {
            b();
            x1 x1Var = new x1(this.a, this.b, UrlProvider.getInitUrlQueue());
            this.d = x1Var;
            x1Var.g = this.f;
            x1Var.c.eventStart(TrackEventType.InitLoading, null);
            j.k(new w1(x1Var));
        }
    }

    public b2(Context context, String str, w wVar) {
        a2 a2Var = new a2(this);
        this.d = null;
        this.e = new Object();
        SessionManager sessionManager = SessionManager.get();
        this.a = context;
        this.b = str;
        this.c = wVar;
        this.f = new f2(this, sessionManager.getSessionId());
        sessionManager.addObserver(a2Var);
    }
}
