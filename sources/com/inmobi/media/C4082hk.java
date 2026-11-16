package com.inmobi.media;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.hk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4082hk {
    public final C4167km a;
    public final double b;
    public final List c;

    public C4082hk(C4167km c4167km, double d, List list) {
        c4167km.getClass();
        list.getClass();
        this.a = c4167km;
        this.b = d;
        this.c = list;
    }

    public final boolean a(String str, Map map) {
        map.getClass();
        str.getClass();
        C4167km c4167km = this.a;
        if (c4167km.e && !c4167km.f.contains(str)) {
            return false;
        }
        if (!map.isEmpty() && str.equals("AssetDownloaded") && map.containsKey("assetType")) {
            if ("image".equals(map.get("assetType")) && !this.a.b) {
                C4111im c4111im = C4111im.a;
                return false;
            }
            if ("gif".equals(map.get("assetType")) && !this.a.c) {
                C4111im c4111im2 = C4111im.a;
                return false;
            }
            if ("video".equals(map.get("assetType")) && !this.a.d) {
                C4111im c4111im3 = C4111im.a;
                return false;
            }
            return true;
        }
        return true;
    }

    public final int a(String str) {
        str.getClass();
        if (!this.c.contains(str)) {
            return 1;
        }
        if (this.b < this.a.g) {
            C4111im c4111im = C4111im.a;
            return 2;
        }
        C4111im c4111im2 = C4111im.a;
        return 0;
    }
}
