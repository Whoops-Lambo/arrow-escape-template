package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class k0 {
    public static final j0 a = new j0();
    public static final j0 b;

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = j0Var;
    }
}
