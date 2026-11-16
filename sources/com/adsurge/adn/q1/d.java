package com.adsurge.adn.q1;

import android.os.SystemClock;
import android.widget.ImageView;
import com.adsurge.adn.Y0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class d implements c {
    public final c a;
    public final long b = SystemClock.elapsedRealtime();

    public d(c cVar) {
        this.a = cVar;
    }

    public final void a(String str, f fVar, long j) {
        int i;
        if (!fVar.a() && j > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
            if (fVar.g()) {
                i = 2130004;
            } else if (fVar.h()) {
                i = 2130003;
            } else {
                i = 2130001;
            }
            i iVar = new i(i);
            iVar.b(jElapsedRealtime);
            iVar.b((int) (fVar.d().length() / 1024));
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a("vu", str);
            iVar.a(dVar);
            com.adsurge.adn.w1.b.a(iVar);
        }
    }

    @Override // com.adsurge.adn.q1.c
    public void a(String str, ImageView imageView, f fVar) {
        a(str, fVar, this.b);
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(str, imageView, fVar);
        }
    }

    @Override // com.adsurge.adn.q1.c
    public void a(String str, int i, Exception exc) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(str, i, exc);
        }
    }
}
