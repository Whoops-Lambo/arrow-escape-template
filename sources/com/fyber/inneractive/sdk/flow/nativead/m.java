package com.fyber.inneractive.sdk.flow.nativead;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g c;
    public final /* synthetic */ p d;

    public m(p pVar, i iVar, boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        this.d = pVar;
        this.a = iVar;
        this.b = z;
        this.c = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.click.o oVar;
        ArrayList arrayList;
        int size;
        int i;
        String str;
        p pVar = this.d;
        i iVar = this.a;
        boolean z = this.b;
        com.fyber.inneractive.sdk.util.g gVar = this.c;
        pVar.getClass();
        String str2 = iVar.a;
        String str3 = iVar.b;
        if (!v.a(str2)) {
            if (v.a(str3)) {
                oVar = new o(pVar, iVar, gVar);
                str2 = str3;
            } else {
                j jVar = (j) pVar.a;
                i iVar2 = jVar.a;
                if (iVar2 == null || iVar2 == iVar) {
                    IAlog.a("%s : No valid link object, origin: %s", j.d, gVar);
                } else {
                    p pVar2 = jVar.c;
                    pVar2.getClass();
                    com.fyber.inneractive.sdk.util.r.a.execute(new m(pVar2, iVar2, true, gVar));
                }
            }
            p pVar3 = this.d;
            i iVar3 = this.a;
            pVar3.getClass();
            arrayList = iVar3.c;
            size = arrayList.size();
            i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    z0.b(str);
                }
            }
        }
        oVar = new n(pVar, iVar, str3, gVar);
        k kVar = ((j) pVar.a).b;
        if (kVar != null) {
            kVar.a(str2, z, gVar, oVar);
        }
        p pVar4 = this.d;
        i iVar4 = this.a;
        pVar4.getClass();
        arrayList = iVar4.c;
        size = arrayList.size();
        i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            str = (String) obj2;
            if (!TextUtils.isEmpty(str)) {
                z0.b(str);
            }
        }
    }
}
