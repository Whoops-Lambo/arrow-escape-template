package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import androidx.core.os.BuildCompat;
import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzasy;
import com.google.android.gms.internal.ads.zzbfk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qv3 extends zzast {
    public int a = 0;
    public final Context b;
    public final String c;
    public zzbfk d;
    public ov3 e;

    public final boolean a() {
        return (this.a != 2 || this.d == null || this.e == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public qv3(Context context) {
        String packageName;
        this.b = context.getApplicationContext();
        int i = BuildCompat.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            if (i2 >= 33) {
                Build.VERSION.CODENAME.getClass();
                if (BuildCompat.a("UpsideDownCake")) {
                    if (SdkExtensions.getExtensionVersion(34) < 8) {
                        packageName = context.getPackageName();
                    }
                }
            }
            packageName = context.getPackageName();
        } else if (SdkExtensions.getExtensionVersion(34) < 8 && Process.isSdkSandbox()) {
            packageName = zs1.l(context.getSystemService(zs1.n())).getClientPackageName();
        } else {
            packageName = context.getPackageName();
        }
        this.c = packageName;
    }

    public final zzasx b() throws RemoteException {
        if (a()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.c);
            try {
                return new zzasx(this.d.f(bundle));
            } catch (RemoteException e) {
                zzasy.b("RemoteException getting install referrer information");
                this.a = 0;
                throw e;
            }
        }
        e32.i("Service not connected. Please start a connection before using the service.");
        return null;
    }
}
