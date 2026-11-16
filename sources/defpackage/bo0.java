package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bo0 {
    public final CountDownLatch a;
    public CrashlyticsAppQualitySessionsSubscriber b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo0)) {
            return false;
        }
        bo0 bo0Var = (bo0) obj;
        return this.a.equals(bo0Var.a) && s71.b(this.b, bo0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = this.b;
        return iHashCode + (crashlyticsAppQualitySessionsSubscriber == null ? 0 : crashlyticsAppQualitySessionsSubscriber.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }

    public bo0(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }
}
