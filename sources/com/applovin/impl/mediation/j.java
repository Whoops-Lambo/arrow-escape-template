package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h.b b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(h.b bVar, Object obj, int i) {
        this.a = i;
        this.b = bVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        h.b bVar = this.b;
        switch (i) {
            case 0:
                bVar.j((Bundle) obj);
                break;
            case 1:
                bVar.e((Bundle) obj);
                break;
            case 2:
                bVar.i((Bundle) obj);
                break;
            case 3:
                bVar.a((Bundle) obj);
                break;
            case 4:
                bVar.f((Bundle) obj);
                break;
            case 5:
                bVar.g((Bundle) obj);
                break;
            case 6:
                bVar.h((Bundle) obj);
                break;
            case 7:
                bVar.d((Bundle) obj);
                break;
            case 8:
                bVar.c((Bundle) obj);
                break;
            case 9:
                bVar.b((Bundle) obj);
                break;
            default:
                bVar.a((MaxError) obj);
                break;
        }
    }
}
