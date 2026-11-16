package io.p071bidmachine.iab.vast;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final /* synthetic */ a[] n;

    static {
        a aVar = new a("creativeView", 0);
        a = aVar;
        a aVar2 = new a("start", 1);
        b = aVar2;
        a aVar3 = new a("firstQuartile", 2);
        c = aVar3;
        a aVar4 = new a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, 3);
        d = aVar4;
        a aVar5 = new a("thirdQuartile", 4);
        e = aVar5;
        a aVar6 = new a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, 5);
        f = aVar6;
        a aVar7 = new a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, 6);
        g = aVar7;
        a aVar8 = new a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, 7);
        h = aVar8;
        a aVar9 = new a("skip", 8);
        i = aVar9;
        a aVar10 = new a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, 9);
        j = aVar10;
        a aVar11 = new a("rewind", 10);
        a aVar12 = new a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, 11);
        k = aVar12;
        a aVar13 = new a("fullscreen", 12);
        l = aVar13;
        a aVar14 = new a("expand", 13);
        a aVar15 = new a("collapse", 14);
        a aVar16 = new a("acceptInvitation", 15);
        a aVar17 = new a(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 16);
        m = aVar17;
        n = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) n.clone();
    }
}
