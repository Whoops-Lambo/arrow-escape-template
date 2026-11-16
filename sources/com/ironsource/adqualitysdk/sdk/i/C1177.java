package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﬧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1177 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f3483 = StringFog.decrypt("qvBFG2Iv2zW95n0/cDLRGrzn\n", "2ZUxVgNGtHQ=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f3482 = StringFog.decrypt("DUf/pP6/KA==\n", "QCaWy7/bW3w=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3481 = StringFog.decrypt("P+F8ZnmoYNQc82FoVq92\n", "coAVCTjME50=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f3480 = StringFog.decrypt("dhe27daH7qVSBavn+Ybv\n", "O3bfgpfjnek=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f3479 = StringFog.decrypt("1kr5FsKF4bzyWOQc7YTgufVf9QvlgPGV\n", "myuQeYPhkvA=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f3478 = StringFog.decrypt("d/1X0svkAihE/HTJ5usFIkDwZd4=\n", "NpkRp6eIcUs=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f3477 = StringFog.decrypt("phr5vMHITWm/Drz/wc9GNaMDs//hxWQyoAakstLERymNCaO41shWPg==\n", "zGrX0aChIkc=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f3476 = StringFog.decrypt("d8CaXOAAQhJb9ZNxwRVYAVbAjg==\n", "P7T3MKJhMXc=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f3475 = StringFog.decrypt("HaZtY8fcFf0Esiggx9seoRi/JyDuwRe/Nbcwa8L0HpIUoip4z8ED\n", "d9ZDDqa1etM=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f3483, new C1181(this));
        return map;
    }

    public C1177(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        return MaioAds.getSdkVersion();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        switch (str.hashCode()) {
            case -1799290762:
                if (str.equals(f3482)) {
                    return MaioAds.class;
                }
                return null;
            case -1455130644:
                if (str.equals(f3477)) {
                    return AdFullscreenActivity.class;
                }
                return null;
            case -1303622385:
                if (str.equals(f3479)) {
                    return MaioAdsListenerInterface.class;
                }
                return null;
            case -1069735125:
                if (str.equals(f3481)) {
                    return MaioAdsInstance.class;
                }
                return null;
            case -278703286:
                if (str.equals(f3480)) {
                    return MaioAdsListener.class;
                }
                return null;
            case 357386522:
                if (str.equals(f3476)) {
                    return HtmlBasedAdActivity.class;
                }
                return null;
            case 1819361677:
                if (str.equals(f3478)) {
                    return AdFullscreenActivity.class;
                }
                return null;
            case 1914325723:
                if (str.equals(f3475)) {
                    return HtmlBasedAdActivity.class;
                }
                return null;
            default:
                return null;
        }
    }
}
