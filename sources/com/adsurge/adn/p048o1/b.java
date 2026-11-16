package com.adsurge.adn.p048o1;

import com.adsurge.adn.C1.n;
import com.adsurge.adn.F.d;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.lib.dysi.IGDTBiz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements IGDTBiz {
    public final d a;
    public final c b;
    public int c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AdSurgeAdFormat.values().length];
            b = iArr;
            try {
                iArr[AdSurgeAdFormat.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[AdSurgeAdFormat.APP_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[n.values().length];
            a = iArr2;
            try {
                iArr2[n.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[n.PREPARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[n.PLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[n.STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[n.PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[n.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[n.ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public final String a(n nVar) {
        if (nVar == null) {
            return "";
        }
        switch (a.a[nVar.ordinal()]) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "PREPARED";
            case 3:
                return "PLAY";
            case 4:
                return "STOP";
            case 5:
                return "PAUSE";
            case 6:
                return "END";
            case 7:
                return "ERROR";
            default:
                return "";
        }
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public boolean isOnViewAppearanceChangedEnable() {
        return (this.c & 64) != 0;
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public boolean isTimerTickEnable() {
        return (this.c & 1) != 0;
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onAdClickOpen(int i) {
        if ((this.c & 2048) == 0) {
            return;
        }
        f.b().a("event_onAdClickOpen", Integer.valueOf(i)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onAdClickPlayable(long j) {
        if ((this.c & 4096) == 0) {
            return;
        }
        f.b().a("event_onAdClickPlayable", Long.valueOf(j)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onAdClickReturn(int i) {
        if ((this.c & 1024) == 0) {
            return;
        }
        f.b().a("event_onAdClickReturn", Integer.valueOf(i)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onApkStartInstall(String str) {
        if ((this.c & 4) == 0) {
            return;
        }
        f.b().a("event_onApkStartInstall", str).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onAppInstall() {
        if ((this.c & 8192) == 0) {
            return;
        }
        f.b().a("event_onAppInstall", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onBizCustomEventTriggered(String str) {
        if ((this.c & 128) == 0) {
            return;
        }
        f.b().a("event_onBizCustomEventTriggered", str).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onGoAppStore(String str) {
        if ((this.c & 8) == 0) {
            return;
        }
        f.b().a("event_onGoAppStore", str).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onLandingPageClose() {
        if ((this.c & 2) == 0) {
            return;
        }
        f.b().a(IGDTBiz.KEY_GDTBIZ, "onLandingPageClose", new Object[0]).d().a("event_onLandingPageClose", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onLandingPageOpen() {
        if ((this.c & 2) == 0) {
            return;
        }
        f.b().a(IGDTBiz.KEY_GDTBIZ, "onLandingPageOpen", new Object[0]).d().a("event_onLandingPageOpen", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onNativeAdClick(int i) {
        if ((this.c & 16384) == 0) {
            return;
        }
        f.b().a("event_onNativeAdClick", Integer.valueOf(i)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onPageLoadEnd(String str) {
        if ((this.c & 256) == 0) {
            return;
        }
        f.b().a("event_onPageLoadEnd", str).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onPageLoadStart(String str) {
        if ((this.c & 256) == 0) {
            return;
        }
        f.b().a("event_onPageLoadStart", str).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onTimerTick(long j) {
        if ((this.c & 1) == 0) {
            return;
        }
        f.b().a(IGDTBiz.KEY_GDTBIZ, "onTimerTick", Long.valueOf(j)).d().a("event_onTimerTick", Long.valueOf(j)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onTimerTickPlus(long j, long j2) {
        if ((this.c & 512) == 0) {
            return;
        }
        f.b().a("event_onTimerTickPlus", Long.valueOf(j), Long.valueOf(j2)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onVideoLandingPageClicked() {
        if ((this.c & 16) == 0) {
            return;
        }
        f.b().a("event_onVideoLandingPageClicked", new Object[0]).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void setObserveFlag(int i) {
        this.c = i;
    }

    public b(d dVar, com.adsurge.adn.u1.c cVar, g gVar) {
        this.a = dVar;
        this.b = com.adsurge.adn.W.a.a(cVar, gVar);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onDialogDismiss(int i) {
        f.b().a(IGDTBiz.KEY_GDTBIZ, "onDialogDismiss", Integer.valueOf(i)).d().a("event_onDialogDismiss", Integer.valueOf(i)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onDialogShow(int i) {
        f.b().a(IGDTBiz.KEY_GDTBIZ, "onDialogShow", Integer.valueOf(i)).d().a("event_onDialogShow", Integer.valueOf(i)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onPlayStateChange(n nVar, int i) {
        String strA = a(nVar);
        f.b().a(IGDTBiz.KEY_GDTBIZ, "onPlayStateChange", strA, Integer.valueOf(i)).d().a("event_onPlayStateChange", strA, Integer.valueOf(i)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onReward(int i) {
        f.b().a(IGDTBiz.KEY_GDTBIZ, "onReward", Integer.valueOf(i)).d().a("event_onReward", Integer.valueOf(i)).c().a(this.a, this.b);
    }

    @Override // com.adsurge.adn.lib.dysi.IGDTBiz
    public void onViewAppearanceChanged(String str) {
        if (!isOnViewAppearanceChangedEnable()) {
            return;
        }
        f.b().a("event_onViewAppearanceChanged", str).c().a(this.a, this.b);
    }
}
