package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ForegroundInfo {
    public final int a;
    public final int b;
    public final Notification c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.a == foregroundInfo.a && this.b == foregroundInfo.b) {
            return this.c.equals(foregroundInfo.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }

    public ForegroundInfo(int i, int i2, Notification notification) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }
}
