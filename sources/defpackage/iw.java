package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface iw {
    Encoder A(ry1 ry1Var, int i);

    void D(SerialDescriptor serialDescriptor, int i, float f);

    void E(int i, int i2, SerialDescriptor serialDescriptor);

    void G(ry1 ry1Var, int i, char c);

    void H(SerialDescriptor serialDescriptor, int i, double d);

    void c(SerialDescriptor serialDescriptor);

    void e(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void g(ry1 ry1Var, int i, byte b);

    void h(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void p(SerialDescriptor serialDescriptor, int i, boolean z);

    void q(SerialDescriptor serialDescriptor, int i, String str);

    void u(SerialDescriptor serialDescriptor, int i, long j);

    void x(ry1 ry1Var, int i, short s);

    default boolean B(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }
}
