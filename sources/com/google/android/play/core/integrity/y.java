package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.eh3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
abstract class y {
    private final String b;
    private final long c;

    @GuardedBy
    private boolean e;
    private final eh3 a = new eh3("IntegrityDialogWrapper");
    private final Object d = new Object();

    public abstract Task b(Activity activity, Bundle bundle);

    public final Task a(Activity activity, int i) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    return Tasks.forResult(0);
                }
                this.e = true;
                eh3 eh3Var = this.a;
                Object[] objArr = {Integer.valueOf(i)};
                eh3Var.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", eh3.c(eh3Var.a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i);
                bundle.putString("package.name", this.b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public y(String str, long j) {
        this.b = str;
        this.c = j;
    }
}
