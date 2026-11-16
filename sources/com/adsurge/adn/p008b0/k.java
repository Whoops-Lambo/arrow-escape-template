package com.adsurge.adn.p008b0;

import com.adsurge.adn.Z.a;
import com.adsurge.adn.Z.c;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class k implements Runnable {
    public final String[] a;
    public int b;
    public int c;

    @Override // java.lang.Runnable
    public void run() {
        int i = this.b;
        if (i < 0 || this.c >= 3) {
            return;
        }
        String str = this.a[i];
        File file = new File(a.b(), str);
        if (file.exists()) {
            b bVar = new b(str, file);
            if (bVar.a() && !new j().a(bVar)) {
                int i2 = this.c + 1;
                this.c = i2;
                if (i2 >= 3) {
                    return;
                }
            }
        }
        int i3 = this.b - 1;
        this.b = i3;
        if (i3 >= 0) {
            c.a().postDelayed(this, 2000L);
        }
    }

    public k() {
        String[] list = a.b().list();
        this.a = list;
        if (list != null) {
            Arrays.sort(list);
            this.b = list.length - 1;
        } else {
            this.b = -1;
        }
    }
}
