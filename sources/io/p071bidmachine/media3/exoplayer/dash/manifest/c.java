package io.p071bidmachine.media3.exoplayer.dash.manifest;

import android.net.Uri;
import com.facebook.internal.j0;
import io.p071bidmachine.media3.common.StreamKey;
import io.p071bidmachine.media3.common.t;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.offline.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements a {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final j0 i;
    public final t j;
    public final Uri k;
    public final i l;
    public final List m;

    public final h a(int i) {
        return (h) this.m.get(i);
    }

    public final long b(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((h) list.get(i)).b;
        } else {
            j = ((h) list.get(i + 1)).b;
            j2 = ((h) list.get(i)).b;
        }
        return j - j2;
    }

    @Override // io.p071bidmachine.media3.exoplayer.offline.a
    public final Object copy(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).a != i) {
                long jB = b(i);
                if (jB != -9223372036854775807L) {
                    j2 += jB;
                }
            } else {
                h hVarA = a(i);
                List list2 = hVarA.c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.b;
                    a aVar = (a) list2.get(i3);
                    List list3 = aVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(streamKey.c));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.a != i2) {
                            break;
                        }
                    } while (streamKey.b == i3);
                    j = j2;
                    arrayList2.add(new a(aVar.a, aVar.b, arrayList3, aVar.d, aVar.e, aVar.f));
                    if (streamKey.a != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new h(hVarA.a, hVarA.b - j, arrayList2, hVarA.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new c(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, i iVar, j0 j0Var, t tVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = iVar;
        this.i = j0Var;
        this.k = uri;
        this.j = tVar;
        this.m = arrayList;
    }

    public final long c(int i) {
        return x.L(b(i));
    }
}
