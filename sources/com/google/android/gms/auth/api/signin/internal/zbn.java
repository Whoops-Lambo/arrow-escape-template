package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zbn {
    public static zbn b;
    public final Storage a;

    public final synchronized void b() {
        Storage storage = this.a;
        ReentrantLock reentrantLock = storage.a;
        reentrantLock.lock();
        try {
            storage.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static synchronized zbn a(Context context) {
        zbn zbnVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (zbn.class) {
            zbnVar = b;
            if (zbnVar == null) {
                zbnVar = new zbn(applicationContext);
                b = zbnVar;
            }
        }
        return zbnVar;
        return zbnVar;
    }

    public zbn(Context context) {
        String strE;
        Storage storageA = Storage.a(context);
        this.a = storageA;
        storageA.b();
        String strE2 = storageA.e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strE2) && (strE = storageA.e(Storage.g("googleSignInOptions", strE2))) != null) {
            try {
                GoogleSignInOptions.d(strE);
            } catch (JSONException unused) {
            }
        }
    }
}
