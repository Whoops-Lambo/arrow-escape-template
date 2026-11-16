package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgjg {
    public long a;
    public long b;
    public long c;
    public long d;
    public double e;
    public double f;
    public double g;
    public float h;
    public float i;
    public float j;
    public float k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                    this.d++;
                    return;
                }
                this.b += (long) (motionEvent.getHistorySize() + 1);
                this.g = Math.hypot(((double) motionEvent.getRawX()) - this.e, ((double) motionEvent.getRawY()) - this.f) + this.g;
                this.e = motionEvent.getRawX();
                this.f = motionEvent.getRawY();
                return;
            }
            this.c++;
            this.g = Math.hypot(((double) motionEvent.getRawX()) - this.e, ((double) motionEvent.getRawY()) - this.f) + this.g;
            this.e = motionEvent.getRawX();
            this.f = motionEvent.getRawY();
            return;
        }
        this.a++;
        this.g = 0.0d;
        this.e = motionEvent.getRawX();
        this.f = motionEvent.getRawY();
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        this.j = motionEvent.getRawX();
        this.k = motionEvent.getRawY();
    }
}
