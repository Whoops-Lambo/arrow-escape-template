package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import defpackage.pv1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcm extends zzcr {
    public final AtomicReference a = new AtomicReference();
    public boolean b;

    public static final Object w3(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", pv1.o("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final Bundle A1(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            if (!this.b) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final void zzb(Bundle bundle) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.b = true;
                    this.a.notify();
                } catch (Throwable th) {
                    this.a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String z1(long j) {
        return (String) w3(String.class, A1(j));
    }
}
