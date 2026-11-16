package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.dj3;
import defpackage.ef3;
import defpackage.eh3;
import defpackage.fb3;
import defpackage.nf3;
import defpackage.pa3;
import defpackage.rd1;
import defpackage.xc3;
import defpackage.ye3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class aj {

    @Nullable
    @VisibleForTesting
    final pa3 a;
    private final eh3 b;
    private final String c;
    private final at d;
    private final k e;

    public static Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xc3(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(rd1.b(arrayList)));
        return bundle;
    }

    @VisibleForTesting
    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }

    public aj(Context context, eh3 eh3Var, at atVar, k kVar) {
        this.c = context.getPackageName();
        this.b = eh3Var;
        this.d = atVar;
        this.e = kVar;
        eh3 eh3Var2 = fb3.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && fb3.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                this.a = new pa3(context, eh3Var, "IntegrityService", ak.a, new dj3() { // from class: com.google.android.play.core.integrity.ae
                    @Override // defpackage.dj3
                    public final Object a(IBinder iBinder) {
                        int i = ef3.g;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                        return iInterfaceQueryLocalInterface instanceof nf3 ? (nf3) iInterfaceQueryLocalInterface : new ye3(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                    }
                });
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        eh3Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", eh3.c(eh3Var.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }
}
