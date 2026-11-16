package com.vungle.ads.internal.util;

import android.content.Intent;
import defpackage.s71;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public final WeakReference a;
    public final Intent b;
    public final Intent c;
    public final com.vungle.ads.internal.ui.m d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s71.b(this.a, cVar.a) && s71.b(this.b, cVar.b) && s71.b(this.c, cVar.c) && s71.b(this.d, cVar.d);
    }

    public final com.vungle.ads.internal.ui.m a() {
        return this.d;
    }

    public final WeakReference b() {
        return this.a;
    }

    public final Intent c() {
        return this.b;
    }

    public final Intent d() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Intent intent = this.b;
        int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        Intent intent2 = this.c;
        int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
        com.vungle.ads.internal.ui.m mVar = this.d;
        return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("TargetActivityInfo(context=");
        sbA.append(this.a);
        sbA.append(", deepLinkOverrideIntent=");
        sbA.append(this.b);
        sbA.append(", defaultIntent=");
        sbA.append(this.c);
        sbA.append(", adOpenCallback=");
        sbA.append(this.d);
        sbA.append(')');
        return sbA.toString();
    }

    public c(WeakReference weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        weakReference.getClass();
        this.a = weakReference;
        this.b = intent;
        this.c = intent2;
        this.d = mVar;
    }
}
