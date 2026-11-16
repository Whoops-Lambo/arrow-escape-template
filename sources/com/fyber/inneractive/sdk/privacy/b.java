package com.fyber.inneractive.sdk.privacy;

import android.content.SharedPreferences;
import android.os.Handler;
import com.fyber.inneractive.sdk.util.r;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            if (str.startsWith("IABTCF_") || str.startsWith("IABGPP_")) {
                c cVar = this.a;
                cVar.getClass();
                synchronized (c.g) {
                    try {
                        if (cVar.c) {
                            String str2 = (String) cVar.b.get();
                            AtomicReference atomicReference = cVar.b;
                            if (str2 != null) {
                                str = str2 + "," + str;
                            }
                            atomicReference.set(str);
                            a aVar = cVar.d;
                            Handler handler = r.b;
                            handler.removeCallbacks(aVar);
                            handler.postDelayed(cVar.d, 100L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
