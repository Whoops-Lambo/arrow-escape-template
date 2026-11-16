package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.jh0;
import defpackage.kh0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.dp[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.dp[]) from 0x004e: CONSTRUCTOR (r0v1 com.inmobi.media.dp[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:81) call: kh0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.inmobi.media.dp, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC3975dp {
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_VIDEO("show"),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_VIDEO("hide"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
    /* JADX INFO: Fake field, exist only in values array */
    MUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    /* JADX INFO: Fake field, exist only in values array */
    UNMUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    /* JADX INFO: Fake field, exist only in values array */
    SKIP_VIDEO("skip");

    public static final /* synthetic */ jh0 c;
    public final String a;

    static {
        c = new kh0(enumC3975dpArr);
    }

    public static EnumC3975dp valueOf(String str) {
        return (EnumC3975dp) Enum.valueOf(EnumC3975dp.class, str);
    }

    public static EnumC3975dp[] values() {
        return (EnumC3975dp[]) b.clone();
    }

    public EnumC3975dp(String str) {
        super(str, i);
        this.a = str;
    }
}
