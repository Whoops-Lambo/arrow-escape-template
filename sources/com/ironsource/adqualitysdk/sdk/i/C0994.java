package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴿ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0994 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2832 = StringFog.decrypt("Qk6BRJqtBo54SoFWp7oOuGVdkEE=\n", "DCv1M/Xfbd0=\n");

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Context f2835;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public boolean f2834 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f2833 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m752() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f2833);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0610) it.next()).getClass();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC4631n.m405(new C1002(this, intent, context));
    }

    public C0994(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2835 = applicationContext;
        AbstractC0509.m489(f2832, StringFog.decrypt("GhlD+BVo7D48DBfuDmnqeiodRPhcdO59LBVB6Q4o\n", "SXw3jHwGix4=\n"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StringFog.decrypt("ptSuXrUycnip374CuTR4OOn5hWKUHlUCjuyDeIMEVR6G9I1p\n", "x7rKLNpbFlY=\n"));
        applicationContext.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m751(C0994 c0994, Context context) {
        NetworkInfo activeNetworkInfo;
        c0994.getClass();
        if (context != null) {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService(StringFog.decrypt("fDi1LfEWI1ZpPq86\n", "H1fbQ5R1Vz8=\n"))).getActiveNetworkInfo();
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            AbstractC0509.m495(f2832, StringFog.decrypt("jXGH1PXImYk=\n", "wxTzo5q68qk=\n") + activeNetworkInfo.getTypeName() + StringFog.decrypt("L05PdWQeqwNqSQ4=\n", "Dy0gGwp7yHc=\n"));
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m750(C0994 c0994, boolean z) {
        synchronized (c0994) {
            c0994.f2834 = z;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m753() {
        return this.f2834;
    }
}
