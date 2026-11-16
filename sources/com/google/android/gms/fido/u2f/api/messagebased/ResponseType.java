package com.google.android.gms.fido.u2f.api.messagebased;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public enum ResponseType {
    /* JADX INFO: Fake field, exist only in values array */
    REGISTER("u2f_register_response"),
    /* JADX INFO: Fake field, exist only in values array */
    SIGN("u2f_sign_response");

    public final String a;

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    ResponseType(String str) {
        this.a = str;
    }
}
