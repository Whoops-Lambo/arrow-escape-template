package com.vungle.ads.internal.downloader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static boolean a(c cVar) {
        cVar.getClass();
        if (cVar.b() == 1) {
            int iC = cVar.c();
            if (iC != -1 && iC != 408 && iC != 500) {
                switch (iC) {
                    case 502:
                    case 503:
                    case 504:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }
}
