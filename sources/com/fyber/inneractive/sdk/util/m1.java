package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Comparable {
    public final l1 a;
    public final Uri b;
    public final List c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.mPriority.compareTo(((m1) obj).a.mPriority);
    }

    public m1(l1 l1Var, Uri uri, List list) {
        this.a = l1Var;
        this.b = uri;
        this.c = list;
    }
}
