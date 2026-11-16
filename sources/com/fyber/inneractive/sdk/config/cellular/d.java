package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d implements h {
    public final TelephonyManager a;
    public final ConnectivityManager b;
    public CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public abstract void a();

    public abstract void a(a aVar);

    public abstract void a(h hVar);

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(a1 a1Var) {
        CopyOnWriteArrayList<h> copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList == null) {
            IAlog.a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        for (h hVar : copyOnWriteArrayList) {
            if (hVar != null) {
                hVar.a(a1Var);
            }
        }
    }

    public d(Context context) {
        this.a = (TelephonyManager) context.getSystemService("phone");
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
