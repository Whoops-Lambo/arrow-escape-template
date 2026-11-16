package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface hw {
    Object B(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    double C(SerialDescriptor serialDescriptor, int i);

    Object D(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    ja2 a();

    void c(SerialDescriptor serialDescriptor);

    Decoder e(ry1 ry1Var, int i);

    long f(SerialDescriptor serialDescriptor, int i);

    byte g(ry1 ry1Var, int i);

    int h(SerialDescriptor serialDescriptor, int i);

    String j(SerialDescriptor serialDescriptor, int i);

    short n(ry1 ry1Var, int i);

    char q(ry1 ry1Var, int i);

    int t(SerialDescriptor serialDescriptor);

    float w(SerialDescriptor serialDescriptor, int i);

    boolean y(SerialDescriptor serialDescriptor, int i);
}
