package com.google.android.gms.internal.measurement;

import defpackage.tb5;
import defpackage.wb5;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzxx {
    public static final wb5 f;
    public static final wb5 h;
    public static final zzyl a = new zzyl("cause", Throwable.class, false, false);
    public static final zzyl b = new zzyl("ratelimit_count", Integer.class, false, false);
    public static final zzyl c = new zzyl("sampling_count", Integer.class, false, false);
    public static final zzyl d = new zzyl("ratelimit_period", tb5.class, false, false);
    public static final zzyl e = new zzyl("skipped", Integer.class, false, false);
    public static final zzyl g = new zzyl("forced", Boolean.class, false, false);
    public static final zzyl i = new zzyl("stack_size", zzyv.class, false, false);

    static {
        boolean z = true;
        f = new wb5("group_by", Object.class, z, z, 0);
        h = new wb5("tags", zzabe.class, false, z, 1);
    }
}
