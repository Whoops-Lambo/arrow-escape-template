package com.inmobi.media;

import android.content.Context;
import defpackage.pv1;
import defpackage.s71;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class L5 {
    public final Context a;
    public final ArrayList b;
    public final int c;
    public final ExecutorService d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5)) {
            return false;
        }
        L5 l5 = (L5) obj;
        return s71.b(this.a, l5.a) && s71.b(this.b, l5.b) && this.c == l5.c && s71.b(this.d, l5.d);
    }

    public final int hashCode() {
        Context context = this.a;
        int iA = Hj.a(this.c, (this.b.hashCode() + Hj.a(1, pv1.c(context == null ? 0 : context.hashCode(), 31, -1930395051, 31), 31)) * 31, 31);
        ExecutorService executorService = this.d;
        return iA + (executorService != null ? executorService.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.a + ", name=com.im_11.4.1.db, version=1, tableInfos=" + this.b + ", journalMode=" + this.c + ", transactionExecutor=" + this.d + ")";
    }

    public L5(Context context, ArrayList arrayList, int i, ExecutorService executorService) {
        arrayList.getClass();
        this.a = context;
        this.b = arrayList;
        this.c = i;
        this.d = executorService;
    }
}
