package com.google.android.exoplayer2.analytics;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import defpackage.iv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayerId {
    public static final PlayerId UNSET;

    @Nullable
    private final iv1 logSessionIdApi31;

    public PlayerId() {
        this((iv1) null);
        Assertions.checkState(Util.SDK_INT < 31);
    }

    static {
        UNSET = Util.SDK_INT < 31 ? new PlayerId() : new PlayerId(iv1.b);
    }

    @RequiresApi
    public LogSessionId getLogSessionId() {
        return ((iv1) Assertions.checkNotNull(this.logSessionIdApi31)).a;
    }

    @RequiresApi
    public PlayerId(LogSessionId logSessionId) {
        this(new iv1(logSessionId));
    }

    private PlayerId(@Nullable iv1 iv1Var) {
        this.logSessionIdApi31 = iv1Var;
    }
}
