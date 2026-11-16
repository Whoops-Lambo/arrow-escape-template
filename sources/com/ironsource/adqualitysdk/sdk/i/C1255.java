package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﺀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1255 {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static C1255 f3798;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Context f3804;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3800 = StringFog.decrypt("Wm1CLCOeeGl3ZkIsPKhHZ3hjRig9\n", "FgIhTU/cCgY=\n");

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final Object f3799 = new Object();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public boolean f3805 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashMap f3803 = new HashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap f3802 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f3801 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m895() {
        this.f3805 = false;
        m894();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m894() {
        synchronized (this.f3803) {
            try {
                Iterator it = new HashMap(this.f3803).keySet().iterator();
                while (it.hasNext()) {
                    m897((BroadcastReceiver) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m897(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3803) {
            try {
                ArrayList arrayList = (ArrayList) this.f3803.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) this.f3802.get(action);
                        if (arrayList2 != null) {
                            if (arrayList2.size() > 0) {
                                if (arrayList2.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                throw null;
                            }
                            if (arrayList2.size() <= 0) {
                                this.f3802.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1255(Context context) {
        this.f3804 = context;
        new HandlerC1276(this, context.getMainLooper());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m896() {
        this.f3805 = true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static C1255 m893(Context context) {
        C1255 c1255;
        synchronized (f3799) {
            try {
                if (f3798 == null) {
                    f3798 = new C1255(context.getApplicationContext());
                }
                c1255 = f3798;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1255;
    }
}
