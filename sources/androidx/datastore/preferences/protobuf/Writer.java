package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@CheckReturnValue
interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class FieldOrder {
        public static final FieldOrder a;
        public static final FieldOrder b;
        public static final /* synthetic */ FieldOrder[] c;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            a = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            b = fieldOrder2;
            c = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) c.clone();
        }
    }

    void A(int i, long j);

    void B(int i, List list, boolean z);

    void C(int i, List list, boolean z);

    void D(int i, Object obj, Schema schema);

    void E(int i, double d);

    void F(int i, List list, boolean z);

    FieldOrder G();

    void H(int i, List list, Schema schema);

    void I(int i, Object obj);

    void J(int i, long j);

    void K(int i, List list, boolean z);

    void L(int i, List list, boolean z);

    void M(int i, float f);

    void N(int i, int i2);

    void O(int i, List list, boolean z);

    void P(int i, int i2);

    void a(int i, List list, boolean z);

    void b(int i, Object obj);

    void c(int i, int i2);

    void d(int i, String str);

    void e(int i, long j);

    void f(int i, List list, boolean z);

    void g(int i, int i2);

    void h(int i, ByteString byteString);

    void i(int i, List list, boolean z);

    void j(int i, Object obj, Schema schema);

    void k(int i, List list, boolean z);

    void l(int i, long j);

    void m(int i, MapEntryLite.Metadata metadata, Map map);

    void n(int i, int i2);

    void o(int i, List list, boolean z);

    void p(int i, long j);

    void q(int i, boolean z);

    void r(int i, int i2);

    void s(int i);

    void t(int i, List list, boolean z);

    void u(int i);

    void v(int i, List list, boolean z);

    void w(int i, List list, boolean z);

    void x(int i, List list);

    void y(int i, List list);

    void z(int i, List list, Schema schema);
}
