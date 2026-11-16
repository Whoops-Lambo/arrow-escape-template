package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import defpackage.lz;
import defpackage.r9;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 implements ServiceConnection {
    public final Context a;
    public final r9 b;
    public p0 c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;

    public abstract void e(Bundle bundle);

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:20:0x0031 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:20:0x0031, B:23:0x003a, B:14:0x0028, B:11:0x0018), top: B:29:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003a A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:20:0x0031, B:23:0x003a, B:14:0x0028, B:11:0x0018), top: B:29:0x0001, inners: #1 }] */
    public final boolean l() {
        int i;
        Intent intentF;
        synchronized (this) {
            boolean z = false;
            if (this.d) {
                return false;
            }
            int i2 = this.j;
            o0 o0Var = o0.a;
            if (lz.a.contains(o0.class)) {
                i = 0;
                if (i == -1) {
                    return false;
                }
                intentF = o0.f(this.a);
                if (intentF == null) {
                    z = true;
                    this.d = true;
                    this.a.bindService(intentF, this, 1);
                }
                return z;
            }
            try {
                i = o0.a.l(o0.b, new int[]{i2}).a;
            } catch (Throwable th) {
                lz.a(o0.class, th);
                i = 0;
            }
            if (i == -1) {
                return false;
            }
            intentF = o0.f(this.a);
            if (intentF == null) {
                z = true;
                this.d = true;
                this.a.bindService(intentF, this, 1);
            }
            return z;
            throw th;
        }
    }

    public final void d(Bundle bundle) {
        if (this.d) {
            this.d = false;
            p0 p0Var = this.c;
            if (p0Var != null) {
                p0Var.b(bundle);
            }
        }
    }

    public q0(Context context, int i, int i2, int i3, String str, String str2, String str3) {
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = i3;
        this.k = str3;
        this.b = new r9(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        String str = this.k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        e(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f);
        messageObtain.arg1 = this.j;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            d(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        d(null);
    }
}
