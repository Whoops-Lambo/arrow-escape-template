package com.adsurge.adn.p036k1;

import android.view.View;
import com.adsurge.adn.p011c0.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class k implements f {
    /* JADX WARN: Code duplicated, block: B:15:0x0019 A[PHI: r0
  0x0019: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:7:0x0009, B:10:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adsurge.adn.p011c0.f
    public void a(View view, int i) {
        if (view == null || i == 0) {
            return;
        }
        int i2 = 2;
        int i3 = 1;
        if (i != 1) {
            if (i != 2) {
                i2 = 8;
                i3 = 4;
                if (i != 4) {
                    if (i == 8) {
                        i2 = i3;
                    } else if (i != 10) {
                        return;
                    } else {
                        i2 = 0;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        com.adsurge.adn.x1.f.a(view, i2);
    }
}
