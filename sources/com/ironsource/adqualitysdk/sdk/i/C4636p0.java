package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4636p0 extends AbstractC1098 {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m429(ArrayList arrayList) {
        View view = (View) AbstractC1098.m806(arrayList, 0, View.class);
        Rect rect = AbstractC4634o0.f422;
        view.getHitRect(rect);
        return view.getGlobalVisibleRect(rect);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static View m431(ArrayList arrayList) {
        Activity activity = (Activity) AbstractC1098.m806(arrayList, 0, Activity.class);
        Rect rect = AbstractC4634o0.f422;
        return activity.findViewById(R.id.content);
    }

    static {
        StringFog.decrypt("S4GPV4wGgOZ6jZ5hriOK6W2Hj3+eOJH9\n", "LOT7FuhR5YQ=\n");
        StringFog.decrypt("zH/M+FZSsGXWZfj9Vg==\n", "pQyakTMl5gw=\n");
        StringFog.decrypt("jJhG7Q8ivw==\n", "6/0yu2ZHyEE=\n");
        StringFog.decrypt("ZssIcPyH8ndv2ipa9p4=\n", "Aa58M5PphhI=\n");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static View m430(ArrayList arrayList) {
        View view = (View) AbstractC1098.m806(arrayList, 0, View.class);
        Class cls = (Class) AbstractC1098.m806(arrayList, 1, Class.class);
        boolean zBooleanValue = ((Boolean) AbstractC1098.m806(arrayList, 2, Boolean.class)).booleanValue();
        Rect rect = AbstractC4634o0.f422;
        ArrayList arrayList2 = new ArrayList();
        AbstractC4634o0.m419(view, cls, null, true, zBooleanValue, null, null, arrayList2);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (View) arrayList2.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static WebView m432(ArrayList arrayList) {
        int iIntValue;
        List list;
        int i;
        String str;
        Activity activity = (Activity) AbstractC1098.m806(arrayList, 0, Activity.class);
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 1) {
            iIntValue = ((Integer) AbstractC1098.m806(arrayList, 1, Integer.class)).intValue();
            if (arrayList.size() > 2) {
                String str2 = (String) AbstractC1098.m806(arrayList, 2, String.class);
                if (arrayList.size() > 3) {
                    arrayList2 = (List) AbstractC1098.m806(arrayList, 3, List.class);
                }
                list = arrayList2;
                str = str2;
                i = iIntValue;
            }
            Rect rect = AbstractC4634o0.f422;
            ArrayList arrayList3 = new ArrayList();
            AbstractC4634o0.m422(activity, WebView.class, i, str, true, false, null, list, arrayList3);
            return (WebView) (arrayList3.size() > 0 ? (View) arrayList3.get(0) : null);
        }
        iIntValue = -1;
        list = arrayList2;
        i = iIntValue;
        str = null;
        Rect rect2 = AbstractC4634o0.f422;
        ArrayList arrayList4 = new ArrayList();
        AbstractC4634o0.m422(activity, WebView.class, i, str, true, false, null, list, arrayList4);
        return (WebView) (arrayList4.size() > 0 ? (View) arrayList4.get(0) : null);
    }
}
