package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.e;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {
    private static Runnable b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public final void run() {
            m.a().a().removeCallbacks(this);
            m.a().a(new b(m.a().a(), e.g()));
        }
    };
    private Context a;

    public b(Handler handler, Context context) {
        super(handler, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        this.a = context;
    }

    public static void c() {
        m.a().a(b, 100L);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:6:0x0010, B:8:0x0016, B:9:0x001e), top: B:13:0x0010 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Map<String, Object> commonParams;
        try {
            commonParams = e.a().c().getCommonParams();
        } catch (Throwable unused) {
            commonParams = null;
        }
        if (commonParams != null) {
            try {
                if (com.apm.insight.nativecrash.b.a(commonParams)) {
                    a(b());
                } else {
                    o.a().a(commonParams, com.apm.insight.entity.b.b());
                }
            } catch (Throwable unused2) {
            }
        } else {
            o.a().a(commonParams, com.apm.insight.entity.b.b());
        }
    }
}
