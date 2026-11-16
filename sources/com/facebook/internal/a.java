package com.facebook.internal;

import android.content.Intent;
import defpackage.lz;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final com.facebook.appevents.n d = new com.facebook.appevents.n(3);
    public static a e;
    public final int a;
    public final UUID b;
    public Intent c;

    public final UUID a() {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public final int b() {
        if (lz.a.contains(this)) {
            return 0;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            lz.a(this, th);
            return 0;
        }
    }

    public final void c() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            d.B(this);
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void d(Intent intent) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            this.c = intent;
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public a(int i) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.a = i;
        this.b = uuidRandomUUID;
    }
}
