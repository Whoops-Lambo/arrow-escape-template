package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum en2 implements wh {
    /* JADX INFO: Fake field, exist only in values array */
    VENDOR("TCFVendor"),
    /* JADX INFO: Fake field, exist only in values array */
    STACK("TCFStack"),
    /* JADX INFO: Fake field, exist only in values array */
    SPECIAL_FEATURE("TCFSpecialFeature"),
    /* JADX INFO: Fake field, exist only in values array */
    PURPOSE("TCFPurpose"),
    /* JADX INFO: Fake field, exist only in values array */
    SPECIAL_PURPOSE("TCFSpecialPurpose"),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE("TCFFeature"),
    /* JADX INFO: Fake field, exist only in values array */
    AD_TECH_PROVIDER("AdTechProvider");

    public final String a;

    @Override // defpackage.wh
    public final String getPrefix() {
        return this.a;
    }

    en2(String str) {
        this.a = str;
    }
}
