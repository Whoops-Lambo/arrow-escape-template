package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bd4;
import defpackage.j94;
import defpackage.ku4;
import defpackage.uo0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzfzx {
    public static volatile int e = 1;
    public final Context a;
    public final Executor b;
    public final Task c;
    public final boolean d;

    public void b(int i, long j) {
        e(i, j, null, null, null);
    }

    public void c(int i, long j, Exception exc) {
        e(i, j, exc, null, null);
    }

    public void d(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public static zzfzx a(Context context, Executor executor, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new ku4(28, context, taskCompletionSource));
        } else {
            executor.execute(new bd4(taskCompletionSource, 20));
        }
        return new zzfzx(context, executor, taskCompletionSource.getTask(), z);
    }

    public final Task e(int i, long j, Exception exc, String str, String str2) {
        if (!this.d) {
            return this.c.continueWith(this.b, j94.j);
        }
        Context context = this.a;
        zzaxp zzaxpVarE = zzaxt.E();
        String packageName = context.getPackageName();
        zzaxpVarE.l();
        ((zzaxt) zzaxpVarE.b).F(packageName);
        zzaxpVarE.l();
        ((zzaxt) zzaxpVarE.b).G(j);
        int i2 = e;
        zzaxpVarE.l();
        ((zzaxt) zzaxpVarE.b).L(i2);
        if (exc != null) {
            Object obj = zzgwv.a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            zzaxpVarE.l();
            ((zzaxt) zzaxpVarE.b).H(string);
            String name = exc.getClass().getName();
            zzaxpVarE.l();
            ((zzaxt) zzaxpVarE.b).I(name);
        }
        if (str2 != null) {
            zzaxpVarE.l();
            ((zzaxt) zzaxpVarE.b).J(str2);
        }
        if (str != null) {
            zzaxpVarE.l();
            ((zzaxt) zzaxpVarE.b).K(str);
        }
        return this.c.continueWith(this.b, new uo0(i, 9, zzaxpVarE));
    }

    public zzfzx(Context context, Executor executor, Task task, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = task;
        this.d = z;
    }
}
