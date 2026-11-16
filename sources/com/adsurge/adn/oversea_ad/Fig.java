package com.adsurge.adn.oversea_ad;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.common.PlaybackException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Fig implements Norma {
    public abstract String a(IBinder iBinder);

    public static int a(Context context, AtomicReference atomicReference, AtomicReference atomicReference2) {
        Object obj = new Object();
        Intent intent = new Intent(CanisMinor.a(CanisMinor.k));
        intent.setComponent(new ComponentName(CanisMinor.a(CanisMinor.g), CanisMinor.a(CanisMinor.h)));
        if (!context.bindService(intent, new Dew(atomicReference, atomicReference2, obj), 1)) {
            return -100;
        }
        if (atomicReference.get() == null) {
            synchronized (obj) {
                try {
                    obj.wait(1000L);
                } catch (Throwable unused) {
                }
            }
        }
        if (atomicReference.get() == null) {
            return PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED;
        }
        return 0;
    }

    @Override // com.adsurge.adn.oversea_ad.Norma
    public final Codlin a(Context context) {
        AtomicReference atomicReference = new AtomicReference();
        atomicReference.set("");
        try {
            AtomicReference atomicReference2 = new AtomicReference();
            AtomicReference atomicReference3 = new AtomicReference();
            if (a(context, atomicReference2, atomicReference3) == 0) {
                a(context, atomicReference2, atomicReference3, atomicReference);
            }
        } catch (Throwable unused) {
        }
        return new Codlin((String) atomicReference.get());
    }

    public final int a(Context context, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        Object obj = new Object();
        AtomicReference atomicReference4 = new AtomicReference(0);
        new Durian(this, atomicReference, atomicReference4, atomicReference3, context, atomicReference2, obj).start();
        synchronized (obj) {
            try {
                obj.wait(1000L);
            } catch (Throwable unused) {
            }
        }
        return ((Integer) atomicReference4.get()).intValue();
    }
}
