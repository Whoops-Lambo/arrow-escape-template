package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4808j5 implements C7 {
    private static final int e = 5;
    private static C4808j5 f;
    private HandlerC4791i5 a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private Thread b(D8 d8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.b.optBoolean(C4700d4.H, false);
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C4755g5(d8, str, (int) timeUnit.toMillis(j), (int) timeUnit.toMillis(i2), zOptBoolean, b()), handler);
    }

    public synchronized void d() {
        f = null;
        HandlerC4791i5 handlerC4791i5 = this.a;
        if (handlerC4791i5 != null) {
            handlerC4791i5.a();
            this.a = null;
        }
    }

    @Override // com.ironsource.C7
    public void a(D8 d8, String str) {
        int iOptInt = this.b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.b.optBoolean(C4700d4.H, false);
        long j = iOptInt;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C4755g5(d8, str, (int) timeUnit.toMillis(j), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.a);
        this.c = threadA;
        threadA.start();
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    private C4808j5(String str, V7 v7, JSONObject jSONObject) {
        this.d = str;
        this.a = new HandlerC4791i5(v7.b());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, C4700d4.D);
    }

    @Override // com.ironsource.C7
    public void a(Vc vc) {
        this.a.a(vc);
    }

    private Thread a(C4755g5 c4755g5, Handler handler) {
        return new Thread(new RunnableC5105zf(c4755g5, handler));
    }

    @Override // com.ironsource.C7
    public void a(D8 d8, String str, int i, int i2, Handler handler) {
        b(d8, str, i, i2, handler).start();
    }

    @Override // com.ironsource.C7
    public void a(D8 d8, String str, int i, int i2) {
        b(d8, str, i, i2, this.a).start();
    }

    public static synchronized C4808j5 a(String str, V7 v7, JSONObject jSONObject) {
        try {
            if (f == null) {
                f = new C4808j5(str, v7, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public String a() {
        return this.d;
    }
}
