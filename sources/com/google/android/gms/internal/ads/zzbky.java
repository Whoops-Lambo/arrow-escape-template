package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbky {
    public MotionEvent a = MotionEvent.obtain(0, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    public MotionEvent b = MotionEvent.obtain(0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
    public final ScheduledExecutorService c;

    public zzbky(ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
    }
}
