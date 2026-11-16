package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import com.unity3d.services.UnityAdsConstants;
import defpackage.np3;
import defpackage.wo3;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagg {
    public static final ArrayMap a = new ArrayMap(0);

    public static void a(String str, wo3 wo3Var) {
        long jCurrentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        np3 np3Var = new np3();
        np3Var.a = wo3Var;
        np3Var.b = jCurrentTimeMillis;
        a.put(str, np3Var);
    }

    public static boolean b(Activity activity, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, String str, Executor executor) {
        ArrayMap arrayMap = a;
        if (!arrayMap.containsKey(str)) {
            a(str, null);
            return false;
        }
        np3 np3Var = (np3) arrayMap.get(str);
        if (DefaultClock.getInstance().currentTimeMillis() - np3Var.b >= UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            a(str, null);
            return false;
        }
        wo3 wo3Var = np3Var.a;
        if (wo3Var == null) {
            return true;
        }
        wo3Var.b(activity, onVerificationStateChangedCallbacks, str, executor);
        return true;
    }
}
