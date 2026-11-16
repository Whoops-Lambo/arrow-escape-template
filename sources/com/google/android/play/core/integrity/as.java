package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.safedk.android.utils.Logger;
import defpackage.eg3;
import defpackage.eh3;
import defpackage.pa3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class as extends eg3 {

    @VisibleForTesting
    final TaskCompletionSource a;

    @VisibleForTesting
    final pa3 b;
    private final eh3 c;
    private final String d;
    private final k e;
    private final Activity f;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, pa3 pa3Var) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new eh3("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = pa3Var;
    }

    @Override // defpackage.eg3
    public final void b(Bundle bundle) {
        this.b.d(this.a);
        this.c.b("onRequestDialog(%s)", this.d);
        ApiException apiExceptionA = this.e.a(bundle);
        if (apiExceptionA != null) {
            this.a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            eh3 eh3Var = this.c;
            Object[] objArr = {this.d};
            eh3Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", eh3.c(eh3Var.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        eh3 eh3Var2 = this.c;
        Object[] objArr2 = new Object[0];
        eh3Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", eh3.c(eh3Var2.a, "Starting dialog intent...", objArr2));
        }
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this.f, intent, 0);
    }
}
