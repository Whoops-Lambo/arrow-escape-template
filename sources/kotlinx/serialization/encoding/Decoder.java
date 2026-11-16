package kotlinx.serialization.encoding;

import defpackage.hw;
import defpackage.ja2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface Decoder {
    boolean A();

    byte E();

    ja2 a();

    hw b(SerialDescriptor serialDescriptor);

    long i();

    short k();

    double l();

    char m();

    String o();

    int p(SerialDescriptor serialDescriptor);

    int s();

    Decoder u(SerialDescriptor serialDescriptor);

    float v();

    boolean x();

    default Object z(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.deserialize(this);
    }
}
