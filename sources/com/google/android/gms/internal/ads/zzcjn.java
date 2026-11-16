package com.google.android.gms.internal.ads;

import defpackage.c34;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcjn {
    public long a;

    public final long a(ByteBuffer byteBuffer) {
        zzavo zzavoVar;
        zzavn zzavnVar;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            zzavj zzavjVar = new zzavj(new c34(byteBufferDuplicate), n.c);
            ArrayList arrayList = zzavjVar.f;
            List zziowVar = arrayList;
            if (zzavjVar.b != null && zzavjVar.c != zzioq.g) {
                zziowVar = arrayList;
                zziowVar = new zziow(arrayList, zzavjVar);
            }
            zziowVar = arrayList;
            Iterator it = zziowVar.iterator();
            while (true) {
                zzavoVar = null;
                if (!it.hasNext()) {
                    zzavnVar = null;
                    break;
                }
                zzavl zzavlVar = (zzavl) it.next();
                if (zzavlVar instanceof zzavn) {
                    zzavnVar = (zzavn) zzavlVar;
                    break;
                }
            }
            ArrayList arrayList2 = zzavnVar.f;
            List<zzavl> zziowVar2 = arrayList2;
            if (zzavnVar.b != null && zzavnVar.c != zzioq.g) {
                zziowVar2 = arrayList2;
                zziowVar2 = new zziow(arrayList2, zzavnVar);
            }
            zziowVar2 = arrayList2;
            for (zzavl zzavlVar2 : zziowVar2) {
                if (zzavlVar2 instanceof zzavo) {
                    zzavoVar = (zzavo) zzavlVar2;
                    break;
                }
            }
            long j2 = (zzavoVar.m * 1000) / zzavoVar.l;
            this.a = j2;
            return j2;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
