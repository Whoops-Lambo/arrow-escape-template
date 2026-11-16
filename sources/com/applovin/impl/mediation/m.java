package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.g3;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h.b b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(h.b bVar, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = bVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        h.b bVar = this.b;
        switch (i) {
            case 0:
                bVar.a((g3) obj3, (MaxReward) obj2, (Bundle) obj);
                break;
            default:
                bVar.a((Runnable) obj3, (MaxAdListener) obj2, (String) obj);
                break;
        }
    }
}
