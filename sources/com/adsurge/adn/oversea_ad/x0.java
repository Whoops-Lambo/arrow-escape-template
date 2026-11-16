package com.adsurge.adn.oversea_ad;

import com.singular.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x0 {
    public final Object a;
    public final Object b;
    public Process c;
    public final DataOutputStream d;
    public u0 e;
    public u0 f;
    public final ByteArrayOutputStream g;
    public final ByteArrayOutputStream h;

    public final synchronized v0 a(w0 w0Var) {
        String str;
        v0 v0VarA;
        try {
            String str2 = w0Var.a;
            if (str2 == null || str2.length() <= 0 || (str = w0Var.b) == null || str.length() <= 0 || w0Var.c < 0) {
                throw new IllegalArgumentException("v");
            }
            synchronized (this.b) {
                this.g.reset();
                this.h.reset();
            }
            this.d.write((w0Var.b + "\n").getBytes());
            this.d.flush();
            synchronized (this.a) {
                this.a.wait(10L);
            }
            this.d.writeBytes("echo :RET=$?\n");
            this.d.flush();
            long jNanoTime = System.nanoTime();
            long jNanoTime2 = 0;
            do {
                long j = w0Var.c;
                if (j != 0) {
                    jNanoTime2 = j - ((System.nanoTime() - jNanoTime) / 1000000);
                    if (jNanoTime2 <= 0) {
                        throw new TimeoutException("t");
                    }
                }
                v0VarA = a(w0Var, jNanoTime2);
            } while (v0VarA == null);
        } catch (Throwable th) {
            throw th;
        }
        return v0VarA;
    }

    public final synchronized v0 b() {
        return a(new w0("export LD_LIBRARY_PATH=/vendor/lib:/system/lib", "export LD_LIBRARY_PATH=/vendor/lib:/system/lib", 5000L));
    }

    public x0() throws IOException {
        Object obj = new Object();
        this.a = obj;
        this.b = new Object();
        this.g = new ByteArrayOutputStream();
        this.h = new ByteArrayOutputStream();
        this.c = Runtime.getRuntime().exec(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH);
        synchronized (obj) {
            obj.wait(10L);
        }
        try {
            this.c.exitValue();
            throw new IOException();
        } catch (Exception unused) {
            this.d = new DataOutputStream(this.c.getOutputStream());
            this.e = new u0(this, "s", this.c.getInputStream(), this.g);
            this.f = new u0(this, Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, this.c.getErrorStream(), this.h);
            synchronized (this.a) {
                this.a.wait(10L);
                this.e.start();
                this.f.start();
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            a();
        } catch (Throwable unused) {
        }
        super.finalize();
    }

    public final void a() {
        try {
            this.d.write("exit\n".getBytes());
            this.d.flush();
            this.c.wait(100L);
        } catch (Exception unused) {
        }
        u0 u0Var = this.e;
        if (u0Var != null) {
            u0Var.interrupt();
            this.e = null;
        }
        u0 u0Var2 = this.f;
        if (u0Var2 != null) {
            u0Var2.interrupt();
            this.f = null;
        }
        Process process = this.c;
        if (process != null) {
            try {
                process.destroy();
            } catch (Throwable unused2) {
            }
            this.c = null;
        }
    }

    public final v0 a(w0 w0Var, long j) {
        boolean z;
        synchronized (this.a) {
            try {
                synchronized (this.b) {
                    z = new String(this.g.toByteArray()).lastIndexOf(":RET=") == -1;
                }
                if (z) {
                    this.a.wait(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.b) {
            try {
                byte[] byteArray = this.g.toByteArray();
                byte[] byteArray2 = this.h.toByteArray();
                String str = new String(byteArray);
                String str2 = new String(byteArray2);
                if (str.lastIndexOf(":RET=") == -1) {
                    return null;
                }
                this.g.reset();
                this.h.reset();
                if (str.lastIndexOf(":RET=0") != -1) {
                    return new v0(str.substring(0, str.lastIndexOf(":RET=")), str2);
                }
                if (str.lastIndexOf(":RET=EOF") == -1) {
                    str2.lastIndexOf(":RET=EOF");
                }
                return new v0(str.substring(0, str.lastIndexOf(":RET=")), str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
