package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.f0;
import defpackage.nj;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class m implements f0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ r c;

    public m(r rVar, String str, String str2) {
        this.c = rVar;
        this.a = str;
        this.b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        c cVar = (c) obj;
        if (this.c.f) {
            return;
        }
        if (exc != null) {
            r.a(this.c, null, this.a, this.b, exc);
            return;
        }
        if (cVar != null) {
            String str = this.a;
            if (cVar.a.size() > 1) {
                str = (String) nj.h(1, cVar.a);
            }
            b bVarA = this.c.a(str);
            int i = 0;
            if ((bVarA == null || bVarA.a == q.FAILED) && !TextUtils.isEmpty(cVar.b)) {
                r rVar = this.c;
                rVar.getClass();
                ArrayList arrayList = cVar.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    String str2 = (String) obj2;
                    if (!TextUtils.equals(str2, str)) {
                        rVar.g.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                r.a(this.c, cVar.b, str, this.b, null);
                return;
            }
            r rVar2 = this.c;
            rVar2.getClass();
            ArrayList arrayList2 = cVar.a;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                String str3 = (String) obj3;
                if (!TextUtils.equals(str3, str)) {
                    rVar2.g.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.c.g.size() == 0) {
                this.c.g.add(new j(str, false, q.INTERNAL_REDIRECT, null));
            }
            this.c.a(r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
