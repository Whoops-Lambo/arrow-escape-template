package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ⅼ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1131 extends VideoAdListener implements InterfaceC0672 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1010 f3288;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0752 f3289;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final VideoAdListener f3290;

    public C1131(C1010 c1010, VideoAdListener videoAdListener, C0752 c0752) {
        this.f3288 = c1010;
        this.f3290 = videoAdListener;
        this.f3289 = c0752;
    }

    public final void onAdClicked() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("cwA17b9fN59MGiXtvnsh/UoHEOyTcjqwTgw1\n", "JWlRiNAeU9M=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdClicked();
        }
    }

    public final void onAdCustomEndCardFound() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("G4au3P6kESkknL7c/4AHSyKBi93SkAYRIoKP1/WmFBcpqaXM/4E=\n", "Te/KuZHldWU=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdCustomEndCardFound();
        }
    }

    public final void onAdDidReachEnd() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("MQxAzIydyJ4OFlDMjbne/AgLZc2ntciAAgRHwaayyA==\n", "Z2UkqePcrNI=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdDidReachEnd();
        }
    }

    public final void onAdDismissed(int i) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("aH4Qlu2kIPlXZACW7IA2m1F5NZfGjDfYV2QHluayLcFWRwac5Zchxk0=\n", "Phd084LlRLU=\n"), Integer.valueOf(i));
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed(i);
        }
    }

    public final void onAdExpired() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("lsU8KbOOah6p3ywpsqp8fK/CGSiZt347ssk8\n", "wKxYTNzPDlI=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdExpired();
        }
    }

    public final void onAdLoadFail(PlayerInfo playerInfo) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("Loy3SXgH0VMRlqdJeSPHMReLkkhbKdR7PoS6QA==\n", "eOXTLBdGtR8=\n"), playerInfo);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadFail(playerInfo);
        }
    }

    public final void onAdLoadSuccess() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("PMqpjz0+ACoD0LmPPBoWSAXNjI4eEAUCOdauiTcMFw==\n", "aqPN6lJ/ZGY=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadSuccess();
        }
    }

    public final void onAdSkipped() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("/0kyve59BF7AUyK971kSPMZOF7zSVwli2UUy\n", "qSBW2IE8YBI=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdSkipped();
        }
    }

    public final void onAdStarted() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("vcf8WL/dglWC3exYvvmUN4TA2VmD6Idrn8v8\n", "666YPdCc5hk=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdStarted();
        }
    }

    public final void onCustomCTACLick(boolean z) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("y6rgyL45Vx30sPDIvx1Bf/Ktx9iiDFw83pfF7p0RUDo=\n", "ncOErdF4M1E=\n"), Boolean.valueOf(z));
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTACLick(z);
        }
    }

    public final void onCustomCTALoadFail() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("E73VxHf2Whssp8XEdtJMeSq68tRrw1E6BoDw7XfWWhEkvd0=\n", "RdSxoRi3Plc=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTALoadFail();
        }
    }

    public final void onCustomCTAShow() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("wpiOpGqiyXv9gp6ka4bfGfufqbR2l8Ja16Wrkm2M2g==\n", "lPHqwQXjrTc=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTAShow();
        }
    }

    public final void onCustomEndCardClick(String str) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("H1voXOEYUi4gQfhc4DxETCZcz0z9LVkPDFzoeu8rUiElW+9S\n", "STKMOY5ZNmI=\n"), str);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardClick(str);
        }
    }

    public final void onCustomEndCardShow(String str) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("pAhi/vtLu/ybEnL++m+tnp0PRe7nfrDdtw9i2PV4u+OaDnE=\n", "8mEGm5QK37A=\n"), str);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardShow(str);
        }
    }

    public final void onDefaultEndCardClick(String str) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("iVsHq95xAvK2QRer31UUkLBcJ6vXURPSq3cNqvJRFNqcXgqt2g==\n", "3zJjzrEwZr4=\n"), str);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardClick(str);
        }
    }

    public final void onDefaultEndCardShow(String str) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("RWxbPRK3pbV6dks9E5Oz13xrez0bl7SVZ0BRPD6Xs51AbVAv\n", "EwU/WH32wfk=\n"), str);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardShow(str);
        }
    }

    public final void onEndCardClosed(Boolean bool) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("aWcDsMJXNR1WfROww3Mjf1BgIrvJVTAjW00Lut5zNQ==\n", "Pw5n1a0WUVE=\n"), bool);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onEndCardClosed(bool);
        }
    }

    public final void onEndCardLoadFail(Boolean bool) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("y3AYbsCOO2j0aghuwaotCvJ3OWXLjD5W+VUTasuJPk3x\n", "nRl8C6/PXyQ=\n"), bool);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadFail(bool);
        }
    }

    public final void onEndCardLoadSuccess(Boolean bool) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("BORW2/5Jr647/kbb/225zD3jd9D1S6qQNsFd3/VbvoEx6EHN\n", "Uo0yvpEIy+I=\n"), bool);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadSuccess(bool);
        }
    }

    public final void onEndCardSkipped(Boolean bool) {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("JIu+tIHs9REbka60gMjjcx2Mn7+K7vAvFrGxuJ7d9Dk=\n", "cuLa0e6tkV0=\n"), bool);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onEndCardSkipped(bool);
        }
    }

    public final void onLeaveApp() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("g69IKDvPrae8tVgoOuu7xbqoYCg1+KyqpbY=\n", "1cYsTVSOyes=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onLeaveApp();
        }
    }

    public final void onReplay() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("U4vNknhwRf5skd2SeVRTnGqM+5JnXUDL\n", "BeKp9xcxIbI=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onReplay();
        }
    }

    public final void onReplayFinish() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("GWotoz53oykmcD2jP1O1SyBtG6MhWqYcCWonryJe\n", "TwNJxlE2x2U=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onReplayFinish();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0672
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo359() {
        return this.f3290;
    }

    public final void onAdDismissed() {
        this.f3288.m519(this, this.f3289, StringFog.decrypt("fXURG3ajDTZCbwEbd4cbVERyNBpdixoXQm8GG30=\n", "Kxx1fhniaXo=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f3290;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed();
        }
    }
}
