package io.p071bidmachine.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.common.util.x;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public final String a;
    public final w b;
    public final Object c;

    public final synchronized LogSessionId a() {
        w wVar;
        wVar = this.b;
        wVar.getClass();
        return (LogSessionId) wVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.a, jVar.a) && Objects.equals(this.b, jVar.b) && Objects.equals(this.c, jVar.c);
    }

    static {
        new j("");
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public j(String str) {
        w wVar;
        this.a = str;
        if (x.a >= 31) {
            wVar = new w();
            wVar.a = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            wVar = null;
        }
        this.b = wVar;
        this.c = new Object();
    }
}
