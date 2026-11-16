package io.p071bidmachine.ads.networks.gam.versions.v21_0_0;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.ads.networks.gam.j;
import io.p071bidmachine.ads.networks.gam.l;
import io.p071bidmachine.ads.networks.gam.m;
import io.p071bidmachine.utils.version.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public final int a;
    public final a b;
    public final /* synthetic */ int c;

    public b(int i, a aVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = aVar;
    }

    public final m a(j jVar, AdsFormat adsFormat, l lVar) {
        f fVar;
        f fVar2;
        f fVar3;
        switch (this.c) {
            case 0:
                int i = 0;
                switch (a.a[adsFormat.ordinal()]) {
                    case 1:
                    case 2:
                        fVar = new f(jVar, adsFormat, lVar, AdSize.BANNER, 0);
                        break;
                    case 3:
                        fVar = new f(jVar, adsFormat, lVar, AdSize.LEADERBOARD, 0);
                        break;
                    case 4:
                        fVar = new f(jVar, adsFormat, lVar, AdSize.MEDIUM_RECTANGLE, 0);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        return new h(jVar, adsFormat, lVar, i);
                    case 8:
                    case 9:
                    case 10:
                        return new j(jVar, adsFormat, lVar, i);
                    default:
                        return null;
                }
                return fVar;
            case 1:
                int i2 = 1;
                switch (io.p071bidmachine.ads.networks.gam.versions.v22_0_0.a.a[adsFormat.ordinal()]) {
                    case 1:
                    case 2:
                        fVar2 = new f(jVar, adsFormat, lVar, AdSize.BANNER, 1);
                        break;
                    case 3:
                        fVar2 = new f(jVar, adsFormat, lVar, AdSize.LEADERBOARD, 1);
                        break;
                    case 4:
                        fVar2 = new f(jVar, adsFormat, lVar, AdSize.MEDIUM_RECTANGLE, 1);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        return new h(jVar, adsFormat, lVar, i2);
                    case 8:
                    case 9:
                    case 10:
                        return new j(jVar, adsFormat, lVar, i2);
                    default:
                        return null;
                }
                return fVar2;
            default:
                int i3 = 2;
                switch (io.p071bidmachine.ads.networks.gam.versions.v23_0_0.a.a[adsFormat.ordinal()]) {
                    case 1:
                    case 2:
                        fVar3 = new f(jVar, adsFormat, lVar, AdSize.BANNER, 2);
                        break;
                    case 3:
                        fVar3 = new f(jVar, adsFormat, lVar, AdSize.LEADERBOARD, 2);
                        break;
                    case 4:
                        return new f(jVar, adsFormat, lVar, AdSize.MEDIUM_RECTANGLE, 2);
                    case 5:
                    case 6:
                    case 7:
                        return new h(jVar, adsFormat, lVar, i3);
                    case 8:
                    case 9:
                    case 10:
                        return new j(jVar, adsFormat, lVar, i3);
                    default:
                        return null;
                }
                return fVar3;
        }
    }

    public final a b() {
        switch (this.c) {
            case 0:
                VersionInfo version = MobileAds.getVersion();
                return new a(version.getMajorVersion(), version.getMinorVersion(), version.getMicroVersion());
            case 1:
                VersionInfo version2 = MobileAds.getVersion();
                return new a(version2.getMajorVersion(), version2.getMinorVersion(), version2.getMicroVersion());
            default:
                VersionInfo version3 = MobileAds.getVersion();
                return new a(version3.getMajorVersion(), version3.getMinorVersion(), version3.getMicroVersion());
        }
    }
}
