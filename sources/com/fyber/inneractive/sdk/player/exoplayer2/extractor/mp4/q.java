package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import defpackage.pv1;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class q {
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public static UUID a(byte[] bArr) {
        Pair pairCreate;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        if (nVar.c < 32) {
            pairCreate = null;
        } else {
            nVar.e(0);
            if (nVar.b() == (nVar.c - nVar.b) + 4 && nVar.b() == c.V) {
                int iB = (nVar.b() >> 24) & 255;
                if (iB > 1) {
                    pv1.u(iB, "Unsupported pssh version: ", "PsshAtomUtil");
                } else {
                    UUID uuid = new UUID(nVar.g(), nVar.g());
                    if (iB == 1) {
                        nVar.e(nVar.b + (nVar.m() * 16));
                    }
                    int iM = nVar.m();
                    if (iM == nVar.c - nVar.b) {
                        byte[] bArr2 = new byte[iM];
                        nVar.a(bArr2, 0, iM);
                        pairCreate = Pair.create(uuid, bArr2);
                    }
                }
                pairCreate = null;
            } else {
                pairCreate = null;
            }
        }
        if (pairCreate == null) {
            return null;
        }
        return (UUID) pairCreate.first;
    }
}
