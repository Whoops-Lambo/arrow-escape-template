package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum at0 implements wh {
    /* JADX INFO: Fake field, exist only in values array */
    CATEGORY("Category"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE("Service");

    public final String a;

    @Override // defpackage.wh
    public final String getPrefix() {
        return this.a;
    }

    at0(String str) {
        this.a = str;
    }
}
