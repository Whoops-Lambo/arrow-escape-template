package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dk2;
import defpackage.eu;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.bg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4676bg {

    @NotNull
    public static final C4676bg a = new C4676bg();

    @NotNull
    private static final String b = ",";

    @NotNull
    private static final String c = "[";

    @NotNull
    private static final String d = "]";
    private static final int e = 118;

    private C4676bg() {
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + a.a(it.next()) + b;
        }
        return ((Object) dk2.h0(str, b)) + "]";
    }

    @NotNull
    public final String b(@NotNull List<? extends Object> list) {
        String strA;
        list.getClass();
        String str = new String();
        for (Object obj : list) {
            if (obj instanceof List) {
                strA = a.a((List<?>) obj);
            } else {
                strA = a.a(obj);
            }
            str = ((Object) (((Object) str) + strA)) + b;
        }
        return dk2.h0(str, b);
    }

    @NotNull
    public final List<Object> a(@NotNull Object... objArr) {
        objArr.getClass();
        return eu.z(Arrays.copyOf(objArr, objArr.length));
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return "'" + obj + "'";
        }
        return String.valueOf(obj);
    }

    @NotNull
    public final AdInfo a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        return new AdInfo(new C4687c9(levelPlayAdInfo), null);
    }

    @NotNull
    public final IronSourceError a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    @NotNull
    public final ViewGroup.LayoutParams a(@Nullable Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(Context context, int i) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : displayMetrics.density));
    }
}
