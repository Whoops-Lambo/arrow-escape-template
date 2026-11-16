package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.h50;

/* JADX INFO: renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class C4585a extends Thread {
    private static final int l = 1;
    private static final InterfaceC4659b m = new C0362a();
    private static final A9 n = new b();
    private final int d;
    private InterfaceC4659b a = m;
    private A9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* JADX INFO: renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0362a implements InterfaceC4659b {
        @Override // com.ironsource.InterfaceC4659b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4659b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements A9 {
        @Override // com.ironsource.A9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4585a c4585a = C4585a.this;
            c4585a.h = (c4585a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C4585a c() {
        this.e = null;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String string = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    StringBuilder sbP = h50.p(string);
                    sbP.append(stackTraceElement.toString());
                    sbP.append(";\n");
                    string = sbP.toString();
                }
            }
        }
        return string;
    }

    public int b() {
        return this.i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.a.a();
                    String str = C4950r4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new P5(C4950r4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.a.b();
        }
    }

    public C4585a(int i) {
        this.d = i;
    }

    public C4585a b(boolean z) {
        this.f = z;
        return this;
    }

    public void a(int i) {
        this.i = i;
    }

    public int a() {
        return this.j;
    }

    public C4585a a(InterfaceC4659b interfaceC4659b) {
        if (interfaceC4659b == null) {
            this.a = m;
            return this;
        }
        this.a = interfaceC4659b;
        return this;
    }

    public C4585a a(A9 a9) {
        if (a9 == null) {
            this.b = n;
            return this;
        }
        this.b = a9;
        return this;
    }

    public C4585a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C4585a a(boolean z) {
        this.g = z;
        return this;
    }
}
