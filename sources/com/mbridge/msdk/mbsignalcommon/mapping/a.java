package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Throwable {
    private Class<?> a;
    private String b;

    public void a(Class<?> cls) {
        this.a = cls;
    }

    public a(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() != null) {
            return getClass().getName() + ": " + getCause();
        }
        return super.toString();
    }

    public void a(String str) {
        this.b = str;
    }

    public a(Exception exc) {
        super(exc);
    }
}
