package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.bd4;
import defpackage.je4;
import defpackage.ku4;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzes {
    public static zzes f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public static synchronized zzes a(Context context) {
        try {
            if (f == null) {
                f = new zzes(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<je4> copyOnWriteArrayList = this.b;
        for (je4 je4Var : copyOnWriteArrayList) {
            if (je4Var.a.get() == null) {
                copyOnWriteArrayList.remove(je4Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (je4 je4Var2 : this.b) {
                    je4Var2.getClass();
                    je4Var2.b.execute(new bd4(je4Var2, 4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzes(Context context) {
        Executor executorA = zzdi.a();
        this.a = executorA;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorA.execute(new ku4(22, this, context));
    }
}
