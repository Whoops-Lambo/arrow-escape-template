package com.fyber.inneractive.sdk.config.global;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements d {
    public final String a;
    public final boolean b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.a;
        if (str == null) {
            return false;
        }
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase("android");
        boolean z = this.b;
        return zEqualsIgnoreCase ? !z : z;
    }

    public final String toString() {
        return "os - " + this.a + " include: " + this.b;
    }

    public f(boolean z, String str) {
        this.a = str;
        this.b = z;
    }
}
