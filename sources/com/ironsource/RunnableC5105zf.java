package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class RunnableC5105zf implements Runnable {
    private final Handler a;
    private final C4755g5 b;

    public CallableC4702d6 a(C4755g5 c4755g5, String str, long j) {
        return new CallableC4702d6(c4755g5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        D8 d8 = new D8(this.b.b().getParent(), this.b.b().getName());
        Message messageA = a();
        messageA.obj = d8;
        String strA = a(d8.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.a.sendMessage(messageA);
        } else {
            C4773h5 c4773h5Call = a(new C4755g5(d8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), strA, 3L).call();
            messageA.what = c4773h5Call.b() == 200 ? 1016 : c4773h5Call.b();
            this.a.sendMessage(messageA);
        }
    }

    public RunnableC5105zf(C4755g5 c4755g5, Handler handler) {
        this.b = c4755g5;
        this.a = handler;
    }

    public Message a() {
        return new Message();
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
