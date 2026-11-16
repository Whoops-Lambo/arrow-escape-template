package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.zj4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzgbu {
    public final zzgbx a;
    public final boolean b = true;

    public static zzgbu a(Context context, String str) {
        zzgbx zzgbvVar;
        try {
            try {
                try {
                    IBinder iBinderB = DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        zzgbvVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzgbvVar = iInterfaceQueryLocalInterface instanceof zzgbx ? (zzgbx) iInterfaceQueryLocalInterface : new zzgbv(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    zzgbvVar.i2(new ObjectWrapper(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzgbu(zzgbvVar);
                } catch (Exception e) {
                    throw new zzgax(e);
                }
            } catch (RemoteException | zzgax | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzgbu(new zj4());
            }
        } catch (Exception e2) {
            throw new zzgax(e2);
        }
    }

    public zzgbu(zzgbx zzgbxVar) {
        this.a = zzgbxVar;
    }
}
