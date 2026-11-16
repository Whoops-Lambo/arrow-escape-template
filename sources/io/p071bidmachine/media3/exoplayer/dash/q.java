package io.p071bidmachine.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.upstream.c;
import io.p071bidmachine.media3.extractor.metadata.dvbsi.b;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class q implements Handler.Callback {
    public final c a;
    public final e b;
    public io.p071bidmachine.media3.exoplayer.dash.manifest.c f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final TreeMap e = new TreeMap();
    public final Handler d = x.m(this);
    public final b c = new b(1);

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.i) {
            if (message.what != 1) {
                return false;
            }
            o oVar = (o) message.obj;
            long j = oVar.a;
            long j2 = oVar.b;
            Long lValueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(lValueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }

    public q(io.p071bidmachine.media3.exoplayer.dash.manifest.c cVar, e eVar, c cVar2) {
        this.f = cVar;
        this.b = eVar;
        this.a = cVar2;
    }
}
