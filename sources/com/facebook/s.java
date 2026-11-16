package com.facebook;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements com.facebook.internal.x, io.p071bidmachine.utils.lazy.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ s(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.facebook.internal.x
    public void d(boolean z) {
        u.b(this.b, z);
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 1:
                return "Incorrect gradient type parameter - ".concat(str);
            case 2:
                return "Incorrect gradient direction parameter - ".concat(str);
            case 3:
                return "Animation duration don't found - ".concat(str);
            case 4:
                return "Not found animation effect name - ".concat(str);
            default:
                return "Unsupported animation effect - ".concat(str);
        }
    }
}
