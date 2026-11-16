package kotlinx.serialization.encoding;

import defpackage.iw;
import defpackage.ja2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface Encoder {
    void C();

    void F(char c);

    ja2 a();

    iw b(SerialDescriptor serialDescriptor);

    void f(byte b);

    void i(SerialDescriptor serialDescriptor, int i);

    Encoder j(SerialDescriptor serialDescriptor);

    void l(short s);

    void m(boolean z);

    void n(float f);

    void s(int i);

    void v(String str);

    void w(double d);

    void z(long j);

    default iw t(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return b(serialDescriptor);
    }

    default void y(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        kSerializer.serialize(this, obj);
    }
}
