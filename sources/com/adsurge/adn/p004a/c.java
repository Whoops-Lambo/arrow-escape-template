package com.adsurge.adn.p004a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.adsurge.adn.J.a;
import com.adsurge.adn.ads.activity.AdActivity;
import com.adsurge.adn.ads.activity.LandscapeAdActivity;
import com.adsurge.adn.ads.activity.PortraitAdActivity;
import com.adsurge.adn.ads.activity.TranslucentAdActivity;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static final SparseArray a = new SparseArray(4);
    public static final String b = AdActivity.class.getName();
    public static final String c = PortraitAdActivity.class.getName();
    public static final String d = LandscapeAdActivity.class.getName();
    public static final String e = TranslucentAdActivity.class.getName();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static void b(Context context, a aVar) {
        if (context == null || aVar == null) {
            return;
        }
        a(context, e, aVar);
    }

    public static void a(Context context, String str, a aVar) {
        int iHashCode = aVar.hashCode();
        Intent intent = new Intent();
        intent.setClassName(context, str);
        intent.putExtra("adi", iHashCode);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        a.put(iHashCode, aVar);
    }

    public static void a(a aVar) {
        if (aVar == null) {
            return;
        }
        a.remove(aVar.hashCode());
    }

    public static void a(Context context, a aVar) {
        a(context, aVar, a.d().c().j());
    }

    public static void a(Context context, a aVar, boolean z) {
        if (context != null && aVar != null) {
            a(context, z ? d : c, aVar);
        } else {
            com.adsurge.adn.I.a.a("Context or delegate is null");
        }
    }

    public static a a(int i) {
        return (a) a.get(i);
    }
}
