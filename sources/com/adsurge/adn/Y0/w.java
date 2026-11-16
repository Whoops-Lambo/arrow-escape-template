package com.adsurge.adn.Y0;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class w {
    public long a;
    public final StringBuilder b = new StringBuilder();
    public long c;

    public String toString() {
        int length = this.b.length();
        if (length <= 0) {
            return "";
        }
        StringBuilder sbDeleteCharAt = this.b.deleteCharAt(length - 1);
        sbDeleteCharAt.append(":");
        sbDeleteCharAt.append(this.c);
        return sbDeleteCharAt.toString();
    }

    public void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        this.c += jElapsedRealtime;
        StringBuilder sb = this.b;
        sb.append(jElapsedRealtime);
        sb.append(",");
    }

    public void b() {
        this.a = SystemClock.elapsedRealtime();
    }
}
