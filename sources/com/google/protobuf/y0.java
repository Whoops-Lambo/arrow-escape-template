package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class y0 implements Internal.MapAdapter.Converter {
    public final /* synthetic */ Internal.EnumLiteMap a;
    public final /* synthetic */ Internal.EnumLite b;

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doBackward(Object obj) {
        return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doForward(Object obj) {
        Internal.EnumLite enumLiteFindValueByNumber = this.a.findValueByNumber(((Integer) obj).intValue());
        return enumLiteFindValueByNumber == null ? this.b : enumLiteFindValueByNumber;
    }

    public y0(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.a = enumLiteMap;
        this.b = enumLite;
    }
}
