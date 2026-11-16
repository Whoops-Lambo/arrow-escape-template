package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import defpackage.nj;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class s {
    public static boolean a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        if (nVar.c - nVar.b < 7) {
            if (z) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("too short header: " + (nVar.c - nVar.b));
        }
        if (nVar.j() != i) {
            if (z) {
                return false;
            }
            y.r(nj.m(i, new StringBuilder("expected header type ")));
            return false;
        }
        if (nVar.j() == 118 && nVar.j() == 111 && nVar.j() == 114 && nVar.j() == 98 && nVar.j() == 105 && nVar.j() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        y.r("expected characters 'vorbis'");
        return false;
    }

    public static r a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        a(1, nVar, false);
        nVar.e();
        int iJ = nVar.j();
        long jE = nVar.e();
        nVar.d();
        int iD = nVar.d();
        nVar.d();
        int iJ2 = nVar.j();
        int iPow = (int) Math.pow(2.0d, iJ2 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iJ2 & 240) >> 4);
        nVar.j();
        return new r(iJ, jE, iD, iPow, iPow2, Arrays.copyOf(nVar.a, nVar.c));
    }
}
